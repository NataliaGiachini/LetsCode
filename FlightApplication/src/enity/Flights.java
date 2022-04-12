package enity;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Flights {

        private String aeroportoOrigem;
        private String aeroportoDestino;
        private String companhiaAerea;
        private ZonedDateTime infoSaida;
        private ZonedDateTime infoChegada;
        private Double valorVoo;
        private Long duracao;

        public Flights(String aeroportoOrigem, String aeroportoDestino, String companhiaAerea, String infoSaida, String infoChegada, Double valorVoo) {
                this.aeroportoOrigem = aeroportoOrigem;
                this.aeroportoDestino = aeroportoDestino;
                this.companhiaAerea = companhiaAerea;
                this.infoSaida = ZonedDateTime.parse(infoSaida, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss '('zzz')'"));
                this.infoChegada = ZonedDateTime.parse(infoChegada, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss '('zzz')'"));
                this.valorVoo = valorVoo;
                this.duracao = this.infoSaida.until(this.infoChegada, ChronoUnit.HOURS);
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

        public String getCompanhiaAerea() {
                return companhiaAerea;
        }

        public void setCompanhiaAerea(String companhiaAerea) {
                this.companhiaAerea = companhiaAerea;
        }

        public ZonedDateTime getInfoSaida() {
                return infoSaida;
        }

        public void setInfoSaida(ZonedDateTime infoSaida) {
                this.infoSaida = infoSaida;
        }

        public ZonedDateTime getInfoChegada() {
                return infoChegada;
        }

        public void setInfoChegada(ZonedDateTime infoChegada) {
                this.infoChegada = infoChegada;
        }

        public Double getValorVoo() {
                return valorVoo;
        }

        public void setValorVoo(Double valorVoo) {
                this.valorVoo = valorVoo;
        }

        public Long getDuracao() {
                return duracao;
        }

        public void setDuracao(Long duracao) {
                this.duracao = duracao;
        }

        @Override
        public String toString() {
                return "FlightsList{" +
                        "aeroportoOrigem='" + aeroportoOrigem + '\'' +
                        ", aeroportoDestino='" + aeroportoDestino + '\'' +
                        ", companhiaAerea='" + companhiaAerea + '\'' +
                        ", infoSaida=" + infoSaida +
                        ", infoChegada=" + infoChegada +
                        ", valorVoo=" + valorVoo +
                        ", duraçao=" + duracao +
                        '}';
        }

        // função para alterar o modelo de saída do arquivo
        public String formatoCSV(){
                return aeroportoOrigem + ";"+
                        aeroportoDestino + ";"+
                        companhiaAerea + ";"+
                        infoSaida + ";"+
                        infoChegada + ";R$"+
                        valorVoo + ";"+
                        duracao + "\n";
        }
}
