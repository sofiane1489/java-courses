package WrapperClass;

import java.util.ArrayList;
import java.util.ArrayList;
public class wrapperClass {
    public static void main(String[] args) {
        Integer a;
        Double b;
        Byte c;
        Long d;
        Short f;
        Boolean g;
        Float h;
        Character j;
        //we use this wapper class when using the collection objects as shows below
        ArrayList<Integer> mynumbers = new ArrayList<>();
        mynumbers.add(20);
        mynumbers.add(30);
        mynumbers.add(40);
        //or
        ArrayList myArray = new ArrayList();
        myArray.add(40);
        myArray.add(50);
        myArray.add(60);
        myArray.add ("NUMBER");

        System.out.println(mynumbers+" "+myArray);


    }
}