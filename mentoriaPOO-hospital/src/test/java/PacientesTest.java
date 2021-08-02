import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PacientesTest {

    @Test
    void shouldReturnEqualsWhenInstanceTwoPacientes() {
        Pacientes pacientesRef = new Pacientes(
                "",
                null,
                "",
                "",
                "",
                "",
                true,
                1F,
                ""
        );
        Pacientes pacientesActual = new Pacientes(
                "",
                null,
                "",
                "",
                "",
                "",
                true,
                1F,
                ""
        );

        Assertions.assertEquals(pacientesRef.getNome(), pacientesActual.getNome());
        Assertions.assertEquals(pacientesRef.getDateNascimento(), pacientesActual.getDateNascimento());
        Assertions.assertEquals(pacientesRef.getEmail(), pacientesActual.getEmail());
        Assertions.assertEquals(pacientesRef.getTelefone(), pacientesActual.getTelefone());
        Assertions.assertEquals(pacientesRef.getCpf(), pacientesActual.getCpf());
        Assertions.assertEquals(pacientesRef.getSintomas(), pacientesActual.getSintomas());
        Assertions.assertEquals(pacientesRef.getConvenio(), pacientesActual.getConvenio());
        Assertions.assertEquals(pacientesRef.getAltura(), pacientesActual.getAltura());
        Assertions.assertEquals(pacientesRef.getPressao(), pacientesActual.getPressao());
    }
}