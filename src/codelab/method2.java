package codelab;
public class method2 {
	
	public String phone;
	public String computer;
 	public int memory;
 	 
 	int  x=16;
 	
    public int modelyear;	
	public String car;
	public  String color;
	 //Create a class constructor for the Main class
	    public method2(String mycolor,String mycar,int mymodelyear) 
	        {
	    	  modelyear=mymodelyear;
		     car=mycar; 
		     color= mycolor;
	        }
	     
	   public  method2(int phonememory,String myphone,String mycomputer)
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
