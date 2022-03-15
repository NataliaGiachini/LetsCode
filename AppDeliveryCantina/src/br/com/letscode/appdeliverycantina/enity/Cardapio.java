package br.com.letscode.appdeliverycantina.enity;

import br.com.letscode.appdeliverycantina.enums.Produtos;

public class Cardapio {

    String[] cardapio = new String[6];
    private Produtos produtos;

    final double vBurguer = 30;
    final double vPizza = 45;
    final double vFogazza = 20;
    final double vPasta = 30;
    final double vLasanha = 70;
    final double vPolpetone = 50;

    public void produto() {
        String[] lanches = {

                produtos.BURGUER.getDescricao() + "  - R$ 30,00",
                produtos.PIZZA.getDescricao() + "    - R$ 45,00 ",
                produtos.FOGAZZA.getDescricao() + "  - R$ 20,00",
                produtos.PASTA.getDescricao() +   "    - R$ 30,00",
                produtos.LASANHA.getDescricao() +  "  - R$ 70,00",
                produtos.POLPETONE.getDescricao() +" - R$ 50,00",
        };


        System.out.println();
        System.out.println("»»»»»» CARDÁPIO ««««««");
        System.out.println();
        System.out.println("═══ Lanches ═══");
        System.out.println();
        System.out.println(cardapio[0]);
        System.out.println(cardapio[1]);
        System.out.println(cardapio[2]);
        System.out.println();
        System.out.println("═══ Comidas ═══");
        System.out.println();
        System.out.println(cardapio[3]);
        System.out.println(cardapio[4]);
        System.out.println(cardapio[5]);
        System.out.println();
    }

}
