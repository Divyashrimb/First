class A2 {
    synchronized void Odd() throws InterruptedException {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Thread  --"+i);
                Thread.sleep(1000);
                notifyAll();
            } else {
                //notifyAll();
                wait();
            }
        }
    }
    synchronized void Even() throws InterruptedException {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Thread --"+i);
                notifyAll();
            } else {
                //notifyAll();
                wait();
            }
        }
    }
}
public class WaitAndNotify {
    public static void main(String[] args) {
        A2 a = new A2();
        class Thread1 extends Thread {
            public void run() {
                try {
                    a.Odd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
        class Thread2 extends Thread {
            public void run() {
                try {
                    a.Even();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
    }
}