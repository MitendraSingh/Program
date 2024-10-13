/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 31/7/24
 * Time: 3:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class ThreadLocalSingleton {
    private boolean isRoundPtb = false;

    private ThreadLocalSingleton() {
        // Initialization code here
    }

    // Factory method to create an instance
    public static ThreadLocalSingleton createInstance() {
        return new ThreadLocalSingleton();
    }

    /**
     * @param
     * @return isRoundPtb
     */
    public boolean isRoundPtb() {
        return isRoundPtb;
    }
    /**
     * @param roundPtb
     * @return void
     */
    public void setRoundPtb(boolean roundPtb) {
        this.isRoundPtb = roundPtb;
    }
}


