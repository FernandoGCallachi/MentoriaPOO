import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProfessoresTest {

    @Test
    void ShouldReturnTrueWhenActive() {
        Disciplinas disciplinas = new Disciplinas(123, "nome");

        Professores professores = new Professores(
                UUID.randomUUID(),
                "fer",
                "fer@",
                "48655521346",
                6546,
                "formacao",
                true,
                disciplinas);

        Assertions.assertTrue(professores.ativo());
    }

    @Test
    void ShouldReturnFalseWhenActive() {
        Disciplinas disciplinas = new Disciplinas(123, "nome");

        Professores professores = new Professores(
                UUID.randomUUID(),
                "fer",
                "fer@",
                "48655521346",
                6546,
                "formacao",
                false,
                disciplinas);

        Assertions.assertFalse(professores.ativo());
    }

    @Test
    void shouldReturnIqualsWhenInstanceTwoProfessor() {
        var id = UUID.randomUUID();

        Professores professoresRef = new Professores(
                id,
                "fer",
                "fer@",
                "48655521346",
                6546,
                "formacao",
                false,
                null);

        Professores professoresActual = new Professores(
                id,
                "fer",
                "fer@",
                "48655521346",
                6546,
                "formacao",
                false,
                null);

        assertEquals(professoresRef.getId(), professoresActual.getId());
        assertEquals(professoresRef.getNome(), professoresActual.getNome());
        assertEquals(professoresRef.getEmail(), professoresActual.getEmail());
        assertEquals(professoresRef.getCpf(), professoresActual.getCpf());
        assertEquals(professoresRef.getRegistro(), professoresActual.getRegistro());
        assertEquals(professoresRef.getFormacao(), professoresActual.getFormacao());
        assertEquals(professoresRef.getStatus(), professoresActual.getStatus());
        assertEquals(professoresRef.getDisciplinas(), professoresActual.getDisciplinas());
    }

    @Test
    void shouldReturnAvaliacaoWhenAplicarProva() {
        Professores professor = new Professores(
                UUID.randomUUID(),
                "fer",
                "fer@",
                "48655521346",
                6546,
                "formacao",
                false,
                null);

        Turmas turmas = new Turmas("",null);

        var result = professor.aplicarProva("",10F, professor.getDisciplinas(), turmas);

        Avaliacoes avaliacoes = new Avaliacoes(result.getTipoProva(),result.getNota(),result.getDisciplinas(),result.getTurmas()) {
            @Override
            public boolean aprovado(final Float nota) {
                return false;
            }
        };

        assertEquals(result.getTipoProva(), avaliacoes.getTipoProva());
        assertEquals(result.getNota(), avaliacoes.getNota());
        assertEquals(result.getDisciplinas(), avaliacoes.getDisciplinas());
        assertEquals(result.getTurmas(), avaliacoes.getTurmas());
    }
}