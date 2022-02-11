import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
//Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        for (int x=0; x< num.length; x++){
            System.out.println("Digite um numero:");
            num[x] = scanner.nextInt();
        }
        for (int recebe: num){
            System.out.println("Numero digitado:" +recebe);
        }
    }
}
