package collections.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * MAP interface DOES NOt extend the collection interface
 */
public class MapExample {
    public static void main(String[] args) {
        Map<String , String> partMap  = new TreeMap<>();

        partMap.put("1","blue");
        partMap.put("2","blue Shirt");
        partMap.put("3","black Shirt");
        partMap.put("4","white Shirt");
        partMap.put("3","hat");
        partMap.put("5","hat");

        Set<String> keys = partMap.keySet();

        System.out.println(partMap);

        for (String key:keys) {
            System.out.println("key "+key+" : "+partMap.get(key));
        }
    }
}
