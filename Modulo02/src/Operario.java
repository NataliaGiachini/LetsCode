public class Operario extends Empregado{

    double valorProducao;
    double comissao;

    public double getValorProducao(){
        return valorProducao;
    }
    public double getComissao(){
        return comissao;
    }

    public void setValorProducao (double valor){
        this.valorProducao = valor;
    }

    public void setComissao(double valor){
        this.comissao = ((valor*valorProducao)/100);
    }

    public void calcularSalario() {
        this.calcularSalario = (salarioBase+comissao);
    }

    @Override
    public String toString() {
        return "Operario{" +
                "valorProducao=" + valorProducao +
                ", comissao=" + comissao +
                '}';
    }
}
