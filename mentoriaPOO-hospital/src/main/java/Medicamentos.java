public class Medicamentos {

    private final int quantidade;
    private final String orientacao;

    public Medicamentos(final int quantidade, final String orientacao) {
        this.quantidade = quantidade;
        this.orientacao = orientacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getOrientacao() {
        return orientacao;
    }
}