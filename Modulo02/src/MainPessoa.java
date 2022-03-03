import java.util.Scanner;

public class MainPessoa {
    //ex 17/02 e 22/02
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Fornecedor fornecedor = new Fornecedor();
        Empregado empregado = new Empregado();
        Administrador administrador = new Administrador();
        Operario operario = new Operario();
        Vendedor vendedor = new Vendedor();
        Scanner scanner = new Scanner(System.in);

        pessoa.setNome("Natalia");
        System.out.println(pessoa.nome);
        pessoa.setEndereço("rua xxx");
        System.out.println(pessoa.endereço);
        pessoa.setTelefone("19999999");
        System.out.println(pessoa.telefone);

        System.out.println(pessoa.toString());

        //Teste exercicio 02

        fornecedor.setNome("\nTeste Filho Pessoa");
        System.out.println(fornecedor.nome);

        fornecedor.setValorCredito(100);
        fornecedor.setValorDivida(60);
        fornecedor.setObterSaldo(fornecedor.obterSaldo);
        System.out.println("valor restante: "+fornecedor.obterSaldo);

        System.out.println(fornecedor.toString());

        // Teste exercicio 03

        empregado.setEndereço("\nTeste Filho Pessoa");
        System.out.println(empregado.endereço);
//        empregado.setCodigoSetor(001);
        System.out.println("digite o código do setor: 1 | 2 | 3:");
        empregado.codigoSetor = scanner.nextInt();
        empregado.setSalarioBase(1000);
        empregado.setImposto(13);
        empregado.setCalcularSalario(empregado.calcularSalario);
        System.out.println("código setor: "+empregado.codigoSetor);
        System.out.println("salario base acrescido de bonus:\n "+empregado.calcularSalario);

        System.out.println(empregado.toString());

        // Teste exercicio 04

        administrador.setTelefone("\nTeste Filho Pessoa");
        System.out.println(administrador.telefone);
        administrador.setAjudaDeCusto(130);
        System.out.println("ajuda de custo:"+ administrador.ajudaDeCusto);
        System.out.println("salario de um Adm:"+(administrador.ajudaDeCusto+empregado.salarioBase));
        administrador.salarioBase=empregado.salarioBase;
        administrador.calcularSalario();
        System.out.println("Salario adm:\n"+administrador.calcularSalario);

        System.out.println(administrador.toString());

        // Teste exercicio 05
        operario.setNome("\nTeste filho pessoa");
        System.out.println(operario.nome);
        operario.setValorProducao(5000);
        System.out.println("Valor da producao do operario: "+operario.valorProducao);
        operario.setComissao(10);
        System.out.println("Valor da comissao"+operario.comissao);
        operario.salarioBase = empregado.salarioBase;
        operario.calcularSalario();
        System.out.println("Salario operario\n"+operario.calcularSalario);

        System.out.println(operario.toString());

        // Teste exercicio 06

        vendedor.setEndereço("\n Teste filho empregado/pessoa");
        System.out.println(vendedor.endereço);
        vendedor.setValorVendas(20000);
        System.out.println("Valor de vendas:"+vendedor.valorVendas);
        vendedor.setComissaoV(4);
        System.out.println("Valor da comissao:"+vendedor.comissaoV);
        vendedor.salarioBase = empregado.salarioBase;
        vendedor.calcularSalario();
        System.out.println("Salario Vendedor:"+vendedor.calcularSalario);

        System.out.println(vendedor.toString());

    }

}

