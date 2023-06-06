package oops_concepts.Polymorfism;

public class Overriding extends Overloading{

   @Override
    public void division(int a,int b,int c)
    {
        int total=a+b+c;
        System.out.println(total);
    }

}
