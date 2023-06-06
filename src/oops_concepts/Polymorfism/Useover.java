package oops_concepts.Polymorfism;

public class Useover{
    public static void main(String[] args) {



      Overriding riding=new Overriding();
      Overloading loading=new Overloading();


      riding.division(10,20,10);

      loading.division(2,2,2);

      riding.division(10,10,10);

      loading.division(10,10,10);

      loading.division(4,2);

      riding.division(6,3);

      riding.division(1,2,3);
      loading.division(10,3,3);



}
}
