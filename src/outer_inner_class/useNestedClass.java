package outer_inner_class;

public class useNestedClass {
    public static void main(String[] args) {


        OuterClass outer=new OuterClass();
        System.out.println(outer.outervar);
        outer.outermethod();
        System.out.println(outer.inner.inner);
        outer.inner.inner();



    }

}
