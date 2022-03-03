public class Administrador extends Empregado {


    double ajudaDeCusto;


    public double getAjudaDeCusto(){
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    public void calcularSalario(){
        this.calcularSalario = (salarioBase+ajudaDeCusto);
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "ajudaDeCusto=" + ajudaDeCusto +
                '}';
    }
}
