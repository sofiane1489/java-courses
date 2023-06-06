package Singleton;

public class usesingleton {
    public static void main(String[] args) {

        // singletonclass singletonclass=new singletonclass();

        singletonclass singleton= singletonclass.getInstance();

        singleton.singl();

        System.out.println(singleton.add(10,2));

    }
}