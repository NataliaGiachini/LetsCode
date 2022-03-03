import java.util.Scanner;

public class Ex12 {
    //12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
    //pares
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        int numPares=0;

        for (int x=1;x<=20;x++){
            System.out.println("Digite um numero");
            num = scanner.nextInt();

            if (num %2 == 0){
                numPares++;
            }
        }
        System.out.println("Quantidade de numeros pares:"+numPares);
    }
}
