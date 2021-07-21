import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AvaliacoesTest {
    @Test
    void shouldReturnIqualsWhenInstanceTwoAvaliacaoesAlunos() {
        Turmas turmas = new Turmas("", null);
        Alunos alunos = new Alunos("","","","",1,1,true,turmas);

        Avaliacoes avaliacoesRef = new Avaliacoes("",1F,null, alunos) {
            @Override
            public boolean aprovado(final Float nota) {
                return false;
            }
        };
        Avaliacoes avaliacoesActual = new Avaliacoes("",1F,null, alunos) {
            @Override
            public boolean aprovado(final Float nota) {
                return false;
            }
        };

        Assertions.assertEquals(avaliacoesRef.getTipoProva(), avaliacoesActual.getTipoProva());
        Assertions.assertEquals(avaliacoesRef.getNota(), avaliacoesActual.getNota());
        Assertions.assertEquals(avaliacoesRef.getDisciplinas(), avaliacoesActual.getDisciplinas());
        Assertions.assertEquals(avaliacoesRef.getAlunos(), avaliacoesActual.getAlunos());
    }

    @Test
    void shouldReturnIqualsWhenInstanceTwoAvaliacaoesTurmas() {
        Turmas turmas = new Turmas("", null);

        Avaliacoes avaliacoesRef = new Avaliacoes("",1F,null, turmas) {
            @Override
            public boolean aprovado(final Float nota) {
                return false;
            }
        };
        Avaliacoes avaliacoesActual = new Avaliacoes("",1F,null, turmas) {
            @Override
            public boolean aprovado(final Float nota) {
                return false;
            }
        };

        Assertions.assertEquals(avaliacoesRef.getTipoProva(), avaliacoesActual.getTipoProva());
        Assertions.assertEquals(avaliacoesRef.getNota(), avaliacoesActual.getNota());
        Assertions.assertEquals(avaliacoesRef.getDisciplinas(), avaliacoesActual.getDisciplinas());
        Assertions.assertEquals(avaliacoesRef.getTurmas(), avaliacoesActual.getTurmas());
    }
}