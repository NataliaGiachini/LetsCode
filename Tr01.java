import java.util.Scanner;
//Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.
public class Tr01 {

        public static void main(String[] args) {
            Scanner scaner = new Scanner(System.in);
            int [][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
            int valor=0;
            int soma=0;

            for (int i=0;i<4;i++){
                for (int j=0;j<4;j++){
                    valor = matriz [i][j];
                    if (valor > 9){
                        soma = soma+1;
                    }

                }
            }
            System.out.println("numeros maiores que 10:  "+soma);
        }
    }

