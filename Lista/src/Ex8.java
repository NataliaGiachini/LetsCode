import java.util.Scanner;

public class Ex8 {
    //Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        int qntNum = 0;

        for (int x = 1; x <= 20; x++) {
            System.out.println("Digite sua idade:");
            idade = scanner.nextInt();

            if (idade > 17) {
                qntNum = qntNum + 1;
            }
        }
        System.out.println("Quantidade de pessoas maior de idade:" +qntNum);
    }

}