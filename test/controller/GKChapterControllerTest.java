package controller;

import java.util.ArrayList;
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
public class GKChapterControllerTest {
    
    public GKChapterControllerTest() {
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
     * Test of getContent method, of class GKChapterController.
     */
    @Test
    public void testGetContent() {
        System.out.println("getContent");
        int id = 1;
        GKChapterController instance = new GKChapterController();
        ArrayList expResult = new ArrayList();
        
        expResult.add("4032 ? 32=126. Which of these is FALSE?");
        expResult.add("126 ? 32=4032");
        
        ArrayList result = instance.getContent(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getOptions method, of class GKChapterController.
     */
    @Test
    public void testGetOptions() {
        System.out.println("getOptions");
        int id = 1;
        GKChapterController instance = new GKChapterController();
        ArrayList expResult = new ArrayList();
        
        expResult.add("4032 ? 126=32 sp 126*32=4032 sp 126 ? 32=4032 sp None of these");
        expResult.add("1");
        
        ArrayList result = instance.getOptions(id);
        assertEquals(expResult, result);
    }
    
}
