package Staticclass;

public class Staticobject {
    public static void main(String[] args) {
      //static variables
        Staticmethod sof=new Staticmethod();
        //in order to call a static variale, you need tu use class name.
        System.out.println(Staticmethod.myage);

        //we call also change the value or call the static variable
        // by using the getter and setter
        sof.setMyage(34);
        System.out.println("my age is "+sof.getMyage());

        Staticmethod sou=new Staticmethod();
        sou.setMyage(32);
        System.out.println("my wife age is "+sou.getMyage());

        System.out.println(sof.getMyage());

        Staticmethod koko=new Staticmethod();
        koko.setMyage(5);
        System.out.println(koko.getMyage());
        System.out.println(sou.getMyage());

      //static methods
        Staticmethod.setMytall(175);
        Staticmethod.tall();
        Staticmethod.setMytall(180);
        Staticmethod.tall();
        System.out.println(Staticmethod.mytall);

    }

}
