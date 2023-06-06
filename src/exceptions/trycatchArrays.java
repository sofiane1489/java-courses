package exceptions;

import java.util.HashSet;

public class trycatchArrays {
    public static void main(String[] args) {

        //unchecked error
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        try {
            numbers.add(2 / 0);
        }catch (ArithmeticException so){
            System.out.println("error line 13");
        }
        numbers.add(1);
        numbers.add(0);
        numbers.add(10);

       for(Integer i:numbers)
           System.out.println(i);

    }
}
