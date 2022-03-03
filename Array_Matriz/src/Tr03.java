public class Tr03 {
    //Faça um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da
    //coluna de cada elemento. Em seguida, imprima na tela a matriz.
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0;j<5; j++){
                matriz[i][j]=i*j;
               // System.out.println( "" +matriz[i][j]);
            }
        }
            for(int x = 0; x < matriz.length; x++){
                for (int z = 0 ; z < matriz[0].length; z++){
                    System.out.print(matriz[x][z] +" ");
                }
                System.out.println("");
            }
    }
}

