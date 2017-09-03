package kraxn;

/**
 *
 * @author stefan
 */
public class GearBox {
    
    private int currentGear ;
    private final String[] gears;
    
    public GearBox(){
        gears = new String[] {"R","N","1","2","3","4","5","6"} ;
        currentGear = 1 ;
    }
    

    @Override
    public String toString() {
       return  "  [gear box]  currentgear -> " + gears[currentGear] ;
    }
    
}
