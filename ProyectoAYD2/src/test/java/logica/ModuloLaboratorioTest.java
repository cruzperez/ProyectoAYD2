/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
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
public class ModuloLaboratorioTest {
    
    public ModuloLaboratorioTest() {
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
     * Test of modificarSalon method, of class ModuloLaboratorio.
     */
    @Test
    public void testModificarSalon() {
        System.out.println("modificarSalon");
        int id = 0;
        String salon = "LCE";
        int capacidad = 10;
        ModuloLaboratorio instance = new ModuloLaboratorio();
        boolean expResult = true;
        boolean result = instance.modificarSalon(id, salon, capacidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of nuevoSalon method, of class ModuloLaboratorio.
     */
    @Test
    public void testNuevoSalon() {
        System.out.println("nuevoSalon");
        String salon = "INDIA1";
        int capacidad = 20;
        ModuloLaboratorio instance = new ModuloLaboratorio();
        boolean expResult = true;
        boolean result = instance.nuevoSalon(salon, capacidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarSalon method, of class ModuloLaboratorio.
     */
    @Test
    public void testBorrarSalon_String() {
        System.out.println("borrarSalon");
        String salon = "LCE";
        ModuloLaboratorio instance = new ModuloLaboratorio();
        boolean expResult = true;
        boolean result = instance.borrarSalon(salon);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarSalon method, of class ModuloLaboratorio.
     */
    @Test
    public void testBorrarSalon_int() {
        System.out.println("borrarSalon");
        int id = 1;
        ModuloLaboratorio instance = new ModuloLaboratorio();
        boolean expResult = true;
        boolean result = instance.borrarSalon(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerSalones method, of class ModuloLaboratorio.
     
    @Test
    public void testObtenerSalones() {
        System.out.println("obtenerSalones");
        ModuloLaboratorio instance = new ModuloLaboratorio();
        ArrayList expResult = null;
        ArrayList result = instance.obtenerSalones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of obtenerSalonesNombre method, of class ModuloLaboratorio.
     
    @Test
    public void testObtenerSalonesNombre() {
        System.out.println("obtenerSalonesNombre");
        ModuloLaboratorio instance = new ModuloLaboratorio();
        ArrayList expResult = null;
        ArrayList result = instance.obtenerSalonesNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of obtenerSalonesCapacidad method, of class ModuloLaboratorio.
     
    @Test
    public void testObtenerSalonesCapacidad() {
        System.out.println("obtenerSalonesCapacidad");
        ModuloLaboratorio instance = new ModuloLaboratorio();
        ArrayList expResult = null;
        ArrayList result = instance.obtenerSalonesCapacidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of reservarLaboratorio method, of class ModuloLaboratorio.
     
    @Test
    public void testReservarLaboratorio() {
        System.out.println("reservarLaboratorio");
        String salon = "";
        int dia0 = 0;
        int dia1 = 0;
        int mes0 = 0;
        int mes1 = 0;
        int anno0 = 0;
        int anno1 = 0;
        int hora0 = 0;
        int hora1 = 0;
        String encargado = "";
        ModuloLaboratorio instance = new ModuloLaboratorio();
        boolean expResult = false;
        boolean result = instance.reservarLaboratorio(salon, dia0, dia1, mes0, mes1, anno0, anno1, hora0, hora1, encargado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}