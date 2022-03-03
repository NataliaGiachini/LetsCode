import java.util.Scanner;

public class MainLivro {

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Titulo do livro:");
        livro1.titulo = scanner.next();

        System.out.println("Nome do leitor:");
        livro1.nomeLeitor = scanner.next();

        System.out.println("Quantidade total de paginas:");
        livro1.qntPagtotal = scanner.nextDouble();

        System.out.println("Quantidade de paginas lidas:");
        livro1.qntPagLidas = scanner.nextDouble();

        livro1.porcentagemLida(livro1.porcentagem);
        System.out.println("\n Porcentagem do livro lida: " + livro1.porcentagem);

    }
}
