import java.util.Scanner;

public class Ex9 {
    //Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        String nomecomp = null;
        int idade;
        int idadeMaior = 120;

        for (int x = 1; x <= 4; x++) {
            System.out.println("Digite seu nome:");
            nome = scanner.next();
            System.out.println("Digite sua idade:");
            idade = scanner.nextInt();

            if (idade < idadeMaior) {
                idadeMaior = idade;
                nomecomp = nome;
            }

        }
        System.out.println("A pessoa mais nova é:"+nomecomp);
    }

}



