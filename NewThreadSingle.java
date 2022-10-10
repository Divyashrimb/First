import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Task extends Thread {
    public void run(){
        System.out.println("MyFirstThread  "+Thread.currentThread().getName());
    }
}

public class NewThreadSingle {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        for (int i = 0; i <= 10; i++) {
            service.execute(new Task());
        }
    }
}
