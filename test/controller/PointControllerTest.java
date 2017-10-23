package controller;

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
public class PointControllerTest {
    
    public PointControllerTest() {
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
     * Test of getPoint method, of class PointController.
     */
    @Test
    public void testGetPoint() {
        System.out.println("getPoint");
        int user = 1;
        String chapter = "Arithmetics";
        PointController instance = new PointController();
        int expResult = 10;
        int result = instance.getPoint(user, chapter);
        assertEquals(expResult, result);
    }
    
}
