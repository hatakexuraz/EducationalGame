package view;

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
public class PointTest {

    /**
     * Test of savePoint method, of class Point.
     */
    @Test
    public void testSavePoint() {
        System.out.println("savePoint");
        int point = 10;
        int user = 1;
        String chapter = "Arithmetics";
        Point instance = new Point();
        instance.savePoint(point, user, chapter);
    }
    
}
