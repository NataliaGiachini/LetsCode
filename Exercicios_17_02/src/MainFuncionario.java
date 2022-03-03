import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        int op = 0;

        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario01 = new Funcionario();

        System.out.println("Nome:");
        funcionario01.nome = scanner.next();
        System.out.println("Sobrenome:");
        funcionario01.sobrenome = scanner.next();
        System.out.println("Cidade");
        funcionario01.cidade = scanner.next();
        System.out.println("Estado");
        funcionario01.estado = scanner.next();
        System.out.println("Horas Trabalhadas");
        funcionario01.horasTrabalhadas = Double.parseDouble(scanner.next());
        System.out.println("Valor por hora");
        funcionario01.valorPorHora = Double.parseDouble(scanner.next());


        while (op != 4) {

            System.out.println("\n***** MENU *****\n");
            System.out.println("1.Incrementar quantidade de horas trabalhadas\n");
            System.out.println("2.Substituir o valor por hora do funcionário\n");
            System.out.println("3.Calcular o salário do funcionário no final do mês\n");
            System.out.println("4. Sair da operação");
            op = scanner.nextInt();


            switch (op) {
                case 1:
                    System.out.println("Adicione mais horas trabalhadas:");
                    funcionario01.alteraValorh(scanner.nextDouble());
                    System.out.println("Valor atual de horas trabalhadas: " + funcionario01.horasTrabalhadas);

                    break;
                case 2:
                    System.out.println("Adicione o novo valor por hora:");
                    funcionario01.alteraValor(scanner.nextDouble());
                    System.out.println("Valor por hora após atualização R$: " + funcionario01.valorPorHora);
                    break;
                case 3:
                    funcionario01.salario(funcionario01.smes);
                    System.out.println("Salario mensal: " + funcionario01.smes);
                    break;
                case 4:
                    System.out.println("Fim da Operação");
                    break;

                default:
                    System.out.println("operacao invalida");
            }
        }

    }
}




