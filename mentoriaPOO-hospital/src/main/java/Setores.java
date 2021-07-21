public class Setores {
    private final int risco;
    private final String tipoSetor;

    public Setores(final int risco, final String tipoSetor) {
        this.risco = risco;
        this.tipoSetor = tipoSetor;
    }

    public int getRisco() {
        return risco;
    }

    public String getTipoSetor() {
        return tipoSetor;
    }
}
