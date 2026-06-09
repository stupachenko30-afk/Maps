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


        TreeMap<String,Integer> tcities= new TreeMap<>();
        tcities.put("Berlin", 3850000);
        tcities.put("Hamburg", 1910000);
        tcities.put("Munich", 1600000);
        tcities.put("Cologne", 1090000);
        tcities.put("Frankfurt", 780000);
        tcities.put("Kharkiv", 1420000);
        tcities.put("Odesa", 1010000);
        tcities.put("Dnipro", 970000);
        tcities.put("Lviv", 720000);
        System.out.println(tcities);

//        MainMaps.printMap(hcities);
//        MainMaps.printMap(lcities);
//        MainMaps.printMap(tcities);

        printMap(hcities);
        printMap(lcities);
        printMap(tcities);

    }

    private static void printMap(Map<String, Integer> cities) {
        Set<String> set = cities.keySet(); //перемещаю в коллекцию(Тип переменной) Set в переменную set ключи из map(cities)
        for (String key: set){ //перебираю ключи, для каждой переменной key получаю свой ключ
            System.out.print(key +" => ");//печатаю значение key + символ
            int value = cities.get(key); //получаю значение(value) по переменной ключа(key) из map(cities)
            System.out.println(value); //печатаю значение

        }
        System.out.println("*****************************");
    }
}
