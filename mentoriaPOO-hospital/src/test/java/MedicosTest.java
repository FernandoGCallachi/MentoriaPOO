import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedicosTest {
    @Test
    void shouldReturnEqualsWhenInstanceTwoMedicos() {
        Medicos medicosRef = new Medicos(
                "NOME",
                null,
                "@@",
                "",
                "",
                "",
                "",
                "",
                1
        );

        Medicos medicosActual = new Medicos(
                "NOME",
                null,
                "@@",
                "",
                "",
                "",
                "",
                "",
                1
        );

        assertEquals(medicosRef.getNome(), medicosActual.getNome());
        assertEquals(medicosRef.getDateNascimento(), medicosActual.getDateNascimento());
        assertEquals(medicosRef.getEmail(), medicosActual.getEmail());
        assertEquals(medicosRef.getTelefone(), medicosActual.getTelefone());
        assertEquals(medicosRef.getCpf(), medicosActual.getCpf());
        assertEquals(medicosRef.getFormacao(), medicosActual.getFormacao());
        assertEquals(medicosRef.getEspecializacao(), medicosActual.getEspecializacao());
        assertEquals(medicosRef.getCrm(), medicosActual.getCrm());
        assertEquals(medicosRef.getCargaHoraria(), medicosActual.getCargaHoraria());
    }
}