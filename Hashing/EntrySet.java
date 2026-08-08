import java.util.HashMap;
import java.util.Map;

public class EntrySet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 140);
        map.put("America", 120);
        map.put("Nepal", 30);
        map.put("Japan", 60);
        map.put("SriLanka", 20);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
    }
}
