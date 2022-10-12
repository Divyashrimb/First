class DemoSyn {
        int count = 0;


     /* synchronized void increment() { //without synchronized the output is different everytime
        count++;
        //return count;
    }*/
    void increment(){
        System.out.println("Not Synchronized"+Thread.currentThread().getName());
        synchronized (this){
            count++;
        }
    }

    public static void main(String[] args) throws Exception {
           DemoSyn d=new DemoSyn();
           /* d.increment();
            for (int i=0;i<100;i++){
                d.increment();*/

            // System.out.println(d.count);
            class T1 extends Thread {
                //Demo d1 = new Demo();

                public void run() {
                    //d1.increment();
                    for (int i = 0; i < 1000; i++) {
                        d.increment();
                    }

                }
            }
            class T2 extends Thread {
                //Demo d2 = new Demo();

                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        d.increment();
                    }
                    d.increment();
                }
            }


            T1 obj = new T1();
            obj.start();
            T2 obj1= new T2();
            obj1.start();
            //obj1.join();
Thread.sleep(1000);
        System.out.println(d.count);


        }
    }

