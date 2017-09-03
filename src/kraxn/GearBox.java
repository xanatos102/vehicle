package kraxn;

/**
 *
 * @author stefan
 */
public class GearBox {
    
    private Integer currentGear ;   // easier conversion for status messages
    
    public GearBox(){
        currentGear = 0 ;
    }
    

    @Override
    public String toString() {
    
       return  "  [gear box]  currentgear -> " + currentGear.toString() ;
    
    }
    
}
