package kraxn;

/**
 *
 * @author stefan
 */
public class Car {
    
    private int speed ;
    private GearBox gearbox ;
    private Engine engine ;
    private LicencePlate licenceplate ;
    
    public Car(){
    
        speed = 0 ;
        
        gearbox = new GearBox() ;
        engine = new Engine() ;
        licenceplate = new LicencePlate() ;
    
    }
    
    public Car start() {
    
        //engine.setRevs(800) ;
        engine.start() ; 
        return this ;
    }
    
    public Car printStatus(){
    
        System.out.println(
              engine.toString() + '\n' 
           +  gearbox.toString() + '\n'
           +  licenceplate.toString() 
        ) ;
        
        return this;
    }
    
    
}
