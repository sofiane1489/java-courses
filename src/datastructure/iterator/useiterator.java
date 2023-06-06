package datastructure.iterator;

import java.util.HashSet;
import java.util.Iterator;

public class useiterator {
    public static void main(String[] args) {

        HashSet<Object> name=new HashSet<>();
        name.add("aksel");
        name.add("mike");
        name.add("luis");
        name.add("michel");
        name.add(1989);

        //remove an item by writing the value "luis" or whatever
         name.remove("luis");
        System.out.println(name);

      //access the elemetns using for each loop
        // we use (Object) if we have a mixed array of Integer and String
        for(Object i:name)
            System.out.println(i);

        //or using an iterator which is better
        //when we have a mixed array, we can eather write objejt in the iterator <Object>
       // or keep kee it empty like below
        Iterator sof=name.iterator();

        while(sof.hasNext())
        System.out.println(sof.next());

    }
}
