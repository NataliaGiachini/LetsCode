public class Administrador extends Empregado {

    double ajudaDeCusto;


    public double getAjudaDeCusto(){
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double getCalcularSalario() {
        return super.getCalcularSalario();
    }

    public void setCalcularSalario(double calcularSalario) {
        super.setCalcularSalario(calcularSalario+ajudaDeCusto);
    }
}
