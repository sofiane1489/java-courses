package oops_concepts.Abstraction;

import java.util.logging.Level;

public class use {
    public static void main(String[] args) {

        honda civic=new honda();
        toyota camry=new toyota();

        civic.color();
        civic.enginesize();
        civic.shape();
        civic.rims();

        camry.color();
        camry.shape();
        camry.enginesize();

        car accord =new honda();
        car corola=new toyota();

        accord.color();
        accord.shape();
        accord.enginesize();

        corola.enginesize();
        corola.shape();
        corola.color();

        motor hrv=new honda();
        hrv.enginefuel();
        hrv.enginesize();
        hrv.enginesize();


        civic.modelx();

        level a=level.medium;
        switch(a) {
            case low:
                System.out.println("Low level");
                break;
            case medium:
                System.out.println("Medium level");
                break;
            case high:
                System.out.println("High level");
                break;
        }


    }

}
