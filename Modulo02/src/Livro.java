public class Livro {
    String titulo;
    String nomeLeitor;
    double qntPagtotal;
    double qntPagLidas;
    double porcentagem;

    void porcentagemLida (double valor){
        this.porcentagem = qntPagLidas / qntPagtotal;
    }
}
