import java.util.Scanner;

public class Ex13 {

    //13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
    //100.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int numEntre=0;

        for(int x=1; x<=20; x++){
            System.out.println("Digite um numero");
            num = scanner.nextInt();

            if(num <= 100){
                numEntre++;
            }
        }
        System.out.println("Quantidade de numeros entre 0 e 100 é:"+numEntre);
    }
}
