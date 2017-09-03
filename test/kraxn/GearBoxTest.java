/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kraxn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stefan
 */
public class GearBoxTest {

    public GearBoxTest() {
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
     * Test of setNeutral method, of class GearBox.
     */
    @Test
    public void testSetNeutral() {
        System.out.println("setNeutral");
        GearBox instance = new GearBox();
        int expResult = 0;
        int result = instance.setNeutral();
        assertEquals(expResult, result);
    }

    /**
     * Test of shiftUp method, of class GearBox.
     */
    @Test
    public void testShiftUp() {
        System.out.println("shiftUp");
        
        // first gear
        GearBox instance = new GearBox();
        int expResult = 1;
        int result = instance.shiftUp();
        assertEquals(expResult, result);

        // test all forward gears
        final int changeGear = 6;
        int counter = 1;
        int expResult2 = 0 ;
        int result2 = 0 ;
        GearBox instance2 = new GearBox() ;
        
        while (counter != changeGear) {
            expResult2 = counter;
            result2 = instance2.shiftUp();            
            assertEquals(expResult2, result2);            
            counter++;
        }
                
        // extreme cases
        // repeatedly try to shift up when in highest gear
        GearBox instance3 = new GearBox() ;
        int highestGear = 6 ;
        int result3 = 0 ;
        int expResult3 = 0 ;
        for (int i = 1 ; i <= 10 ; i++ ) {
            expResult3 = expResult3 + 1 ;
            result3 = instance3.shiftUp() ;
            if (i <= 6)
                assertEquals(expResult3, result3) ;
            else if (i > 6)
                assertEquals(6, result3) ;
        
        }
        
    }

    /**
     * Test of toString method, of class GearBox.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GearBox instance = new GearBox();
        String expResult = "  [gear box]  currentgear -> N";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
