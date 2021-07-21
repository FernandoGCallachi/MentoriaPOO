import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutosTest {

    @Test
    void shouldReturnIqualsWhenInstanceTwoProdutos() {
        NotaFiscal notaFiscal = new NotaFiscal("", 1, 1, 1, "");

        Produtos produtosRef = new Produtos("", 1, 1, 1, notaFiscal);
        Produtos produtosActual = new Produtos("", 1, 1, 1, notaFiscal);

        assertEquals(produtosRef.getModelo(), produtosActual.getModelo());
        assertEquals(produtosRef.getPesoProduto(), produtosActual.getPesoProduto());
        assertEquals(produtosRef.getPreco(), produtosActual.getPreco());
        assertEquals(produtosRef.getDimensao(), produtosActual.getDimensao());
        assertEquals(produtosRef.getNotaFiscal(), produtosActual.getNotaFiscal());
    }
}