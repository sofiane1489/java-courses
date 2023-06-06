package oops_concepts.Inheritance;
import oops_concepts.Encapsulation.game;
import org.junit.Test;

public class Execute extends son{
    public static void main(String[] args) {

        Father jeams1 =new son();

        son jeams=new son();

        System.out.println(jeams.age);
        jeams.knowledge();

        jeams.mycar();
        jeams.setMycar("Honda");
       System.out.println("my dad car is: "+jeams.dadycar()+" and my car model is: "+jeams.getMycar());

       jeams.welth();

       anotherheir heir=new anotherheir();
       heir.knowledge();

        //if we want to use properties of another class which located in another package,
        // we need to import the package and class fo exp: import oops_concepts.Encapsulation.game;
        game ga=new game();
        ga.setScore1(50);
        System.out.println(ga.getScore1());
    }

    //if we do extends to son class, we don't need to create an object,
    // but we need to call it from a method as in order to work
    public void lo(){
        mycar();
      }

}
