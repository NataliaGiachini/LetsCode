import java.util.Random;
import java.util.Scanner;

public class Tr05 {
    //Leia uma matriz 5 x 5. Leia tambem um valor  ́ X. O programa devera fazer uma busca  ́
//desse valor na matriz e, ao final, escrever a localizac ̧ao (linha e coluna) ou uma mensa-  ̃
//gem de “nao encontrado”.
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

       // int[][] Matriz = new int[5][5];
        int [][] Matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int valorX;
        int valorZ = 1;
        int locall = 0;
        int localc = 0;

//        for (int l = 0; l < Matriz.length; l++) {
//            for (int c = 0; c < Matriz.length; c++) {
//                Matriz[l][c] = random.nextInt(100);
//            }

        System.out.println("Digite um numero: ");
        valorX = scanner.nextInt();

        for (int x = 0; x < Matriz.length; x++) {
            for (int z = 0; z < Matriz.length; z++) {
                System.out.print(Matriz[x][z] + " ");
                if (valorX == Matriz[x][z]) {
                    valorZ = Matriz[x][z];
                    locall = x;
                    localc = z;
                }
            }
            System.out.println("");
        }
        if (valorZ != valorX) {
            System.out.println("\nNumero nao encontrado!!!\n ");
        }

            System.out.println("Numero procurado:" + valorX);
            System.out.println("Linha: "+locall);
            System.out.println("coluna: "+ localc);


    }
}
