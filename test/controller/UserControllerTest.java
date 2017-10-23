package controller;

import model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hatake_47
 */
public class UserControllerTest {
    
    public UserControllerTest() {
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
     * Test of authenticate method, of class UserController.
     */
    @Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        User user = new User();
        
        user.setUsername("suraz");
        
        UserController instance = new UserController();
        int expResult = 1;
        int result = instance.authenticate(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of userRegister method, of class UserController.
     */
    @Test
    public void testUserRegister() {
        System.out.println("userRegister");
        User usr = new User();
        
        usr.setFirstName("test");
        usr.setLastName("test");
        usr.setAddress("test");
        usr.setSchoolName("test");
        usr.setUsername("test");
        
        UserController instance = new UserController();
        int expResult = 1;
        int result = instance.userRegister(usr);
        assertEquals(expResult, result);
    }
    
}
