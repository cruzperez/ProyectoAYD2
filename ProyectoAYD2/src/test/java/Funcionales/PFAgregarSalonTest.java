/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionales;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import org.junit.Before;
import org.junit.Test;
import com.thoughtworks.selenium.*;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

/**
 *
 * @author bray
 */
public class PFAgregarSalonTest extends SeleneseTestBase {
    
  private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost:8084/PruebaProyecto/Operacion");
		selenium.start();
	}

	@Test
	public void testPFAgregarSalon() throws Exception {
		selenium.open("/ProyectoAYD2/index.html");
		selenium.click("link=Salones");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Agregar Salon");
		selenium.waitForPageToLoad("30000");
		selenium.type("name=nombre", "Korea center2");
		selenium.type("name=capacidad", "20");
		selenium.click("name=guardar");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
    
}
