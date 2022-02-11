public class Tr07 {
//Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos sao da forma:  ̃
//A[i][j] = 2i + 7j − 2 se i < j;
//A[i][j] = 3i
//2 − 1 se i = j;
//A[i][j] = 4i
//3 − 5j
//2 + 1 se i > j.
    public static void main(String[] args) {
        int[][] Matriz = new int[10][10];


        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                if (i < j) {
                    Matriz[i][j] = 2 * 1 + 7 * j - 2;
                } else if (i > j) {
                    Matriz[i][j] = (4 * ((int) Math.pow(i, 3)) - (5 * (int) Math.pow(j, 2))) + 1;
                } else {
                    Matriz[i][j] = (3 * ((int) Math.pow(i, 2))) - i;
                }
            }
        }

        for (int x = 0; x < Matriz.length; x++) {
            for (int z = 0; z < Matriz.length; z++) {
                System.out.printf("| %5d",Matriz[x][z]);

            }
            System.out.println("");

        }
    }
}
