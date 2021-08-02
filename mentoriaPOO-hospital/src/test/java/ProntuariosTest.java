import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProntuariosTest {

    @Test
    void shouldReturnEqualsWhenInstanceTwoProntuarios() {
        Prontuarios prontuariosRef = new Prontuarios("", null, null);
        Prontuarios prontuariosActual = new Prontuarios("", null, null);

        assertEquals(prontuariosRef.getObservacao(), prontuariosActual.getObservacao());
        assertEquals(prontuariosRef.getMedicos(), prontuariosActual.getMedicos());
        assertEquals(prontuariosRef.getPacientes(), prontuariosActual.getPacientes());
    }
}