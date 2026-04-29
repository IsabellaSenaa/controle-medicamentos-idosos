package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ViaCepServiceTest {
    @Test
    public void deveBuscarCepValido() {
        String resposta = ViaCepService.buscarCep("01001000");

        assertNotNull(resposta);
        assertTrue(resposta.contains("logradouro"));
    }
}
