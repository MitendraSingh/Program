package threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 10/10/24
 * Time: 8:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() {
        System.out.println("Executed call");
       return "Task Completed" ;

    }
    public static void main(String args[]){
        final ExecutorService executorService = Executors.newSingleThreadExecutor();
        final Callable<String> myCallable = new MyCallable();
        final Future<String> submit = executorService.submit(myCallable);
        try {
            executorService.shutdown();
            System.out.println(submit.isDone());
            System.out.println(submit.get());
        }catch (Exception e){
            e.getStackTrace();
        }


        //executorService.shutdown();

    }
}
