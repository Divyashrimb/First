public class MyThread extends Thread{
    public void run(){
        System.out.println("Thread running..."+Thread.currentThread().getName());
        for (int i=1;i<=10;i++){
            System.out.println(i+" First");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread n = new MyThread();
        //MyThread n1 = new MyThread();
        System.out.println("Thread running..."+Thread.currentThread().getName());
        n.start();

        n.setName("MyThread");//Initially it will be "Thread 0" Setname gives the thread name as MyThread
        //n1.start();//this gives the name as Thread-1
        n.join();
        for (int i=1;i<=10;i++){
            System.out.println(i+" Second");
        }
    }
}

