package kraxn;

/**
 *
 * @author stefan
 */
public class GearBox {

    private int currentGear ;
    private final String[] gears ;
    private final String reverse_gear ; 

    public GearBox() {
        gears = new String[]{"N", "1", "2", "3", "4", "5", "6"} ;
        reverse_gear = "R" ;
        currentGear = 0 ;  // neutral
    }

    public int setNeutral() {
        currentGear = 0;
        return currentGear;
    }

    public int shiftUp() {
        if (currentGear < gears.length - 1 ) {
            currentGear++ ;
        } else { 
           // do nothing 
        }
           
        return currentGear;
        
    }

    @Override
    public String toString() {
        return "  [gear box]  currentgear -> " + gears[currentGear];
    }

}
