import java.util.Scanner;
//3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[4];
        double media = 0;

        for (int x = 0; x < notas.length; x++) {
            System.out.println("digite uma nota:");
            notas[x] = scanner.nextInt();
        }
        System.out.println("Numeros digitados:");
        for (int x = 0; x < notas.length; x++) {
            System.out.println("é:" + notas[x]);
        }
        for (int x = 0; x < notas.length; x++) {
           media = media+notas[x];

        }

        System.out.println("a média é:"+media/4);
    }
}