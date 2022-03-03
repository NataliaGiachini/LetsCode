import java.util.Scanner;

public class mainVeiculo {


    public static void main(String[] args) {
        int op;

        Scanner scanner = new Scanner(System.in);
        Veiculo veiculo1 = new Veiculo();

        System.out.println("Marca:");
        veiculo1.setMarca(scanner.next());

        System.out.println("Modelo:");
        veiculo1.setModelo(scanner.next());

        System.out.println("Ano:");
        veiculo1.setAno(scanner.nextInt());

        System.out.println("Qual velocidade?");
        veiculo1.velocidade(scanner.nextInt());

        System.out.println("Deseja frear o carro? \n 1.sim \n2.nao");
        op = scanner.nextInt();

        if(op == 1){
            veiculo1.frear();
        }
        else{
            System.out.println("o veiculo segue na velocidade:"+veiculo1.velo);

        }

    }
}
