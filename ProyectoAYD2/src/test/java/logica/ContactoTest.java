/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cruz
 */
public class ContactoTest {
    
    public ContactoTest() {
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
     * Test of autenticarDireccion method, of class Contacto.
     */
    @Test
    public void testAutenticarDireccion() {
        System.out.println("autenticarDireccion");
        String direccion = "direccion@gmail.com";
        Contacto instance = new Contacto();
        boolean expResult = true;
        boolean result = instance.autenticarDireccion(direccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of enviarCorreo method, of class Contacto.
     */
    @Test
    public void testEnviarCorreo() {
        System.out.println("enviarCorreo");
        String mensaje = "Mensaje de prueba";
        String destino = "lextercruz@hotmail.com";
        String asunto = "[AYD2]";
        Contacto instance = new Contacto();
        boolean expResult = true;
        boolean result = instance.enviarCorreo(mensaje, destino, asunto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}