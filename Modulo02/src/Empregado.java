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

    //É possivel fazer tbm com polimorfismo de sobreposição, alterando a assinatura de calcular salario para dois doubles 1 com calculo de imposto e outro com calculo do bonus)

    public void setCalcularSalario(double calcularSalario){
        calcularSalario = (salarioBase * imposto) / 100;
        this.calcularSalario = salarioBase - calcularSalario;
        System.out.println("salario com imposto:"+this.calcularSalario);

        if(codigoSetor ==1) {
            calcularSalario = (salarioBase * 5) / 100;
            this.calcularSalario = salarioBase + calcularSalario;
        }
        else if (codigoSetor ==2){
            calcularSalario = (salarioBase * 10) / 100;
            this.calcularSalario = salarioBase + calcularSalario;
        }
        else if (codigoSetor ==3){
            calcularSalario = (salarioBase * 20) / 100;
            this.calcularSalario = salarioBase + calcularSalario;
        }
        else
            System.out.println("Esse setor nao existe!!  Salario sem bonus:"+salarioBase);
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "codigoSetor=" + codigoSetor +
                ", salarioBase=" + salarioBase +
                ", imposto=" + imposto +
                ", calcularSalario=" + calcularSalario +
                '}';
    }
}
