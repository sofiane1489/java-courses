package TempConvertProject;
import org.junit.Assert;

import java.util.Scanner;
public class TempConvert {
    public static void menu(){
        System.out.println("MENU:\n " +
                "1:for celcius to F \n" +
                " 2:for F to celcius \n" +
                " 3:No");}

    public static void main(String[] args) {
           Scanner sof=new Scanner(System.in);
           int F;
           int C=0;
           int mod;
           int answer;
           int response;
//with do while
        System.out.println("welcome to temp converter");
        System.out.println("do you want to convert temp: \n-1:y \n-2:no ");

        if(sof.nextInt()==1)
        {

            do
            {
                System.out.println("choose the conversion mode:1- C to F\n" + "2- F to C");

                mod = sof.nextInt();

                if (mod == 1) {
                    System.out.println("enter the temp to convert");
                    F = (sof.nextInt() * 9 / 5) + 32;
                    System.out.println("the dgree in F is: " + F);
                } else if (mod == 2) {
                    System.out.println("enter the temp to convert");
                    C = (sof.nextInt() - 32) * 5;
                    System.out.println("the dgree in C is: " + C);
                }

                // unit testing
                int expactedc=0;
                Assert.assertEquals(expactedc,C);

                System.out.println("do you want more:1-yes 2-no");
                answer = sof.nextInt();
            }
            while (answer == 1);
            System.out.println("good bye, see you soon");
        }
    else
        System.out.println("good bye");


    //we can also do it with while

//        System.out.println("do you want to convert temp:\n1 for YES \n2 for NO");
//        response=sof.nextInt();
//
//        if(response==1)
//        {
//            while( response==1)
//            {
//
//                System.out.println("choose the conversion mode:\n1 for C to F \n2 for F to C");
//                response=sof.nextInt();
//                if(response==1)
//                {
//                    System.out.print("enter the temp you want to convert:");
//                    C=sof.nextInt();
//                    F=(C*9/5)+32;
//                    System.out.println("the temp in F is: "+F);
//                }
//                if(response==2)
//                {
//                    System.out.print("enter the temp you want to convert:");
//                    F=sof.nextInt();
//                    C=5/9*(F-32);
//                    System.out.println("the temp in C is: "+C);
//                }
//                System.out.println("do you want to do another cobvert: \n1 for yes \n2 for no");
//                response=sof.nextInt();
//            }
//            System.out.println("see you");
//        }
//        else
//            System.out.println("thank you for visiting us");
//
//
//        // we can also do it with switch and while (true)
//
//        while(true)
//        {
//            System.out.println("MENU:\n 1:for celcius to F \n 2:for F to celcius \n 3:No");
//            response=sof.nextInt();
//            switch (response)
//            {
//                case 1:
//                    System.out.println("enter the temp:");
//                    C = sof.nextInt();
//                    F = (C * 9 / 5) + 32;
//                    System.out.println("the temp in F is: " + F);
//                    break;
//                case 2:
//                    System.out.println("enter the temp you want to convert");
//                    F = sof.nextInt();
//                    C = 5 / 9 * (F - 32);
//                    System.out.println("the temp in C is: " + C);
//                    break;
//                case 3:
//                    System.out.println("see you next");
//                    return;
//            }
//        }



    }
}
