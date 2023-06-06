package datastructure.collections.set;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {

        /*HashSet does not provide any method to maintain
        the insertion order. Comparatively, LinkedHashSet
        maintains the insertion order of the elements.
         */

        //naturel order for integers
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);
        numbers.add(0);
        System.out.println(numbers);
        //add duplicate items which are not going to be displayed
        numbers.add(0);
        numbers.add(0);
        //remove item:we need to write down the item that we need to be removed
        numbers.remove(7);

        //Check If an Item Exists
        System.out.println(numbers.contains(3));

     //   each for loop
        for (Integer i : numbers) {
            System.out.println(i);
        }

        // random order for strings
        HashSet<String> name=new HashSet<>();
        name.add("sofiane");
        name.add("mike");
        name.add("luis");
        name.add("michel");
        name.add("michel");
        name.add("michel");
        System.out.println(name);

        for(String i:name)
            System.out.println(i);

    }
}