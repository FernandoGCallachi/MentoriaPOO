import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinasTest {

    @Test
    void shouldReturnIqualsWhenInstanceTwoDisciplinas() {
        Disciplinas disciplinasRef = new Disciplinas(1,"");
        Disciplinas disciplinasActual = new Disciplinas(1,"");

        assertEquals(disciplinasRef.getCargaHoraria(), disciplinasActual.getCargaHoraria());
        assertEquals(disciplinasRef.getNomeDisciplina(), disciplinasActual.getNomeDisciplina());
    }
}