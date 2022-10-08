import java.util.HashMap;
import java.util.Map;

public class EmpMap {
    int id;
    String name;
    EmpMap(int a,String b){
        this.id = a;
        this.name = b;
    }

    @Override
    public String toString() {
        return "EmpMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map<EmpMap,Integer> m = new HashMap<>();
        EmpMap e = new EmpMap(1,"Divya");
        EmpMap e1 = new EmpMap(1,"Ayesha");
        EmpMap e2 = new EmpMap(1,"Divya");
        EmpMap e3 = new EmpMap(1,"Basava");

        m.put(e,e.id);
        m.put(e1,e1.id);
        m.put(e2,e2.id);
        m.put(e3,e3.id);
        System.out.println(m);


    }
}

