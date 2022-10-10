class ThreadSleep extends Thread {
    int count=0;
    void Increment() throws InterruptedException {
        Thread.sleep(100);
        count++;
    }
    void Decrement(){
        count--;
    }

    @Override
    public void run() {
        try {
            Increment();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);
        Decrement();
        System.out.println(count);
    }
}
class TSleep {
    public static void main(String[] args) {
        MyThread1 t1= new MyThread1();
        MyThread1 t2=new MyThread1();
        t1.start();
        t2.start();
    }
}
