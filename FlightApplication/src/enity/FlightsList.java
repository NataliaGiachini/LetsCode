package enity;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FlightsList {

        private String aeroportoOrigem;
        private String aeroportoDestino;
        private String companhiaAerea;
        private ZonedDateTime infoSaida;
        private ZonedDateTime infoChegada;
        private Double valorVoo;
        private Long duraçao;

        public FlightsList(String aeroportoOrigem, String aeroportoDestino, String companhiaAerea, String infoSaida, String infoChegada, Double valorVoo) {
                this.aeroportoOrigem = aeroportoOrigem;
                this.aeroportoDestino = aeroportoDestino;
                this.companhiaAerea = companhiaAerea;
                this.infoSaida = ZonedDateTime.parse(infoSaida, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss '('zzz')'"));
                this.infoChegada = ZonedDateTime.parse(infoChegada, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss '('zzz')'"));
                this.valorVoo = valorVoo;
                this.duraçao = this.infoSaida.until(this.infoChegada, ChronoUnit.HOURS);
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

        public Long getDuraçao() {
                return duraçao;
        }

        public void setDuraçao(Long duraçao) {
                this.duraçao = duraçao;
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
                        ", duraçao=" + duraçao +
                        '}';
        }
}
