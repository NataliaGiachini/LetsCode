import java.util.Random;
import java.util.Scanner;

public class Tr08 {
//Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao acima da  ̃
//diagonal principal.
    public static void main(String[] args) {
    int [][] Matriz = {{1,2,3,},{5,6,7},{9,10,11}};
    int soma=0;

    soma = Matriz[0][1] + Matriz[0][2] + Matriz[1][2];
        System.out.println(" A soma dos numeros acima da diagonal principal é: "+soma);

    }

}
