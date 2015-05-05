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
public class GestionCursoTest {
    
    public GestionCursoTest() {
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
     * Test of modificarCurso method, of class GestionCurso.
     */
    @Test
    public void testModificarCurso() {
        System.out.println("modificarCurso");
        int id = 0;
        String curso = "AutoCAD";
        GestionCurso instance = new GestionCurso();
        boolean expResult = true;
        boolean result = instance.modificarCurso(id, curso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of nuevoCurso method, of class GestionCurso.
     */
    @Test
    public void testNuevoCurso() {
        System.out.println("nuevoCurso");
        String curso = "Civil3D";
        GestionCurso instance = new GestionCurso();
        boolean expResult = true;
        boolean result = instance.nuevoCurso(curso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarCurso method, of class GestionCurso.
     */
    @Test
    public void testBorrarCurso_String() {
        System.out.println("borrarCurso");
        String curso = "Excel";
        GestionCurso instance = new GestionCurso();
        boolean expResult = true;
        boolean result = instance.borrarCurso(curso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarCurso method, of class GestionCurso.
     */
    @Test
    public void testBorrarCurso_int() {
        System.out.println("borrarCurso");
        int id = 1;
        GestionCurso instance = new GestionCurso();
        boolean expResult = true;
        boolean result = instance.borrarCurso(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCursos method, of class GestionCurso.
     */
    @Test
    public void testObtenerCursos() {
        System.out.println("obtenerCursos");
        GestionCurso instance = new GestionCurso();
        ArrayList expResult = null;
        ArrayList result = instance.obtenerCursos();
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}