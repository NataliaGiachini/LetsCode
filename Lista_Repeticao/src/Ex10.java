import java.util.Scanner;
//10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
//multiplicação.
public class Ex10 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int numUsuario;
        int numMult;
        int result;

            System.out.println("Digite um numero:");
            numUsuario = scanner.nextInt();

            for (int x=1; x <= 10; x++){
                result = numUsuario * x;
                System.out.println("Resultado:"+result);
            }

    }
}
