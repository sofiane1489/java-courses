package DateTime;

import java.time.LocalDate;
import static java.time.LocalTime.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj);

        //we can display the time or date ussing static like this (import static java.time.LocalTime.*;)
        //with using just now().we don't need to use this (LocalTime mytime = LocalTime.now();)
       // LocalTime mytime = LocalTime.now();
        System.out.println(now());

        LocalDateTime myDT = LocalDateTime.now();
        System.out.println(myDT);


        //the ofPattern() method accepts all sorts of values
        //yyyy-MM-dd	exp: "1988-09-29"
        //dd/MM/yyyy	exp: "29/09/1988"
        //dd-MMM-yyyy	exp: "29-Sep-1988"
        //E, MMM dd yyyy	exp: "Thu, Sep 29 1988"

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E,dd-MMM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}