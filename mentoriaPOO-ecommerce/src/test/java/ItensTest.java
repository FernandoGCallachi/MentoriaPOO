import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItensTest {
    @Test
    void shouldReturnIqualsWhenInstanceTwoItens() {
        List<Pedidos> pedidos = new ArrayList<>();
        Cliente cliente = new Cliente(UUID.randomUUID(), "FER", "48655512899", "FER@", "ASD", pedidos);
        NotaFiscal notaFiscal = new NotaFiscal("", 1, 1, 1, "");
        Produtos produtos = new Produtos("modelo", 123, 123, 123, notaFiscal);
        Entregas entregas = new Entregas(null, "", "", 1, null);
        Itens itensReferencia = new Itens("observacao", produtos, cliente, entregas);
        Itens itens = new Itens("observacao", produtos, cliente, entregas);

        assertEquals(itensReferencia.getObservacao(), itens.getObservacao());
        assertEquals(itensReferencia.getProdutos(), itens.getProdutos());
        assertEquals(itensReferencia.getCliente(), itens.getCliente());
        assertEquals(itensReferencia.getEntregas(), itens.getEntregas());
    }
}