/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class GrauProficienciaTest {
    
    public GrauProficienciaTest() {
    }

 

    /**
     * Test of validaGrauProficiencia method, of class GrauProficiencia.
     */
    @Test
    public void testValidaGrauProficiencia() {
        System.out.println("validaGrauProficiencia");
        GrauProficiencia GP1= new GrauProficiencia(2,"asa");
        boolean expResult = false;
        boolean result = GP1.validaGrauProficiencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
