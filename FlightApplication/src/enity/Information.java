package enity;

public class Information {

    private String aeroportoOrigem;
    private String aeroportoDestino;
    private Double vooCurto;
    private Double vooLongo;
    private Double vooBarato;
    private Double vooCaro;
    private Double tempoMedio;
    private Double precoMedio;

    public Information(String aeroportoOrigem, String aeroportoDestino, Double vooCurto, Double vooLongo, Double vooBarato, Double vooCaro, Double tempoMedio, Double precoMedio) {
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoDestino = aeroportoDestino;
        this.vooCurto = vooCurto;
        this.vooLongo = vooLongo;
        this.vooBarato = vooBarato;
        this.vooCaro = vooCaro;
        this.tempoMedio = tempoMedio;
        this.precoMedio = precoMedio;
    }

    public String getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    public void setAeroportoOrigem(String aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    public String getAeroportoDestino() {
        return aeroportoDestino;
    }

    public void setAeroportoDestino(String aeroportoDestino) {
        this.aeroportoDestino = aeroportoDestino;
    }

    public Double getVooCurto() {
        return vooCurto;
    }

    public void setVooCurto(Double vooCurto) {
        this.vooCurto = vooCurto;
    }

    public Double getVooLongo() {
        return vooLongo;
    }

    public void setVooLongo(Double vooLongo) {
        this.vooLongo = vooLongo;
    }

    public Double getVooBarato() {
        return vooBarato;
    }

    public void setVooBarato(Double vooBarato) {
        this.vooBarato = vooBarato;
    }

    public Double getVooCaro() {
        return vooCaro;
    }

    public void setVooCaro(Double vooCaro) {
        this.vooCaro = vooCaro;
    }

    public Double getTempoMedio() {
        return tempoMedio;
    }

    public void setTempoMedio(Double tempoMedio) {
        this.tempoMedio = tempoMedio;
    }

    public Double getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(Double precoMedio) {
        this.precoMedio = precoMedio;
    }

    // função para alterar o modelo de saída do arquivo
    public String formatoCSV(){
        return aeroportoOrigem + ";"+
                aeroportoDestino + ";"+
                vooCurto + ";"+
                vooLongo + ";R$"+
                vooBarato + ";R$"+
                vooCaro + ";"+
                tempoMedio + ";R$"+
                precoMedio + "\n";
    }
}

