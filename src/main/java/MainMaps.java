import java.util.*;

public class MainMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> hmap = new HashMap<>();//в своем порядке
        hmap.put("kiwi" ,50);
        hmap.put("apple" ,70);
        hmap.put("grape" ,20);
        hmap.put("orange" ,80);
        hmap.put("banana" ,70);
        System.out.println(hmap);

        LinkedHashMap<String,Integer> lmap = new LinkedHashMap<>(); //в порядке добавления
        lmap.put("kiwi" ,50);
        lmap.put("apple" ,70);
        lmap.put("grape" ,20);
        lmap.put("orange" ,80);
        lmap.put("banana" ,70);
        System.out.println(lmap);


        TreeMap<String,Integer> tmap = new TreeMap<>();  //сортировка алфавитный порядок
        tmap.put("kiwi" ,50);
        tmap.put("apple" ,70);
        tmap.put("grape" ,20);
        tmap.put("orange" ,80);
        tmap.put("banana" ,70);
       System.out.println(tmap);

        printMap(hmap);
        printMap(lmap);
        printMap(tmap);


    }

    private static void printMap(Map<String, Integer> map) {
       Set<String> set = map.keySet();
       for (String key: set){
           System.out.print(key + " => ");
           int value = map.get(key);
           System.out.println(value);

       }

        System.out.println("***********************************");
    }

}


/*

Map
         |            |
   HashMap          TreeMap
       |
 LinkedHashMap
      keys========================================
set ["kiwi", "apple", "grape", "orange", "banana"] d
       |        |       |         |          |
      50        70     20        80         70
      value======================================
 */