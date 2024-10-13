/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 31/7/24
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class ThreadLocalSingletonHolder {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            ThreadLocal.withInitial(ThreadLocalSingleton::createInstance);

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
    public static void   remove() {
        threadLocalInstance.remove();
    }
}
