import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidosTest {
    @Test
    void shouldReturnIqualsWhenInstanceTwoPedidos() {
        List<Pedidos> pedidos = new ArrayList<>();
        Cliente cliente = new Cliente(UUID.randomUUID(), "FER", "48655512899", "FER@", "ASD", pedidos);
        Itens itens = new Itens("observacao", null, cliente, null);

        Pedidos pedidosRef = new Pedidos("", cliente, itens);
        Pedidos pedidosActual = new Pedidos("", cliente, itens);

        assertEquals(pedidosRef.getRegistro(), pedidosActual.getRegistro());
        assertEquals(pedidosRef.getCliente(), pedidosActual.getCliente());
        assertEquals(pedidosRef.getItens(), pedidosActual.getItens());
    }
}