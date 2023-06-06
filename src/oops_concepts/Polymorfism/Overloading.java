package oops_concepts.Polymorfism;

public class Overloading {

    public void division(int a,int b)
    {
        int total=a/b;
        System.out.println(total);
    }

    public void division(int a,int b,int c)
    {
        int total=(a+b)/c;
        System.out.println(total);
    }


}

