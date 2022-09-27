public class ExceptionNew {
    public static void main(String[] args) {

        System.out.println("Statement ONE");
        System.out.println("Statement TWO");
        System.out.println("Statement THREE");
        int[] i = new int[5]; //Defining an array
        try {
            try {
                int a = 10 / 0;
                //System.out.println(i[6]);
            }
            catch (ArithmeticException e) {
                System.out.println(e);
                System.out.println("Exception");
            }
            System.out.println(i[6]);
        }
        catch (IndexOutOfBoundsException e1) {
                System.out.println(e1);
            }

        finally {
            System.out.println("Finally");// this will execute if there is exception or not

        }
        System.out.println("Statement FOUR");
        System.out.println("Statement FIVE");

    }
}

