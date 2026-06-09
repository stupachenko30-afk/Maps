import java.util.*;

public class MainStringMap {
    public static void main(String[] args) {
        printCharsValues("caabbcaabbc");// ВАЖНО!!! вызвать метод отсюда
        printWorldReverse("hello any hello bye hello bye bye any");

    }

     public static void printWorldReverse(String s){
         ComparatorStringReverse comp = new ComparatorStringReverse(); //с компаратором
        TreeMap<String,Integer> map = new TreeMap<>(comp);
        String[] ar = s.split(" ");//делим массив ar по словам и индексам

         for (String str: ar){
             if(map.containsKey(str) == false){
                 map.put(str,1);

             }
             else {
                 int value = map.get(str);
                 value++;
                 map.replace(str,value);
             }
         }
         ///////////////////////
       // Set<String> keys = map.descendingKeySet();
         Set<String> keys = map.keySet();
         for (String key: keys){
             System.out.print(key + " = ");
             int value = map.get(key);
             System.out.println(value);

         }
     }
/*
"hello any hello bye hello bye bye any"
hello = 3
bye = 3
any = 2
*/


    public static void printCharsValues(String s){
        TreeMap<Character,Integer> map = new TreeMap<>();

        ////////////////////// filling map (Заполнение mар)
        for (int i= 0; i<s.length(); i++){ //перебрать
            char sym = s.charAt(i);//позволяет получить символ по его индексу
            if(map.containsKey(sym) == false){ //если такого значения нет...
                map.put(sym,1); //первоначальное внесение, положи этот символ один раз
            }
            else { //если условие false
                int value = map.get(sym); //посмотрел какое value, сколько есть символов
                value++; //прибавь +1
                map.replace(sym,value);//добавляет внесение
            }

        }
        //////////////////////////  printing map
        Set<Character> keys = map.keySet();
        for (char key: keys){
            System.out.print(key + "->");
            int value = map.get(key);
            System.out.println(value);
        }

    }
}
/*
Classwork(INTERVIEW)
public static void printCharsValues(String s)
        i++
     12345678910
s-> "caabbcaabbc"
to print by abc(use map):
          map
      key    value
      --------------
      a        2
      c        1

"caabbcaabbc"
a->4
b->4
c->3
 */