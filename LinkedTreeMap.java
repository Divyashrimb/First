import java.util.Map;
import java.util.TreeMap;

public class LinkedTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(3,"abc");
        map.put(2,"xyz");
        map.put(1,"bca");
        System.out.println(map);
        System.out.println(map.get(3));

        for (Map.Entry<Integer,String> m : map.entrySet()) {
            if (m.getValue().equals("xyz")) {
                int k = m.getKey();
                System.out.println(k);
            }
        }
        
    }
}

