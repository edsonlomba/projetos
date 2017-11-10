/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tia41525388;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 41525388
 */
public class CalculosTest {
    
    public CalculosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calc method, of class Calculos.
     */
    @Test
    public void testCalc() {
        Calculos c = new Calculos();

        int[] digitos = new int[8];

        digitos[0] = 4;
        digitos[1] = 1;
        digitos[2] = 5;
        digitos[3] = 2;
        digitos[4] = 5;
        digitos[5] = 3;
        digitos[6] = 8;
        digitos[7] = 8;

        assertEquals(36, c.calc(digitos, 1), 0.0);
        assertEquals(4.5, c.calc(digitos, 2), 0.0);
        assertEquals(8, c.calc(digitos, 3), 0.0);
        assertEquals(1, c.calc(digitos, 4), 0.0);
        assertEquals(5, c.calc(digitos, 5), 0.0);
        assertEquals(4, c.calc(digitos, 6), 0.0);
        assertEquals(4, c.calc(digitos, 7), 0.0);
        assertEquals(0.5, c.calc(digitos, 8), 0.0);
        assertEquals(38400, c.calc(digitos, 9), 0.0);
        assertEquals(600, c.calc(digitos, 10), 0.0);
        /*Comentario*/
    }
    
}
