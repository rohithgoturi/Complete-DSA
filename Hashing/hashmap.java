import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {

        //hashmap def
        HashMap<String, Integer> map = new HashMap<>();

        //insertion - O(1)
        map.put("India", 01);
        map.put("China", 02);
        map.put("USA", 03);
        System.out.println(map);

        //searching - O(1)
        int rank = map.get("India");
        System.out.println(rank);

        //contains - check existance
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Pakistan"));

        //delete - O(1)
        System.out.println(map.remove("China"));
        System.out.println(map);

        //size of hashmap
        System.out.println(map.size());

        //check isEmpty
        System.out.println(map.isEmpty());
    }
}
