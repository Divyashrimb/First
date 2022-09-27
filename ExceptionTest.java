public class ExceptionTest {
    public static void main(String[] args) {
        int i=0;
        System.out.println("Statement ONE");
        System.out.println("Statement TWO");
        System.out.println("Statement THREE");
        try{
            int a = 10/i;
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception");
        }
        finally {
            System.out.println("Finally");// this will execute if there is exception or not

        }
            System.out.println("Statement FOUR");
            System.out.println("Statement FIVE");


    }
}

