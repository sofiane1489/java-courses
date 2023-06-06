package codelab;

import java.util.ArrayList;

public class us {

    public static void main(String[] args) {

       /*An array of Strings , names , has been declared and initialized .
        Write the statements needed to determine whether any of the the array
         elements are null or refer to the empty String . Set the variable
         hasEmpty to true if any elements are null or empty-- otherwise set
         it to false .
        */
            boolean has=false;
            String name[]={"ab","we","","sof"};
            for(int i=0;i<name.length;i++) {
                if (name[i]==null || name[i].length()==0)
                    has=true;
            }System.out.println(has);
            System.out.println(name[3].length());

            /*Write a method f that accepts an ArrayList containing
            String objects. The method should return a String containing
            the first character of each string in the ArrayList, in the order
            in which they appear. Thus, if the ArrayList contains the Strings:
            Hello world goodbye the return value of the method would be the String Hwg
             */
        ArrayList<String> f=new ArrayList<>();
        f.add("sof");
        f.add("orange");
        f.add("frank");
        f.add("iphone");
        f.add("apple");
        f.add("nine");
        f.add("elephant");
        String s = "";
        for (int i = 0; i < f.size(); i++)
            s = s + f.get(i).charAt(0);

        System.out.println(s);

//here is the method(there is error because we cannot write a method while we have the main method above)
        //public String f(ArrayList<String>sof){

          //  String s="";
          //  for(int i=0;i<sof.size();i++)
          //      s=s+sof.get(i).charAt(0);
          //  return s;

      //  }


//find the minimum
        int x=9;
        int y=4;
        int z=7;
        int min;

        if(x < y)
        {
            if(x<z){
                min = x;
            }else{
                min = z;
            }
        }
        else
        {
            if(y<z){
                min = y;
            }else{
                min = z;
            }
        }
        System.out.println(min);








    }

    }

