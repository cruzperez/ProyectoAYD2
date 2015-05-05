/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
public class ModuloProgramasTest {
    
    public ModuloProgramasTest() {
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
     * Test of modificarPrograma method, of class ModuloProgramas.
     */
    @Test
    public void testModificarPrograma() {
        System.out.println("modificarPrograma");
        int id = 100;
        String nombre = "abc";
        ModuloProgramas instance = new ModuloProgramas();
        boolean expResult = true;
        boolean result = instance.modificarPrograma(id, nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of nuevoPrograma method, of class ModuloProgramas.
     */
    @Test
    public void testNuevoPrograma() {
        System.out.println("nuevoPrograma");
        String nombre = "Civil3D";
        ModuloProgramas instance = new ModuloProgramas();
        boolean expResult = true;
        boolean result = instance.nuevoPrograma(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarPrograma method, of class ModuloProgramas.
     */
    @Test
    public void testBorrarPrograma_String() {
        System.out.println("borrarPrograma");
        String nombre = "AutoCAD";
        ModuloProgramas instance = new ModuloProgramas();
        boolean expResult = true;
        boolean result = instance.borrarPrograma(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarPrograma method, of class ModuloProgramas.
     */
    @Test
    public void testBorrarPrograma_int() {
        System.out.println("borrarPrograma");
        int id = 0;
        ModuloProgramas instance = new ModuloProgramas();
        boolean expResult = true;
        boolean result = instance.borrarPrograma(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerProgramas method, of class ModuloProgramas.
     */
    @Test
    public void testObtenerProgramas() {
        System.out.println("obtenerProgramas");
        ModuloProgramas instance = new ModuloProgramas();
        ArrayList expResult = null;
        ArrayList result = instance.obtenerProgramas();
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerProgramasNombre method, of class ModuloProgramas.
     */
    @Test
    public void testObtenerProgramasNombre() {
        System.out.println("obtenerProgramasNombre");
        ModuloProgramas instance = new ModuloProgramas();
        ArrayList expResult = null;
        ArrayList result = instance.obtenerProgramasNombre();
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarProgramaSalon method, of class ModuloProgramas.
     */
    @Test
    public void testModificarProgramaSalon() {
        System.out.println("modificarProgramaSalon");
        int id = 0;
        int id2 = 0;
        int nombre = 0;
        int nombre2 = 0;
        ModuloProgramas instance = new ModuloProgramas();
        boolean expResult = true;
        boolean result = instance.modificarProgramaSalon(id, id2, nombre, nombre2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of nuevoProgramaSalon method, of class ModuloProgramas.
     */
    @Test
    public void testNuevoProgramaSalon() {
        System.out.println("nuevoProgramaSalon");
        String nombre = "WinQSB";
        String nombre2 = "India 3";
        ModuloProgramas instance = new ModuloProgramas();
        boolean expResult = true;
        boolean result = instance.nuevoProgramaSalon(nombre, nombre2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarProgramaSalon method, of class ModuloProgramas.
     */
    @Test
    public void testBorrarProgramaSalon_String_String() {
        System.out.println("borrarProgramaSalon");
        String nombre = "WinQSB";
        String nombre2 = "India 3";
        ModuloProgramas instance = new ModuloProgramas();
        boolean expResult = true;
        boolean result = instance.borrarProgramaSalon(nombre, nombre2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarProgramaSalon method, of class ModuloProgramas.
     */
    @Test
    public void testBorrarProgramaSalon_int_int() {
        System.out.println("borrarProgramaSalon");
        int id = 0;
        int id2 = 0;
        ModuloProgramas instance = new ModuloProgramas();
        boolean expResult = true;
        boolean result = instance.borrarProgramaSalon(id, id2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
