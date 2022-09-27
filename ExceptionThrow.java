
public class ExceptionThrow {
    public static void main(String[] args) throws InvalidAgeException{
        int age=15;
        if(age<18){
            throw new ArithmeticException("You must be at least 18 years old");
        }
        else{
            System.out.println("You are above 18");
        }
    }
}
 class InvalidAgeException extends Exception{
  InvalidAgeException(String s){  //constructor
    super(s);
}
}
