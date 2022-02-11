import java.util.Scanner;

public class Ex14 {
    //14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
    //100, quantos estão entre 101 e 200 e quantos são maiores de 200.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int num1=0;
        int num2=0;
        int numMaior=0;

        for (int x=1;x<=10;x++){
            System.out.println("Digite um numero");
            num = scanner.nextInt();

            if (num<=100){
                num1++;
            }
            if (num > 100 && num <= 200){
                num2++;
            }
            if (num > 200){
                numMaior++;
            }
        }
        System.out.println("Quantidade de numeros entre 0 e 100 é:"+num1);
        System.out.println("Quantidade de numeros entre 101 e 200 é:"+num2);
        System.out.println("Quantidade de numeros maior que 200 é:"+numMaior);

    }
}
