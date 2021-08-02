import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsultasTest {
    @Test
    void shouldReturnEqualsWhenInstanceTwoConsultas() {
        Consultas consultasRef = new Consultas(
                null,
                "",
                null,
                null
        );
        Consultas consultasActual = new Consultas(
                null,
                "",
                null,
                null
        );

        assertEquals(consultasRef.getDataConsulta(), consultasActual.getDataConsulta());
        assertEquals(consultasRef.getEspecialidade(), consultasActual.getEspecialidade());
        assertEquals(consultasRef.getMedicos(), consultasActual.getMedicos());
        assertEquals(consultasRef.getPacientes(), consultasActual.getPacientes());
    }
}