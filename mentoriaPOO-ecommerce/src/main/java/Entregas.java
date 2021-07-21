import java.time.LocalDateTime;

public class Entregas {
    private final LocalDateTime dataPrevista;
    private final String codRastreio;
    private final String endereco;
    private final int tipoEntrega;
    private final Transportadoras transportadoras;

    public Entregas(final LocalDateTime dataPrevista, final String codRastreio, final String endereco, final int tipoEntrega, final Transportadoras transportadoras) {
        this.dataPrevista = dataPrevista;
        this.codRastreio = codRastreio;
        this.endereco = endereco;
        this.tipoEntrega = tipoEntrega;
        this.transportadoras = transportadoras;
    }

    public LocalDateTime getDataPrevista() {
        return dataPrevista;
    }

    public String getCodRastreio() {
        return codRastreio;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTipoEntrega() {
        return tipoEntrega;
    }

    public Transportadoras getTransportadoras() {
        return transportadoras;
    }
}
