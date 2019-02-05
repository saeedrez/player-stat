package com.boot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.boot.controller.HomeController;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testApp() {
		HomeController homeController = new HomeController();
		String result = homeController.home();
        assertEquals( result, "Player statistics REST web application root mapping..." );
    }
}
