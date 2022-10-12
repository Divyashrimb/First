import java.util.Random;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tt1 implements Runnable {
    public void run() {
        System.out.println("My Thread"+Thread.currentThread().getName());

    }
}
class RunnableWithExecutorService {
    public static void main(String[] args) {
        int noOfCore = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newCachedThreadPool();
        //ExecutorService service = Executors.newFixedThreadPool(noOfCore);
        for (int i = 0; i < 100; i++) {
            service.execute((Runnable) new Tt1());
            Tt1 t = new Tt1();
        }

    }
}
