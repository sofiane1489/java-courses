package Staticclass;

public class Staticmethod {

// static variables
   static int myage=33;
     static   int mytall=170;
    public void setMyage(int myAge)
    {
       myage=myAge;
    }

    public  int getMyage()
    {
        return myage;
    }

    //static methods
    public static void tall()
    {
        System.out.println(mytall);
    }
    public static int getMytall() {
        return mytall;
    }
    public static void setMytall(int mytall) {
        Staticmethod.mytall = mytall;
    }
}
