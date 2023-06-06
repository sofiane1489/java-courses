package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {


        /* the two backward slashes \\ means escape character
             the ^ means beginning and the $ means end  */
        String email = "asdsb123@gmail.com";
        String pattern = "^[A-Za-z0-9+-_.]{8,25}@[A-Za-z0-9+_.-]+\\.[A-Za-z]{2,4}$";
        String ssn = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";
        String ss = "123-34-3456";


        Pattern emailPattern = Pattern.compile(pattern);
        Matcher emailMatcher = emailPattern.matcher(email);

        Pattern ssPattern = Pattern.compile(ssn);
        Matcher ssnMatcher = ssPattern.matcher(ss);

        System.out.println(emailMatcher.matches());
        boolean emailmatchFound = emailMatcher.find();
        if(emailmatchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }


        System.out.println(ssnMatcher.matches());
        boolean ssnmatchFound = ssnMatcher.find();
        if(ssnmatchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }









    }


    }

