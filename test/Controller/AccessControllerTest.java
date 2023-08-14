/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MINH
 */
public class AccessControllerTest {
    
    public AccessControllerTest() {
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
     * Test of login method, of class AccessController.
     */
    @Test
    public void testLogin() {
        AccessController instance = new AccessController();
        
        // Test case 1: Valid account
        String username1 = "admin";
        String password1 = "123";
        boolean result1 = instance.login(username1, password1);
        assertEquals(true, result1);

        // Test case 2: Invalid username
        String username2 = "fanMrNghia1@@";
        String password2 = "123";
        boolean result2 = instance.login(username2, password2);
        assertEquals(false, result2);

        // Test case 3: Invalid password
        String username3 = "admin";
        String password3 = "fanMrNghia1@@";
        boolean result3 = instance.login(username3, password3);
        assertEquals(false, result3);

        // Test case 4: Both invalid
        String username4 = "fanMrNghia1@@123";
        String password4 = "fanMrNghia1@@";
        boolean result4 = instance.login(username4, password4);
        assertEquals(false, result4);
    }
    
}
