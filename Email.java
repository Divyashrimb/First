import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher m = p.matcher("basavadivya@gmail.com");
        boolean b = m.matches();
        boolean b2=Pattern.compile(".s").matcher("as").matches();
        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b);
        //System.out.println();
    }
}

