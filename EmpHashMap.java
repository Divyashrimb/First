import java.util.HashMap;
import java.util.Map;

public class EmpHashMap {
    int id;
    String name;
    EmpHashMap(int a,String name){
        this.id = a;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n" +id +":"+ name ;
    }

    public static void main(String[] args) {
        Map<EmpHashMap,Integer> m = new HashMap<EmpHashMap,Integer>();
        EmpHashMap e = new EmpHashMap(1,"Divya");
        EmpHashMap e1 = new EmpHashMap(2,"Ayesha");
        EmpHashMap e2 = new EmpHashMap(3,"xya");
        EmpHashMap e3 = new EmpHashMap(4,"bca");
        EmpHashMap e4 = new EmpHashMap(5,"abc");
        EmpHashMap e5 = new EmpHashMap(6,"hja");
        EmpHashMap e6 = new EmpHashMap(4,"bca");


        m.put(e, e.id);
        m.put(e1, e1.id);
        m.put(e2, e2.id);
        m.put(e3, e3.id);
        m.put(e4, e4.id);
        m.put(e5, e5.id);
        m.put(e6, e6.id);
        System.out.println(m);

    }
}


