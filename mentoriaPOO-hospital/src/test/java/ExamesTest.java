import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamesTest {
    @Test
    void shouldReturnIqualsWhenInstanceTwoExames() {
        Exames examesRef = new Exames(
                true,
                "",
                true,
                null,
                null,
                null
        );
        Exames examesActual = new Exames(
                true,
                "",
                true,
                null,
                null,
                null
        );

        assertEquals(examesRef.isPresente(), examesActual.isPresente());
        assertEquals(examesRef.getEspecialidadeExame(), examesActual.getEspecialidadeExame());
        assertEquals(examesRef.isJejum(), examesActual.isJejum());
        assertEquals(examesRef.getHoraExame(), examesActual.getHoraExame());
        assertEquals(examesRef.getMedicos(), examesActual.getMedicos());
        assertEquals(examesRef.getPacientes(), examesActual.getPacientes());
    }
}