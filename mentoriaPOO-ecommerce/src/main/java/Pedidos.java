public class Pedidos {

    private final String registro;
    private final Cliente cliente;
    private final Itens itens;

    public Pedidos(final String registro, final Cliente cliente, final Itens itens) {
        this.registro = registro;
        this.cliente = cliente;
        this.itens = itens;
    }

    public String getRegistro() {
        return registro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Itens getItens() {
        return itens;
    }

}
