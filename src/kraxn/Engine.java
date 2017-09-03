package kraxn;

/**
 *
 * @author stefan
 */
public class Engine {
    
    private Integer revs ;
    
    private final int min_revs = 0 ;
    private final int max_revs = 6500 ;
    
    public Engine(){

        revs = 0 ;
    
    }
    
    public boolean isRunning(){
    
        return revs > 0;
    
    }
    
    public Integer start (){
    
        revs = 800 ;
        return revs ;
   
    }
    
    public int setRevs(int absRevs){
    
        if (absRevs <= max_revs )
          revs = absRevs ;
          
        return revs ;
    }
    
    @Override
    public String toString() {
        return  "  [engine]  revs -> " + revs.toString() ;      
    }
    
}
