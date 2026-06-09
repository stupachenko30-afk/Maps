import java.util.*;

public class MainMapsCollection {
    public static void main(String[] args) {
        HashMap<String, Integer> hcities = new HashMap<>();

        hcities.put("Berlin", 3850000);
        hcities.put("Hamburg", 1910000);
        hcities.put("Munich", 1600000);
        hcities.put("Cologne", 1090000);
        hcities.put("Frankfurt", 780000);
        hcities.put("Kyiv", 2950000);
        hcities.put("Kharkiv", 1420000);
        hcities.put("Odesa", 1010000);
        hcities.put("Dnipro", 970000);
        hcities.put("Lviv", 720000);
        System.out.println(hcities);

        LinkedHashMap<String,Integer> lcities = new LinkedHashMap<>();
        lcities.put("Berlin", 3850000);
        lcities.put("Hamburg", 1910000);
        lcities.put("Munich", 1600000);
        lcities.put("Cologne", 1090000);
        lcities.put("Frankfurt", 780000);
        lcities.put("Kharkiv", 1420000);
        lcities.put("Odesa", 1010000);
        lcities.put("Dnipro", 970000);
        lcities.put("Lviv", 720000);
        System.out.println(lcities);
        System.out.println(lcities);

       // TreeMap



    }
}
