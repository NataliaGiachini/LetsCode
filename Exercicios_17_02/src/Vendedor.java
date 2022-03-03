public class Vendedor extends Empregado{

    double valorVendas;
    double comissaoV;

    public double getValorVendas(){
        return valorVendas;
    }
    public double getComissaoV(){
        return comissaoV;
    }

    public void setValorVendas (double valor){
        this.valorVendas = valor;
    }
    public void setComissaoV (double valor){
        this.comissaoV = ((valorVendas*valor)/100);
    }
    public void calcularSalario (){
        this.calcularSalario = (salarioBase+comissaoV);
    }
}
