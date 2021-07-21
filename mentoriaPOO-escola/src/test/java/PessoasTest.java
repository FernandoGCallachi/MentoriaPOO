import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class PessoasTest {
    @Test
    void shouldReturnIqualsWhenInstanceTwoPessoas() {
        var id = UUID.randomUUID();
        Pessoas pessoasRef = new Pessoas(id, "", "", "") {
            @Override
            public boolean ativo() {
                return false;
            }
        };
        Pessoas pessoasAcutal = new Pessoas(id, "", "", "") {
            @Override
            public boolean ativo() {
                return false;
            }
        };

        Assertions.assertEquals(pessoasRef.getId(), pessoasAcutal.getId());
        Assertions.assertEquals(pessoasRef.getNome(), pessoasAcutal.getNome());
        Assertions.assertEquals(pessoasRef.getEmail(), pessoasAcutal.getEmail());
        Assertions.assertEquals(pessoasRef.getCpf(), pessoasAcutal.getCpf());
    }

}