public class Tr02 {
    //Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais
//elementos. Escreva ao final a matriz obtida.
    public static void main(String[] args) {

        int[][] matrizPrinc = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matrizPrinc[i][j] = 1;
                } else {
                    matrizPrinc[i][j] = 0;
                }
                System.out.println(+matrizPrinc[i][j]);
            }
            System.out.println("");
        }
    }
}