import java.util.Random;

public class Tr09 {
    //9. Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao abaixo da  ̃
    //diagonal principal.

    public static void main(String[] args) {
            int [][] Matriz = {{1,2,3,},{5,6,7},{9,10,11}};
            int soma=0;

            soma = Matriz[1][0] + Matriz[2][0] + Matriz[2][1];
            System.out.println(" A soma dos numeros abaixo da diagonal principal é: "+soma);

        }

    }


