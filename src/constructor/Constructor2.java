package constructor;

public class Constructor2 {

    public String phone;
    public String computer;
    public int memory;

    int  x=16;

    public int modelyear;
    public String car;
    public  String color;
    //Create a class constructor for the Main class
    public Constructor2(String mycolor, String mycar, int mymodelyear)
    {
        modelyear=mymodelyear;
        car=mycar;
        color= mycolor;
    }

    public void myCar(){
        System.out.println("my car is "+car+" and the model year is "+modelyear +" and the color is "+color);
    }

    public Constructor2(int phonememory, String myphone, String mycomputer)
    {
        memory =phonememory;
        phone =myphone;
        computer=mycomputer;
    }


    public int numbers(int y)
    {
        x=y;
        return y;
    }




}
