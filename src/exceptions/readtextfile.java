package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readtextfile  {
    public static void main(String[] args) throws IOException {

        FileReader  fr = new FileReader("C:\\Users\\sehso\\eclipse-workspace\\methodandclass\\src\\TempConvertProject\\exercice");
        BufferedReader br = new BufferedReader(fr);

        String line = null;
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
            br.close();
            fr.close();


    }
}