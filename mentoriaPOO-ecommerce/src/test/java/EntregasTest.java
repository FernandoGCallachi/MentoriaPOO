import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntregasTest {
    @Test
    void shouldReturnIqualsWhenInstanceTwoEntregas() {
        Entregas entregasRef = new Entregas(null, "", "", 1, null);
        Entregas entregasActual = new Entregas(null, "", "", 1, null);

        Assertions.assertEquals(entregasRef.getDataPrevista(), entregasActual.getDataPrevista());
        Assertions.assertEquals(entregasRef.getCodRastreio(), entregasActual.getCodRastreio());
        Assertions.assertEquals(entregasRef.getEndereco(), entregasActual.getEndereco());
        Assertions.assertEquals(entregasRef.getTipoEntrega(), entregasActual.getTipoEntrega());
        Assertions.assertEquals(entregasRef.getTransportadoras(), entregasActual.getTransportadoras());
    }
}