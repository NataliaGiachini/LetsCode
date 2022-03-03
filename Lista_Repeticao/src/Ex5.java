import java.util.Scanner;

public class Ex5 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int numreceb;
        int soma = 0;

        for (int x = 1; x <=10 ; x++){
            System.out.println("informe um numero:");
            numreceb = scanner.nextInt();
            soma = soma + numreceb;
        }
        System.out.println("A soma total dos numeros digitados é:"+soma);
    }
}
