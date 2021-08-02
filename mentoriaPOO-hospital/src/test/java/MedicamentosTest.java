import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedicamentosTest {

    @Test
    void shouldReturnIqualsWhenInstanceTwoMedicamentos() {
        Medicamentos medicamentosRef = new Medicamentos(1, "");
        Medicamentos medicamentosActual = new Medicamentos(1, "");

        assertEquals(medicamentosRef.getQuantidade(), medicamentosActual.getQuantidade());
        assertEquals(medicamentosRef.getOrientacao(), medicamentosActual.getOrientacao());
    }
}