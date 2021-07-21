public class Itens {

    private final String observacao;
    private final Cliente cliente;
    private final Entregas entregas;
    private final Produtos produtos;

    public Itens(final String observacao, final Produtos produtos, final Cliente cliente, final Entregas entregas) {
        this.observacao = observacao;
        this.cliente = cliente;
        this.entregas = entregas;
        this.produtos = produtos;
    }

    public String getObservacao() {
        return observacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Entregas getEntregas() {
        return entregas;
    }

    public Produtos getProdutos() {
        return produtos;
    }
}
