import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

class T1 implements Callable<Integer> {
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return new Random().nextInt();
    }
}
public class RemoveCallThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        List<Future> l = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<Integer> future = service.submit(new Task1());
            future.get();//holds the place not the value
            //System.out.println(future.get());
            l.add(future);
            l.remove(0);

        }
        //l.remove(0);

        for (Future l1:l) {//l is the object created in arraylist
            System.out.println(l1.get());

        }
    }
}
