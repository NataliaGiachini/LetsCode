import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        String nome;
        int num;
        int x = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um nome:");
        nome = scanner.next();
        System.out.println("Digite um numero:");
        num = scanner.nextInt();

        for (; x < num; x++) {
            System.out.println(nome);
        }

    }
}
