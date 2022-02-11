import java.util.Scanner;

public class Ex2 {
//Faça   um   Programa   que   leia   um   vetor   de   10   números   reais   e   mostre-os   na   ordem inversa.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] num = new int [10];

        for (int x=0; x < num.length; x++){
            System.out.println("Digite um numero:");
            num[x] = scanner.nextInt();
        }
        System.out.println("os numeros digitados:");
        for (int x = num.length-1; x >= 0; x--){
            System.out.println(num[x]);

        }
    }
}
