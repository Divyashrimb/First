class A{
    int a,b;
    void Odd(){
        for (int i = 0; i <=10; i++) {
            if (i%2!=0){
                System.out.print(i);
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
public class Practice {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Odd");
        a.Odd();
        System.out.println("\nEven");
        a.Even();
    }
}
