import java.util.Scanner;

public class Ex11 {
//11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
//maiores do que 8.
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        int numMaior = 0;

        for (int x=1; x<=20; x++){
            System.out.println("Digite um numero:");
            num = scanner.nextInt();

            if (num > 8){
                numMaior = numMaior +1;
            }
        }
        System.out.println("Quantidade de numeros maiores que 8 é:"+numMaior);

    }
}
