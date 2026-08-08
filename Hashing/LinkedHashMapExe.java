import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExe{
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
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