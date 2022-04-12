import enity.Flights;
import enity.Information;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ProjectFlightApplication {

    public static void main(String[] args) throws IOException {

        // declaração
        String linha;
        String [] linhasSeparada;
        // LISTA PRINCIPAL ARQUVO 1
        List<Flights> listaVoos = new ArrayList<>();

        // subindo o arquivo .CSV (getabsolute = retorna o caminho absoluto do arquivo)
        String caminhoArq = new File("flights.csv").getAbsolutePath();
        File arquivoLista = new File(caminhoArq);
        //lendo o arquivo
        FileReader leituraArq = new FileReader(arquivoLista);
        BufferedReader leitor = new BufferedReader(leituraArq);

        //leitura do cabeçario
        leitor.readLine();
        //faz a leitura enquanto nao estiver vazio
        while ((linha = leitor.readLine()) != null) {

            // separando o texto por ;
            linhasSeparada = linha.split(";");

            // passando a informação no array
            Flights voo1 = new Flights(
                    linhasSeparada[0],
                    linhasSeparada[1],
                    linhasSeparada[2],
                    linhasSeparada[3],
                    linhasSeparada[4],
                    Double.parseDouble(linhasSeparada[5])
            );
            // adc no array listaVoos
            listaVoos.add(voo1);
        } // fim do laço de repetição.

        //criando a função para escrita do arquivo
        File saida = new File("Saída1.csv");
        FileWriter escreverArq = new FileWriter(saida);

        //escrevendo o cabeçario
        escreverArq.write("origin;destination;airline;departure;arrival;price;time \n");

        // escrevendo o primeiro arquivo
        listaVoos.stream()
                .map(item -> item.formatoCSV())
                .forEach(item -> {
                    try {
                        escreverArq.write(item);
                    } catch (IOException exception) {
                        System.out.println(exception.getMessage());
                    }
                });

        // mapeando os dados e coletando as dois itens para comparação.
        Map<String, Map<String, List<Flights>>> mapeamento = listaVoos.stream()
                .collect(Collectors.groupingBy(Flights :: getAeroportoOrigem, Collectors.groupingBy(Flights :: getAeroportoDestino)));

        // LISTA PRINCIPAL ARQUVO 2
        List <Information> informacoes = new ArrayList<>();

        // itens para comparar , agrupar e separar
        for (Map.Entry<String, Map<String, List<Flights>>> origens : mapeamento.entrySet()){
            for (Map.Entry<String, List<Flights>> destinos : origens.getValue().entrySet()){

                // array para pegar os dados de compração
                List <Flights> voosAgrupados = destinos.getValue();
                OptionalDouble curto = voosAgrupados.stream().mapToDouble(item -> item.getDuracao()).min();
                OptionalDouble longo = voosAgrupados.stream().mapToDouble(item -> item.getDuracao()).max();
                OptionalDouble barato = voosAgrupados.stream().mapToDouble(item -> item.getValorVoo()).min();
                OptionalDouble caro = voosAgrupados.stream().mapToDouble(item -> item.getValorVoo()).max();
                OptionalDouble medioVoo = voosAgrupados.stream().mapToDouble(item -> item.getDuracao()).average();
                OptionalDouble precoMedio = voosAgrupados.stream().mapToDouble(Flights::getValorVoo).average();

                // colhendo os dados coletados
                Information informacao = new Information(
                        origens.getKey(),
                        destinos.getKey(),
                        curto.getAsDouble(),
                        longo.getAsDouble(),
                        barato.getAsDouble(),
                        caro.getAsDouble(),
                        medioVoo.getAsDouble(),
                        precoMedio.getAsDouble()

                );
                // adc no array Informações
                informacoes.add(informacao);
            }
        }
        // fechando o primeiro arquivo
        escreverArq.close();

        //criando a função para escrita do arquivo
        File saida2 = new File("Saída2.csv");
        FileWriter escreverArq2 = new FileWriter(saida2);

        //escrevendo o cabeçario
        escreverArq2.write("origin;destination;shortest_flight(h);longest_fight(h);cheapest_flight;most_expensive_flight;average_time;average_price \n");

        //escrevendo o arquivo
        informacoes.stream()
                .map(item -> item.formatoCSV())
                .forEach(item -> {
                    try {
                        escreverArq2.write(item);
                    } catch (IOException exception) {
                        System.out.println(exception.getMessage());
                    }
                });

        //fechando o arquivo
        escreverArq2.close();

    }
}


