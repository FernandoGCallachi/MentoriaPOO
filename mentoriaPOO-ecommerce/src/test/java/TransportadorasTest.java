
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransportadorasTest {
    @Test
    void shouldReturnIqualsWhenInstanceTwoTransportadoras() {
        Transportadoras transportadorasRef = new Transportadoras("","",1,"","");
        Transportadoras transportadorasActual = new Transportadoras("","",1,"","");

        assertEquals(transportadorasRef.getIdentificacao(),transportadorasActual.getIdentificacao());
        assertEquals(transportadorasRef.getNomeTransportadora(),transportadorasActual.getNomeTransportadora());
        assertEquals(transportadorasRef.getTipoCarga(),transportadorasActual.getTipoCarga());
        assertEquals(transportadorasRef.getTelefoneTransportadora(),transportadorasActual.getTelefoneTransportadora());
        assertEquals(transportadorasRef.getEmail(),transportadorasActual.getEmail());
    }
}