package datastructure.collections.set;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {

        /*HashSet does not provide any method to maintain
        the insertion order. Comparatively, LinkedHashSet
        maintains the insertion order of the elements.
         */

        //this a normal array
        int[] array={1,2,6,8};

        for(int k=0;k<array.length;k++) {
            System.out.println(array[k]);
        }


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
//............................................................................................................

           HashSet<String> countries = new HashSet<>();

                // Adding elements to HashSet
                countries.add("USA");
                countries.add("Canada");
                countries.add("India");

                //doesn't accept duplicate
                countries.add("USA");

                // Removing an element
                countries.remove("Canada");

                // Checking if an element exists
                boolean containsIndia = countries.contains("India");
                System.out.println("Contains India: " + containsIndia);

                // Size of HashSet
                int size = countries.size();
                System.out.println("Size of HashSet: " + size);

              // Iterating over HashSet
                  System.out.println("All countries:");
                  for (String country : countries) {
                    System.out.println(country);
                      }



    }
}