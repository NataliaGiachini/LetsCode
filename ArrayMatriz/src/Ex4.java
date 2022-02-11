import java.util.Scanner;

public class Ex4 {
    //4. Faça  um  Programa que  leia  um   vetor  de  10   caracteres,  e  diga  quantas   consoantes foram lidas. Imprima as consoantes.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] letra = new String [10];
        int conso = 0;

        for (int x = 0; x < letra.length; x++) {
            System.out.println("Digite uma letra:");
//            String letra2 = scanner.next();
//            letra [x] = letra2.charAt(0);
              letra [x] = scanner.next();
        }
        for (int x = 0; x < letra.length; x++) {
            if ((!letra[x].equals("a")) && (!letra[x].equals("e")) && (!letra[x].equals("i")) && (!letra[x].equals("o")) && (!letra[x].equals("u"))) {
                System.out.println("as consoantes sao:" + letra[x]);
                conso = conso + 1;
            }

        }
        System.out.println("total de consoantes:" +conso);
    }
}
