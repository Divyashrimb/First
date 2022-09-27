import java.util.Scanner;
public class Validemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email: ");
        String s = sc.next();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        boolean r = s.matches(regex);            
        if(r) {
            System.out.println("Given email-id is valid");
        }
        else {
            System.out.println("Given email-id is not valid");
        }
    }
}

