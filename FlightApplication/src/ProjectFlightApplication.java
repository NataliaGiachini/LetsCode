import enity.FlightsList;

import java.util.LinkedList;
import java.util.List;

public class ProjectFlightApplication {

    public static void main(String[] args) {

        // subir csv (leitura de arquivo) readalllines
        // map para conversao de string para obj


        //1 arq. ler, converter, calcular a dif horarios, e ordenar.


    // conversao da lista
    FlightsList flightsList = new FlightsList("MEL-Austrália" , "GRU-Brasil", "Gol Airlines",
            "21/04/2022 06:00:00 (+01:00)", "22/04/2022 02:00:00 (+04:00)",3758.00);


//              String[] voos = ("MEL-Austrália;GRU-Brasil;Gol Airlines;21/04/2022 06:00:00 (+01:00);22/04/2022 02:00:00 " +
//                "(+04:00);3758.00").split(";");
//
//        for (String linhaVoo : voos) {
//            new FlightsList(voos[0], voos[1], voos[2], voos[3], voos[4], Double.parseDouble(voos[5]));
//        }


    // entender se é 1 unica vez ou 1 para cada

    // filtro na lista (agrupar voos)

    // agrupar e ordenar por tempo de voo (crescente)
    // agrupar por preço crescente
    // nome da companhia (crescente) Criar 2 arquivos de saída:

        //1 contendo toda a relação de voos mantendo as colunas originais e incluindo uma nova coluna contendo o tempo do voo (manter ordenação acima)
        //1 contendo um resumo de informações:
        //voo mais rapido por origem/destino
        //voo mais longo por origem/destino
        //voo mais barato por origem/destino
        //tempo médio de voo origem/destino
        //preço médio por origem/destino




        System.out.println(flightsList);
        System.out.println(flightsList.getDuraçao());

    }
}


