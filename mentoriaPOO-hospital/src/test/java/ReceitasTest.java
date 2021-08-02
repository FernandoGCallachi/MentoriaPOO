import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ReceitasTest {
    @Test
    void shouldReturnEqualsWhenInstanceTwoReceitas() {
        List<Medicamentos> medicamentos = new ArrayList<>();

        Receitas receitasRef = new Receitas("", medicamentos, null, null);
        Receitas receitasActual = new Receitas("", medicamentos, null, null);

        Assertions.assertEquals(receitasRef.getprescricao(), receitasActual.getprescricao());
        Assertions.assertEquals(receitasRef.getCompontente(), receitasActual.getCompontente());
        Assertions.assertEquals(receitasRef.getMedicos(), receitasActual.getMedicos());
        Assertions.assertEquals(receitasRef.getPacientes(), receitasActual.getPacientes());
    }
}