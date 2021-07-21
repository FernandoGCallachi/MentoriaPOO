import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlunosTest {

    @Test
    void shouldReturnIgualsWhenTwoInstancesAluno() {

        Turmas turmas = new Turmas(
                "as",
                null
        );

        final Alunos expected = new Alunos(
                "fer",
                "fer@gmail.com",
                "48655544566",
                "ADS",
                632651,
                2,
                true,
                turmas
        );

        final Alunos actual = new Alunos(
                "fer",
                "fer@gmail.com",
                "48655544566",
                "ADS",
                632651,
                2,
                false,
                turmas);
        Assertions.assertEquals(expected.getRA(), actual.getRA());
    }

    @Test
    void shouldReturnTrueWhenFazerProva() {
        Turmas turmas = new Turmas(
                "as",
                null
        );

        final Alunos alunos = new Alunos(
                "fer",
                "fer@gmail.com",
                "48655544566",
                "ADS",
                632651,
                2,
                true,
                turmas);
        var nota = 7f;

        Disciplinas disciplinas = new Disciplinas(100, "nomeDisciplina");

        var result = alunos.fazerProva("N1", nota, disciplinas, alunos).aprovado(nota);


        Assertions.assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenActive() {
        Turmas turmas = new Turmas(
                "as",
                null
        );

        final Alunos alunos = new Alunos(
                "fer",
                "fer@gmail.com",
                "48655544566",
                "ADS",
                632651,
                2,
                true, turmas);
        Assertions.assertTrue(alunos.ativo());
    }

    @Test
    void shouldReturnFalseWhenActive() {
        Turmas turmas = new Turmas(
                "as",
                null
        );

        final Alunos alunos = new Alunos(
                "fer",
                "fer@gmail.com",
                "48655544566",
                "ADS",
                632651,
                2,
                false, turmas);
        Assertions.assertFalse(alunos.ativo());
    }

    @Test
    void shouldReturnIqualsWhenInstanceTwoAlunos() {
        final Alunos alunosRef = new Alunos(
                "fer",
                "fer@gmail.com",
                "48655544566",
                "ADS",
                632651,
                2,
                false,
                null);

        final Alunos alunosActual = new Alunos(
                "fer",
                "fer@gmail.com",
                "48655544566",
                "ADS",
                632651,
                2,
                false,
                null);

        Assertions.assertEquals(alunosRef.getNome(), alunosActual.getNome());
        Assertions.assertEquals(alunosRef.getEmail(), alunosActual.getEmail());
        Assertions.assertEquals(alunosRef.getCpf(), alunosActual.getCpf());
        Assertions.assertEquals(alunosRef.getCurso(), alunosActual.getCurso());
        Assertions.assertEquals(alunosRef.getRA(), alunosActual.getRA());
        Assertions.assertEquals(alunosRef.getPeriodo(), alunosActual.getPeriodo());
        Assertions.assertEquals(alunosRef.getStatus(), alunosActual.getStatus());
        Assertions.assertEquals(alunosRef.getTurmas(), alunosActual.getTurmas());
    }

}