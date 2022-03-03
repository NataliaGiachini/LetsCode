public class Tr06 {
//Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posic ̧ao ̃
//das matrizes lidas.
    public static void main(String[] args) {

        int [][] matriz1 = {{30,22,31,40},{5,6,7,8},{29,30,31,32},{13,14,15,16}};
        int [][] matriz2 = {{1,2,3,4},{50,1,27,28},{9,10,11,12},{33,34,35,36}};
        int [][] matriz3 = new int [4][4];
        int result1 = 0;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (matriz1[i][j] < matriz2[i][j]){
                    matriz3[i][j] = matriz2 [i][j];
                }
                else{
                    matriz3[i][j] = matriz1[i][j];
                }
            }
        }
        for(int x = 0; x < 4; x++){
            for (int z = 0 ; z < 4; z++){
                System.out.print(matriz3[x][z] +" ");
            }
            System.out.println("");
        }
    }
}
