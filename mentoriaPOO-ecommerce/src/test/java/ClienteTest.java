import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClienteTest {

    @Test
    void shouldReturnPedidoWhenADDPedido() {
        Itens itens = new Itens(null, null, null, null);
        List<Pedidos> listPedidos = new ArrayList<>();
        Cliente cliente = new Cliente(UUID.randomUUID(), "FER", "48655512899", "FER@", "ASD", listPedidos);

        Pedidos pedidos = new Pedidos("", cliente, itens);

        cliente.addPedido(pedidos);

        Assertions.assertEquals(listPedidos.size(),1 );
    }

    @Test
    void shouldReturnIqualsWhenInstanceTwoClients() {
        var id = UUID.randomUUID();
        List<Pedidos> pedidos = new ArrayList<>();
        Cliente clienteBase = new Cliente(id, "FER", "48655512899", "FER@", "ASD", pedidos);
        Cliente clientePar = new Cliente(id, "FER", "48655512899", "FER@", "ASD", pedidos);

        assertEquals(clienteBase.getClienteId(), clientePar.getClienteId());
        assertEquals(clienteBase.getNome(), clientePar.getNome());
        assertEquals(clienteBase.getCpf(), clientePar.getCpf());
        assertEquals(clienteBase.getEmail(), clientePar.getEmail());
        assertEquals(clienteBase.getSenha(), clientePar.getSenha());

    }
}