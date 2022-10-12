import java.util.*;
class A1{
       void Odd(){
        for (int i = 0; i <=10; i++) {
            if (i%2!=0){
                System.out.println(i);

            }
        }
    }
    void Even(){
        for (int i = 0; i <=10; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}

public class PracticeThread {
    public static void main(String[] args) throws InterruptedException {
        A1 a = new A1();
        class Thread1 extends Thread {
            public void run() {
                a.Odd();
                //a.Even();

            }
        }
         class Thread2 extends Thread {
            public void run() {
                //a.Odd();
                a.Even();

            }
        }
        Thread1 t1 = new Thread1();
        t1.start();

        Thread2 t2 = new Thread2();
        t2.start();
    }
}
