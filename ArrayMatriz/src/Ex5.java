import java.util.Scanner;

public class Ex5 {
    // Faça   um   Programa   que   leia   20   números   inteiros   e   armazene-os   num   vetor.
    // Armazene os  números  pares no  vetor  PAR  e os  números ÍMPARES no  vetor  ímpar. Imprima os três vetores.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num=0;
        int p=0;
        int im=0;
        int i=0;
        int tamanho =20;

        int[] vlido = new int[tamanho];
        int[] vpar = new int[tamanho];
       int[] vimpar = new int[tamanho];


        for (i = 0; i < vlido.length; i++) {

            System.out.println("digite um n "+ i);
                 vlido[i] = scanner.nextInt();
            if ((vlido[i] % 2) == 0){
                vpar[i] = vlido[i];
                p++;
            }//fim if

            if (vlido[i] % 2 !=0){
                vimpar[i] = vlido [i];
                im++;
            }
        }

        System.out.println(" Quantidade de numeros pares: " + p);
        System.out.println(" Qantidade de numeros impares: " + im);


    }
}
