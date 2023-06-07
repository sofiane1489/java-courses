package datastructure.collections.list;
import java.util.LinkedList;
public class linkedList {

    public static void main(String[] args) {

        LinkedList<Integer> numbers= new LinkedList<>();
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(0);
        System.out.println(numbers);
        //add a number in a specific index
        numbers.add(5,10);

        //chamge a number
        numbers.set(3,4);
        System.out.println(numbers);
numbers.addFirst(0);
        //each for loop
        for (Integer i : numbers) {
            System.out.println(i);
        }
        //Check If an Item Exists
        System.out.println(numbers.contains(9));

        /* addFirst()	 Adds an item to the beginning of the list.
         addLast()	     Add an item to the end of the list
         removeFirst()	 Remove an item from the beginning of the list.
         removeLast()	 Remove an item from the end of the list
         getFirst()	     Get the item at the beginning of the list
         getLast()	     Get the item at the end of the list*/

//......................................................................................................

                LinkedList<String> names = new LinkedList<>();

                // Adding elements to LinkedList
                names.add("John");
                names.add("Alice");
                names.add("Bob");

                // Accessing elements by index
                String firstPerson = names.get(0);
                System.out.println("First person: " + firstPerson);

                // Iterating over LinkedList
                System.out.println("All names:");
                for (String name : names) {
                    System.out.println(name);
                }

                // Removing an element
                names.remove("Alice");

                // Checking if an element exists
                boolean containsBob = names.contains("Bob");
                System.out.println("Contains Bob: " + containsBob);

                // Size of LinkedList
                int size = names.size();
                System.out.println("Size of LinkedList: " + size);



    }
}
