import java.util.Scanner;

public class Ex7 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int idade ;
        int soma = 0;

        for (int x = 1; x <=20 ; x++){
            System.out.println("digite sua idade:");
            idade = scanner.nextInt();
            soma = soma + idade;
        }
        System.out.println("A média das idades digitadas é:"+soma/20);
    }

}
