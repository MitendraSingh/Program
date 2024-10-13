/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 31/7/24
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class ThreadLocalSingletonExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            ThreadLocalSingleton instance = ThreadLocalSingletonHolder.getInstance();
            System.out.println(Thread.currentThread().getName() + " isPrintptb: " + instance.isRoundPtb() +"   "+ instance);
            instance.setRoundPtb(true);
            System.out.println(Thread.currentThread().getName() + " Printptb after set true :  " + instance.isRoundPtb() + "    "+instance);
            System.out.println(Thread.currentThread().getName() + " instance: " + instance);
            //ThreadLocalSingletonHolder.remove();
            instance= ThreadLocalSingletonHolder.getInstance();
            System.out.println(Thread.currentThread().getName() + " instance: " + instance);

        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
