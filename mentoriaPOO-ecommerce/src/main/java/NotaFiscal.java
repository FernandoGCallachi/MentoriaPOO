public class NotaFiscal {
    private final String prestador;
    private final int valorServico;
    private final int imposto;
    private final int valorNota;
    private final String infoADD;

    public NotaFiscal(final String prestador, final int valorServico, final int imposto, final int valorNota, final String infoADD) {
        this.prestador = prestador;
        this.valorServico = valorServico;
        this.imposto = imposto;
        this.valorNota = valorNota;
        this.infoADD = infoADD;
    }

    public String getPrestador() {
        return prestador;
    }

    public int getValorServico() {
        return valorServico;
    }

    public int getImposto() {
        return imposto;
    }

    public int getValorNota() {
        return valorNota;
    }

    public String getInfoADD() {
        return infoADD;
    }
}
