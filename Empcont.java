
import java.util.ArrayList;
public class Empcont {
    int id;
    String name;
    String type;

    Empcont(int a, String b, String type) {
        this.id = a;
        this.name = b;
        this.type = type;

    }
        public static void main(String[] args) {
            Empcont e1 = new Empcont(101, "a1", "Fresher");
            Empcont e2 = new Empcont(102, "bcd", "Fresher");
            Empcont e3 = new Empcont(103, "ABaC", "HR");
            Empcont e4 = new Empcont(104, "cde", "HR");
            Empcont e5 = new Empcont(105, "acd", "Admin");
            Empcont e6 = new Empcont(106, "ADC", "HR");
            Empcont e7 = new Empcont(107, "cde", "Manager");
            Empcont e8 = new Empcont(108, "abd", "Fresher");
            Empcont e9 = new Empcont(109, "BC", "Fresher");
            Empcont e10 = new Empcont(110, "cde", "Admin");

            ArrayList<Empcont> ea = new ArrayList<Empcont>();

            ea.add(e1);
            ea.add(e2);
            ea.add(e3);
            ea.add(e4);
            ea.add(e5);
            ea.add(e6);
            ea.add(e7);
            ea.add(e8);
            ea.add(e9);
            ea.add(e10);

            for (Empcont emp : ea) {
                if (emp.id % 2!= 0)
                    continue;
                {
                    System.out.println(emp.id + " " + emp.name);

                }

            }
        }
    }

