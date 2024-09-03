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
public class ClassificacaoTest {
    
    public ClassificacaoTest() {
    }

    /**
     * Test of compareTo method, of class Classificacao.
     */
    @org.junit.Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Classificacao O1 = new Classificacao (1);
        Classificacao instance = O1;
        int expResult = 0;
        int result = instance.compareTo(O1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
