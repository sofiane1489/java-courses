package Singleton;

public class singletonclass {

   private  singletonclass() { //create a private constructor
       }
    static singletonclass singleton=new singletonclass(); //create a static object

    public static singletonclass getInstance() { //create a static method and return the object name
        return singleton;
    }

    public void singl() {
        System.out.println("this is the singleton class");
        System.out.println("You are now connected to the database.");
    }

    public int add(int a,int b){
        int total=a+b;

        return total;
    }
}
