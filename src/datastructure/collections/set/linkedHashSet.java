package datastructure.collections.set;
import java.util.LinkedHashSet;
public class linkedHashSet {

    public static void main(String[] args) {

        //display the numbers in the order we gave them
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);

        System.out.println(numbers);

        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("david");
        names.add("casi");
        names.add("fouad");
        names.add("modric");
        names.add("modric");

        System.out.println(names);

//.............................................................................................................

                LinkedHashSet<String> colors = new LinkedHashSet<>();

                // Adding elements to LinkedHashSet
                colors.add("Red");
                colors.add("Green");
                colors.add("Blue");

                // Removing an element
                colors.remove("Green");

                // Checking if an element exists
                boolean containsBlue = colors.contains("Blue");
                System.out.println("Contains Blue: " + containsBlue);

                // Size of LinkedHashSet
                int size = colors.size();
                System.out.println("Size of LinkedHashSet: " + size);

                 // Iterating over LinkedHashSet
                 System.out.println("All colors:");
                for (String color : colors) {
                   System.out.println(color);
                 }



    }
}
