public class Fornecedor extends Pessoa {


    private double valorCredito;
    private double valorDivida;
    double obterSaldo;


    public double getValorCredito() {
        return valorCredito;
    }

        public double getValorDivida() {
            return valorDivida;
        }

        public double getObterSaldo(){
            return obterSaldo;
        }


         public void setValorCredito(double valorCredito){
                this.valorCredito = valorCredito;
            }

         public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

         public void setObterSaldo (double obterSaldo){
        this.obterSaldo = valorCredito-valorDivida;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "valorCredito=" + valorCredito +
                ", valorDivida=" + valorDivida +
                ", obterSaldo=" + obterSaldo +
                '}';
    }
}
