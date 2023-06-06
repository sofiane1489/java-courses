package datastructure.collections.list;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

//array without a type(it support integer,String and others in the same array)
        ArrayList list= new ArrayList();// this is called generic one
        list.add(20);
        list.add(30);
        list.add("age");
        System.out.println(list);

        //Access an Item
        list.get(3);

        //change item
          list.set(0, 50);
        System.out.println(list);
        //remove item
        list.remove(2);
        //To remove all the elements in the ArrayList, use the clear() method:
        //list.clear();
        //ArrayList Size
        list.size();

//loop through an ArrayList with for.
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//array with type
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(0);
        numbers.add(9);
        System.out.println(numbers);
        //add a number in a specific index
        numbers.add(5,10);

        //chamge a number
        numbers.set(3,4);
        System.out.println(numbers);

        //remove a number using index
        numbers.remove(0);

        //each for loop
        for (Integer i : numbers) {
            System.out.println(i);
        }
        //Check If an Item Exists
        System.out.println(numbers.contains(3));

    }
}
