import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoasTest {
    @Test
    void shouldReturnEqualsWhenInstanceTwoPeople() {
        Pessoas pessoasRef = new Pessoas(
                "nome",
                null,
                "@@",
                "998766...",
                "123456..."
        );
        Pessoas pessoasActual = new Pessoas(
                "nome",
                null,
                "@@",
                "998766...",
                "123456..."
        );

        assertEquals(pessoasRef.getNome(), pessoasActual.getNome());
        assertEquals(pessoasRef.getDateNascimento(), pessoasActual.getDateNascimento());
        assertEquals(pessoasRef.getEmail(), pessoasActual.getEmail());
        assertEquals(pessoasRef.getTelefone(), pessoasActual.getTelefone());
        assertEquals(pessoasRef.getCpf(), pessoasActual.getCpf());
    }
}