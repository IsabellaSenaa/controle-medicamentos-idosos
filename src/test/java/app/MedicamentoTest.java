package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedicamentoTest {

    @Test
    void testCriacaoMedicamento() {
        Medicamento m = new Medicamento("Dipirona", "08:00");

        assertEquals("Dipirona", m.getNome());
        assertEquals("08:00", m.getHorario());
        assertFalse(m.isTomado());
    }

    @Test
    void testMarcarComoTomado() {
        Medicamento m = new Medicamento("Paracetamol", "12:00");

        m.marcarComoTomado();

        assertTrue(m.isTomado());
    }

    @Test
    void testMedicamentoNaoTomadoInicialmente() {
        Medicamento m = new Medicamento("Ibuprofeno", "18:00");

        assertFalse(m.isTomado());
    }
}