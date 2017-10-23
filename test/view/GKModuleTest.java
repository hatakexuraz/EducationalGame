package view;

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
public class GKModuleTest {
    
    public GKModuleTest() {
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
     * Test of getPoint method, of class GKModule.
     */
    @Test
    public void testGetPoint() {
        System.out.println("getPoint");
        ArrayList<String> copt = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();
        
        copt.add("Lion");
        copt.add("98765");
        copt.add("4");
        copt.add("Euro");
        copt.add("Climber");
        copt.add("Bones");
        copt.add("3");
        
        
        answer.add("Cow");
        answer.add("98765");
        answer.add("4");
        answer.add("Euro");
        answer.add("Climber");
        answer.add("Bones");
        answer.add("3");
        
        GKModule instance = new GKModule();
        int expResult = 6;
        int result = instance.getPoint(copt, answer);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeDuplicate method, of class GKModule.
     */
    @Test
    public void testRemoveDuplicate() {
        System.out.println("removeDuplicate");
        ArrayList<String> copt = new ArrayList<>();
        
        copt.add("Lion");
        copt.add("Lion");
        copt.add("98765");
        copt.add("4");
        copt.add("Euro");
        copt.add("Euro");
        copt.add("Climber");
        copt.add("Bones");
        copt.add("3");        
        
        GKModule instance = new GKModule();
        ArrayList<String> expResult = new ArrayList<>();
        
        expResult.add("Lion");
        expResult.add("98765");
        expResult.add("4");
        expResult.add("Euro");
        expResult.add("Climber");
        expResult.add("Bones");
        expResult.add("3");
        
        ArrayList<String> result = instance.removeDuplicate(copt);
        assertEquals(expResult, result);
    }
    
}
