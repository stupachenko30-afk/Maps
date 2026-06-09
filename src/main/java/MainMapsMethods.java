import java.util.*;

public class MainMapsMethods {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> lmap = new LinkedHashMap<>(); //в порядке добавления
        lmap.put("kiwi" ,50);
        lmap.put("apple" ,70);
        lmap.put("grape" ,20);
        lmap.put("orange" ,80);
        lmap.put("banana" ,70);

        System.out.println(lmap);

        int value = lmap.get("grape");
        System.out.println(value);
        lmap.put("banana" ,20);
        System.out.println(lmap);
        boolean res = lmap.containsKey("apple");
        System.out.println(res);
        Set<String> keys = lmap.keySet();
        System.out.println(keys);
        lmap.remove("orange");
        System.out.println(lmap);
        lmap.remove("grape", 30); //удалит только при полном совпадении
        System.out.println(lmap);
        lmap.replace("grape",45);
        System.out.println(lmap);
        lmap.replace("grape", 45, 67);
        System.out.println(lmap);

    }
}
/*
HOMEWORK
1. Create class MainMapsCollection
   HashMap, LinkedHashMap, TreeMap

   ["Berlin", "Tel-Aviv", "" ......... ]
        |           |
    3000000     5000000
    printCitiesMap(Map<> map)

    Berlin => 3000000
    .............
 */