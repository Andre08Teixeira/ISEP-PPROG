import org.junit.Test;
import static org.junit.Assert.*;

public class CreditoHabitacaoTest {
    
    public CreditoHabitacaoTest() {
    }


    /**
     * Teste do método calcularMontanteAReceberPorCadaCredito, da classe CreditoHabitacao.
     */
    @Test
    public void testCalcularMontanteAReceberPorCadaCreditoTrue() {
        System.out.println("calcularMontanteAReceberPorCadaCredito");
        CreditoHabitacao instance = new CreditoHabitacao("João", "Trolha", 120000, 240, 1);
        double expResult = 146510.0;
        double result = instance.calcularMontanteAReceberPorCadaCredito();
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testCalcularMontanteAReceberPorCadaCreditoFalse() {
        System.out.println("calcularMontanteAReceberPorCadaCredito");
        CreditoHabitacao instance = new CreditoHabitacao("João", "Trolha", 120000, 240, 1);
        double expResult = 146520.0;
        double result = instance.calcularMontanteAReceberPorCadaCredito();
        assertNotEquals(expResult, result, 0.0);
    }

    /**
     * Teste do método calcularMontanteTotalJuros, da classe CreditoHabitacao.
     */
    @Test
    public void testCalcularMontanteTotalJurosTrue() {
        System.out.println("calcularMontanteTotalJuros");
        CreditoHabitacao instance = new CreditoHabitacao("João", "Trolha", 120000, 240, 1);
        double expResult = 26510.0;
        double result = instance.calcularMontanteTotalJuros();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularMontanteTotalJurosFalse() {
        System.out.println("calcularMontanteTotalJuros");
        CreditoHabitacao instance = new CreditoHabitacao("João", "Trolha", 120000, 240, 1);
        double expResult = 26500.0;
        double result = instance.calcularMontanteTotalJuros();
        assertNotEquals(expResult, result, 0.0);
    }

    
}
