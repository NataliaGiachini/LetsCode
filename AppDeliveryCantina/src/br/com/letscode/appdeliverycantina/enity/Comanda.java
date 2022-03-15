package br.com.letscode.appdeliverycantina.enity;

import br.com.letscode.appdeliverycantina.enums.Produtos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Comanda extends Cardapio implements ICalcularEntrega{

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> Pedidos = new ArrayList<String>();
    ArrayList<Double> valorPedido = new ArrayList<Double>();
    ArrayList<Double> valorTotal = new ArrayList<Double>();


    private int opcardapio = 0;
    private String oplanche, opcomida;
    private int nPedido = random.nextInt(100);
    private  String nomeCliente;
    private double soma = 0;
    private double somat = 0;
    private int taxa;


    public String getOplanche() {
        return oplanche;
    }

    public void setOplanche(String oplanche) {
        this.oplanche = oplanche;
    }

    public String getOpcomida() {
        return opcomida;
    }

    public void setOpcomida(String opcomida) {
        this.opcomida = opcomida;
    }

    public void escolhendoPedido() {

        System.out.println("********   CARDAPIO   ********");
        System.out.println("\n==========================================");
        System.out.println("\nLanches\n" +
                "·   \tBurguer - $30\n" +
                "·   \tPizza - $45\n" +
                "·   \tFogazza  -$20\n" +
                "Comida\n" +
                "·   \tPasta - $30\n" +
                "·   \tLasanha - $70\n" +
                "·   \tPolpetone -  $50\n" +
                "Bebidas\n" +
                "·   \tRefrigerante- $5\n" +
                "·   \tSuco - $7\n" +
                "·   \tVinho -  $50\n");

        System.out.println("\n==========================================\n");

            //criaçao comanda
            System.out.println("Nome do cliente:");
            nomeCliente = scanner.next();
            System.out.println("Numero da comanda:"+nPedido);


            // laço repetição menu
            do {
                System.out.println("\nEscolha sua opção: 1 - Lanche | 2 - Comida | 3 - Fechar Comanda");
                opcardapio = scanner.nextInt();

                switch (opcardapio) {
                    case 1:
                        do {
                            System.out.println("\nDigite o nome do Lanche:");
                            System.out.println("* " + Produtos.BURGUER.getDescricao());
                            System.out.println("* " + Produtos.PIZZA.getDescricao());
                            System.out.println("* " + Produtos.FOGAZZA.getDescricao());
                            System.out.println("* Finalizar pedido de lanche? - Sim");
                            this.setOplanche(scanner.next());

                            switch (this.oplanche.toLowerCase()) {

                                case "burguer":
                                    Pedidos.add(String.valueOf(this.getOplanche()));
                                    taxa = 1;
                                    valorPedido.add(vBurguer);
                                    valorTotal.add((double) taxa);
                                    System.out.println("Item adicionado");
                                    break;
                                case "pizza":
                                    Pedidos.add(String.valueOf(this.getOplanche()));
                                    taxa = 1;
                                    valorPedido.add(vPizza);
                                    valorTotal.add((double) taxa);
                                    System.out.println("Item adicionado");
                                    break;
                                case "fogazza":
                                    Pedidos.add(String.valueOf(this.getOplanche()));
                                    taxa = 1;
                                    valorPedido.add(vFogazza);
                                    valorTotal.add((double) taxa);
                                    System.out.println("Item adicionado");
                                    break;
                                case "sim":
                                    System.out.println("Pedido de lanche finalizado");
                                    break;
                                default:
                                    System.out.println("operacao invalida para lanches");
                            } // fecha switch op lanche
                        } while (!oplanche.equalsIgnoreCase("Sim"));

                        break; // break case 1
                    case 2:
                        do {
                            System.out.println("\nDigite uma opção de Comida:");
                            System.out.println("* " + Produtos.PASTA.getDescricao());
                            System.out.println("* " + Produtos.LASANHA.getDescricao());
                            System.out.println("* " + Produtos.POLPETONE.getDescricao());
                            System.out.println("Finalizar pedido de comida? - Sim");
                            this.setOpcomida(scanner.next());

                            switch (this.opcomida.toLowerCase()) {
                                case "pasta":
                                    Pedidos.add(String.valueOf(this.getOpcomida()));
                                    taxa = 2;
                                    valorPedido.add(vPasta);
                                    valorTotal.add((double) taxa);
                                    System.out.println("Item adicionado");
                                    break;
                                case "lasanha":
                                    Pedidos.add(String.valueOf(this.getOpcomida()));
                                    taxa = 2;
                                    valorPedido.add(vLasanha);
                                    valorTotal.add((double) taxa);
                                    System.out.println("Item adicionado");
                                    break;
                                case "polpetone":
                                    Pedidos.add(String.valueOf(this.getOpcomida()));
                                    taxa = 2;
                                    valorPedido.add(vPolpetone);
                                    valorTotal.add((double) taxa);
                                    System.out.println("Item adicionado");
                                    break;
                                case "sim":
                                    System.out.println("Finalizado pedido de comida");
                                    break;
                                default:
                                    System.out.println("operacao invalida para comida");
                            } // fecha switch comida
                        } while (!opcomida.equalsIgnoreCase("Sim"));

                        break; //case 2

                    case 3:
                        System.out.println("Finalizado Pedido !");
                        break; //break case 3

                    default:
                        System.out.println("operacao invalida para cardapío");
                } //fecha switch cardapio geral

            } while (opcardapio != 3);

            System.out.println("\n===========================================");
            System.out.println("***               COMANDA               ***");
            System.out.println("===========================================");
            System.out.println("\nCliente:  " +nomeCliente);
            System.out.println("\nNumero da comanda:  "+nPedido);
            System.out.println("\n===========================================");
            System.out.println("***                ITENS                ***");
            System.out.println("===========================================");


            for (int x = 0; x < Pedidos.size(); x++) {
                System.out.println("\n "+ Pedidos.get(x)+" - "+valorPedido.get(x));
                soma = soma + valorPedido.get(x);
            }
             for (int y = 0; y < Pedidos.size(); y++) {
                 valorTotal.get(y);
                 somat = somat + valorTotal.get(y);
             }

             double somaf = soma+somat;

             System.out.println("\n===========================================");
             System.out.println("\nTaxa de entrega: "+somat);
             System.out.println("\nValor Total: "+somaf);


        }

    @Override
    public void taxaEntrega(String tipoRefeicao) {

    }
}
