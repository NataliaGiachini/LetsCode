import java.util.Random;

public class Tr13 {

    //Gere matriz 4 x 4 com valores no intervalo [1, 20]. Escreva um programa que transforme
    //a matriz gerada numa matriz triangular inferior, ou seja, atribuindo zero a todos os ele-
    //mentos acima da diagonal principal. Imprima a matriz original e a matriz transformada.


    public static void main(String[] args) {
        int[][] Matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};


        for (int x = 0; x < 4; x++) {
            for (int z = 0; z < 4; z++) {
                System.out.printf("%5d ", Matriz[x][z]);
            }
            System.out.println("");

        }
        System.out.println("");
        for (int x = 0; x < 4; x++) {
            for (int z = 0; z < 4; z++) {
                if ((x == 0) && (z != 0)) {
                    Matriz[x][z] = 0;
                } else if ((x == 1) && (z != 0) && (z != 1)) {
                    Matriz[x][z] = 0;
                } else if ((x == 2) && (z == 3)) {
                    Matriz[x][z] = 0;
                }
                    System.out.printf("%5d ", Matriz[x][z]);
                }
                System.out.println("");
            }

        }
    }




