package br.com.letscode.appdeliverycantina;
import br.com.letscode.appdeliverycantina.enity.Cardapio;
import br.com.letscode.appdeliverycantina.enity.Comanda;
import java.util.Random;
import java.util.Scanner;

public class DeliveryCantinaApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Cardapio cardapio = new Cardapio();
        Comanda comanda = new Comanda();

        //Bem vindo
        System.out.println("\n=========================================================================");
        System.out.println("\n****    \tSeja bem Vindo à Cantina Codifichiamo!\t    ****");
        System.out.println("\n=========================================================================\n");
        // menu cardapio


        comanda.escolhendoPedido();


        System.out.println("\n=========================================================================\n");
        System.out.println(".                                   Obrigado pelo pedido – Conte conosco!");

    }
}

