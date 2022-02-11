import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args){

        double num1, num2;
        double soma, sub, div, mult;
        int op;

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero:");
        num1 = scanner.nextDouble();
        System.out.println("digite o segundo numero");
        num2 = scanner.nextDouble();
        System.out.println("digite a operacao: 1.soma  2.sub  3.mult  4.div");
        op = scanner.nextInt();

        switch (op){
            case 1:
                soma = num1+num2;
                System.out.println("a soma é:"+soma);
                break;
            case 2:
                sub = num1-num2;
                System.out.println("a sub é:"+sub);
                break;
            case 3:
                mult = num1*num2;
                System.out.println("a mult é:"+mult);
                break;
            case 4:
                div = num1/num2;
                System.out.println("a div é:"+div);
                break;

            default:
                System.out.println("operacao invalida");
                  }

    }

}
