public class Tr11 {

    //Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao na diago-  ̃
    //nal secundaria.

    public static void main(String[] args) {
        int [][] Matriz = {{1,2,3,},{5,6,7},{9,10,11}};
        int soma = 0;

        soma = Matriz[0][2] + Matriz[1][1] + Matriz[2][0];
        System.out.println(" A soma dos numeros da diagonal secundaria é: "+soma);

    }

}
