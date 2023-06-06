package TempConvertProject;

import java.util.Scanner;

public class withvoid {
    public static void menu(){
        System.out.println("MENU:\n " +
                "1:for celcius to F \n" +
                " 2:for F to celcius \n" +
                " 3:No");}

    public static void main(String[] args) {
        Scanner sof = new Scanner(System.in);
        int response;
        int F;
        int C;
        System.out.println("......................WELCOME...................");
        System.out.println(".................TO TEMP CONVERTER...............");

        while (true) {
            menu();
            response = sof.nextInt();
            switch (response) {
                case 1:
                    System.out.println("enter the temp:");
                    C = sof.nextInt();
                    F = (C * 9 / 5) + 32;
                    System.out.println("the temp in F is: " + F);
                    break;
                case 2:
                    System.out.println("enter the temp you want to convert");
                    F = sof.nextInt();
                    C = 5 / 9 * (F - 32);
                    System.out.println("the temp in C is: " + C);
                    break;
                case 3:
                    System.out.println("see you next");
                    return;
            }
        }

    }
}
