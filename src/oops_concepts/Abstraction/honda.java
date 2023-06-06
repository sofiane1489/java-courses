package oops_concepts.Abstraction;
public class honda extends moderncar implements car,motor{

    public void shape() {
        System.out.println("2doors");
    }
    public void enginesize() {
        System.out.println("v8");
    }

    public void color() {
        System.out.println("black");
    }

    public void rims()
    {
        System.out.println("min speed is: "+lowspeed);
        System.out.println("alloy");
    }


    public void enginefuel() {
        System.out.println("gas");
    }

    public void engine() {
        System.out.println("v12");
    }


    public void modelx() {
        System.out.println("tesla");

    }
}
