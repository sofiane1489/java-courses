package oops_concepts.Encapsulation;
public class usegame {
    public static void main(String[] args) {
        game tenis=new game();


        tenis.setScore1(50);
        System.out.println(tenis.getScore1());
        tenis.setScore2(60);
        System.out.println(tenis.getScore2());

        tenis.total();


//in order to access the variable name,we use the getName() and setName() methods to access and update the variable:
        tenis.setName("john");
        System.out.println(tenis.getName());

    }

}
