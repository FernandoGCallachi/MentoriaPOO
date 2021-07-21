import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TurmasTest {
    @Test
    void shouldReturnIqualsWhenInstanceTwoTurmas() {
        Turmas turmasRef = new Turmas("a", null);

        Turmas turmasActual = new Turmas("a", null);

        assertEquals(turmasRef.getTurma(), turmasActual.getTurma());
        assertEquals(turmasRef.getAlunos(), turmasActual.getAlunos());
    }
}