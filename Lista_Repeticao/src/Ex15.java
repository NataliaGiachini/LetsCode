import java.util.Scanner;

public class Ex15 {
    //15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a
    //soma desses números. Encerre a execução quando um número negativo for digitado.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num=0;
        double soma=0;
        int num2;

                while (num >= 0){
                System.out.println("digite um numero:");
                num= scanner.nextInt();
                soma=soma+num;
        }
            System.out.println("O numero inserido é negativo!"+soma);
    }
}
