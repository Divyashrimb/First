import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"abc");
        map.put(2,"xyz");
        map.put(3,"bca");
        System.out.println(map);
        System.out.println(map.get(3));

        for (Map.Entry<Integer,String> m : map.entrySet()){
            if(m.getValue().equals("xyz")){
                int key = m.getKey();
                System.out.println(key);
            }
        }
    }
}

