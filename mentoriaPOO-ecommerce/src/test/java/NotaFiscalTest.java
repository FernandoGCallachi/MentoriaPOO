import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotaFiscalTest {
    @Test
    void shouldReturnIqualsWhenInstanceTwoNotaFiscal() {
        NotaFiscal notaFiscalRef = new NotaFiscal("", 1, 1, 1, "");
        NotaFiscal notaFiscalActual = new NotaFiscal("", 1, 1, 1, "");

        assertEquals(notaFiscalRef.getPrestador(), notaFiscalActual.getPrestador());
        assertEquals(notaFiscalRef.getValorServico(), notaFiscalActual.getValorServico());
        assertEquals(notaFiscalRef.getImposto(), notaFiscalActual.getImposto());
        assertEquals(notaFiscalRef.getValorNota(), notaFiscalActual.getValorNota());
        assertEquals(notaFiscalRef.getInfoADD(), notaFiscalActual.getInfoADD());
    }
}