import java.util.Random;

public class Tr04 {
//Leia uma matriz 4 x 4, imprima a matriz e retorne a localizac ̧ao (linha e a coluna) do ̃ maior valor.

    public static void main(String[] args) {
        Random random = new Random();
        int [][] matriz = new int [4][4];
        int medida = 0;
        int localLinha = 0;
        int localColuna = 0;


        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j<4; j++){
                matriz[i][j] = random.nextInt(100);
            }
        }

        for(int x = 0; x < matriz.length; x++){
            for (int z = 0; z < matriz.length; z++){
                System.out.print(matriz[x][z] +" ");
                if (matriz[x][z] >= medida){
                    medida = matriz[x][z];
                    localLinha = x;
                    localColuna = z;
                }
            }
           System.out.println("");
        }
        System.out.println ("\nMaior numero: "+ medida);
        System.out.println ("Na linha: "+localLinha);
        System.out.println("Na coluna: "+localColuna);
    }
}
