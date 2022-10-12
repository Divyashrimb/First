import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.*;

class RunThread implements Runnable {
    public void run() {
        System.out.println("My Thread"+ Thread.currentThread().getName());
    }
}
class RunnableThread{
    public static void main(String[] args) {
        RunThread r = new RunThread();
        Thread t1 = new Thread(r);
        t1.start();

        }
}
