class MyThread1 extends Thread {
    int count=0;
    void Increment(){
        count++;
    }
    void Decrement(){
        count--;
    }

    @Override
    public void run() {
        Increment();
        System.out.println(count);
        Decrement();
        System.out.println(count);
    }
}
public class Increment_Decrement {
    public static void main(String[] args) {
        MyThread1 t1= new MyThread1();
        MyThread1 t2=new MyThread1();
        t1.start();
        t2.start();
    }

}
