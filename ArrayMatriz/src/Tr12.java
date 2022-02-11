public class Tr12 {
    //Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta.

    public static void main(String[] args) {
        int[][] Matriz = {{1, 2, 3,}, {5, 6, 7}, {9, 10, 11}};


        for (int x = 0; x < Matriz.length; x++) {
            for (int z = 0; z < Matriz.length; z++) {
                System.out.printf("| %5d", Matriz[z][x]);

            }
            System.out.println("");

        }

    }
}
