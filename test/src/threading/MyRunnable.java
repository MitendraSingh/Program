package threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 10/10/24
 * Time: 9:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("task completed");
    }
    public static void main(String args[]){
        final ExecutorService executorService = Executors.newSingleThreadExecutor();
        final MyRunnable myRunnable = new MyRunnable();
        executorService.submit(myRunnable);



        executorService.shutdown();


    }
}
