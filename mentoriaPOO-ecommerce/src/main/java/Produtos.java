public class Produtos {
    private final String modelo;
    private final int pesoProduto;
    private final int preco;
    private final int dimensao;
    private final NotaFiscal notaFiscal;

    public Produtos(final String modelo, final int pesoProduto, final int preco, final int dimensao, final NotaFiscal notaFiscal) {
        this.modelo = modelo;
        this.pesoProduto = pesoProduto;
        this.preco = preco;
        this.dimensao = dimensao;
        this.notaFiscal = notaFiscal;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPesoProduto() {
        return pesoProduto;
    }

    public int getPreco() {
        return preco;
    }

    public int getDimensao() {
        return dimensao;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
}
