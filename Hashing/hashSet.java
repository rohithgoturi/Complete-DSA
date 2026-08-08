import java.util.HashMap;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 140);
        map.put("America", 120);
        map.put("Nepal", 30);
        map.put("Japan", 60);
        map.put("SriLanka", 20);

        //creating a set
        Set<String> keys = map.keySet();
        System.out.println(keys);

        //iterating Set
        for(String s : keys){
            System.out.println("key = "+s+", value = "+map.get(s));
        }
    }
}
