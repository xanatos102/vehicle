package kraxn;

/**
 *
 * @author stefan
 */
public class LicencePlate {
    
    private String licencePlateString ;
    
    public LicencePlate()
    {
       licencePlateString = "RANDOM 1" ;
    }
    
    @Override
    public String toString(){
        return "  [licence plate]  string/text -> " + licencePlateString ;
    }
}
