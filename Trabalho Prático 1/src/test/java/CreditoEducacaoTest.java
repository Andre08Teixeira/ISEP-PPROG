import org.junit.Test;
import static org.junit.Assert.*;
public class CreditoEducacaoTest {
    
    public CreditoEducacaoTest() {
    }

    /**
     * Teste do método calcularMontanteAReceberPorCadaCredito, da classe CreditoEducacao.
     */
    @Test
    public void testCalcularMontanteAReceberPorCadaCreditoTrue() {
        System.out.println("calcularMontanteAReceberPorCadaCredito");
        CreditoEducacao instance = new CreditoEducacao("Elsa", "Eletricista", 18000, 60,24);
        double expResult = 19275.0;
        double result = instance.calcularMontanteAReceberPorCadaCredito();
        assertEquals(expResult, result, 0.0);
                
    }
    
    @Test
    public void testCalcularMontanteAReceberPorCadaCreditoFalse() {
        System.out.println("calcularMontanteAReceberPorCadaCredito");
        CreditoEducacao instance = new CreditoEducacao("Elsa", "Eletricista", 18000, 60,24);
        double expResult = 19280.0;
        double result = instance.calcularMontanteAReceberPorCadaCredito();
        assertNotEquals(expResult, result, 0.0);
                
    }

    /**
     * Teste do método calcularMontanteTotalJuros, da classe CreditoEducacao.
     */
    @Test
    public void testCalcularMontanteTotalJurosTrue() {
        System.out.println("calcularMontanteTotalJuros");
        CreditoEducacao instance = new CreditoEducacao("Elsa", "Eletricista", 18000, 60,24);
        double expResult = 1275.0;
        double result = instance.calcularMontanteTotalJuros();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularMontanteTotalJurosFalse() {
        System.out.println("calcularMontanteTotalJuros");
        CreditoEducacao instance = new CreditoEducacao("Elsa", "Eletricista", 18000, 60,24);
        double expResult = 1290.0;
        double result = instance.calcularMontanteTotalJuros();
        assertNotEquals(expResult, result, 0.0);
    }
    
}
