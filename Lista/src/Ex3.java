import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args){

        String nome;
        int x = 1;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Escreva seu nome:");
        nome = scanner.next();

       for (; x < 10; x++){
           System.out.println(nome);
       }
    }
}
