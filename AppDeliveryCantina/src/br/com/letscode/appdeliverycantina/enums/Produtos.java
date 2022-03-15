package br.com.letscode.appdeliverycantina.enums;

public enum Produtos {
    BURGUER ("Burguer - $30"),
    PIZZA ("Pizza - $45"),
    FOGAZZA("Fogazza - $20"),
    PASTA("Pasta - $30"),
    LASANHA("Lasanha - $70"),
    POLPETONE("Polpetone - $50");

    private String descricao;

    Produtos(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
