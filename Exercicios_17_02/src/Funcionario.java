public class Funcionario {
    String nome;
    String sobrenome;
    String cidade;
    String estado;
    double horasTrabalhadas;
    double valorPorHora;
    double smes;


    void alteraValor(double valor) {
        this.valorPorHora = valor;
    }
    void alteraValorh(double valor) {
        this.horasTrabalhadas += valor;
    }
    void salario (double valor){
        this.smes = horasTrabalhadas * valorPorHora;
    }
}
