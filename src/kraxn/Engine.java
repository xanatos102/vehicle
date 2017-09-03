package kraxn;

/**
 *
 * @author stefan
 */
public class Engine {

    private int revs;

    private final int min_revs = 0 ;
    private final int idle_revs = 700 ;
    private final int max_revs = 6500 ;

    public Engine() {
        revs = min_revs;
    }

    // instead of: if (revs > 0) ... else ...
    public boolean isRunning() {
        return revs > 0;
    }

    public int start() {
        revs = idle_revs ;
        return revs;
    }

    public int setRevs(int absRevs) {
        if (absRevs <= max_revs) {
            revs = absRevs;
        }
        return revs;
    }

    @Override
    public String toString() {
        return "  [engine]  revs -> " + String.valueOf(revs);
    }

}
