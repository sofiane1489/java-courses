package outer_inner_class;

public class OuterClass {

    int outervar=20;

    public void outermethod()
    {
        System.out.println("this the outer  method");
    }


     InnerClass inner=new InnerClass(); //this is the inner object


    public class InnerClass{ //this the inner class(subclass)
        public String inner="inner class";
        public void inner()
        {
            System.out.println("this is the inner class");
        }

    }






}
