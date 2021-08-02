import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SetoresTest {

    @Test
    void shouldReturnEqualsWhenInstanceTwoSetores() {
        Setores setoresRef = new Setores(0, "");
        Setores setoresActual = new Setores(0, "");

        Assertions.assertEquals(setoresRef.getRisco(), setoresActual.getRisco());
        Assertions.assertEquals(setoresRef.getTipoSetor(), setoresActual.getTipoSetor());
    }
}