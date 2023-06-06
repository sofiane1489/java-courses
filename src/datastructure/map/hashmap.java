package datastructure.map;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {


        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("15","TIZI" );
        capitalCities.put("16","ALGER");
        capitalCities.put("06","BEGAYETH");
        capitalCities.put("10","BUIRA");
        capitalCities.put("34","BOUMERDES");
        System.out.println(capitalCities);

        //Access an Item using get()
        System.out.println( capitalCities.get("15"));

        //Loop through the items of a HashMap with a for-each loop.
        //Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
        //// Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (Map.Entry name: people.entrySet()) {
            System.out.print(name.getKey()+" ");
            System.out.println(name.getValue());
        }


    }
}