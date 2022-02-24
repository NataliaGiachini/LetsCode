public class Empregado extends Pessoa{

    int codigoSetor;
    double salarioBase;
    double imposto;
    double calcularSalario;

    public int getCodigoSetor(){
        return codigoSetor;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public double getImposto(){
        return imposto;
    }
    public double getCalcularSalario(){
        return calcularSalario;
    }

    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor = codigoSetor;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    public void setImposto(double imposto){
        this.imposto = imposto;
    }
    public void setCalcularSalario(double calcularSalario){
        double valor = (imposto*10000)/salarioBase;
        this.calcularSalario = salarioBase - valor;
    }
}
