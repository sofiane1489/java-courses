package oops_concepts.Inheritance;

public class son extends Father{

     private  String mycar="is Hyundai";

   public void mycar()
    {
        System.out.println(mycar);
    }

     public void setMycar(String mycar) {
         this.mycar = mycar;
     }

     public String getMycar()
     {
         return mycar;
     }


}

