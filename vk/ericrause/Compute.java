package vk.ericrause;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Compute {

    public static String date(){
        Date d = new Date();
        SimpleDateFormat formatMy = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        String dateMy = formatMy.format(d);
        return dateMy;
    }

    public static String toCompute(String str) {
        //parse term by *+-/ to doubles
        //
        String operations = "[ +-/*]+";

        String[] parsedStr = str.split(operations);



        double test1, test2, test3;
        test1 = Double.parseDouble(parsedStr[0]);
        test2 = Double.parseDouble(parsedStr[1]);
        test3 = test1 + test2;
/**
        double items[]=null;
        int len = parsedStr.length;
        //for (int i=0; i < len; i++){
            items[0] = Double.parseDouble(parsedStr[0].toString());
            items[1] = Double.parseDouble(parsedStr[1].toString());
       // }
 */
        String result = "";
        result = Double.toString(test3) ;




                     //for registration
        try(FileWriter writer = new FileWriter("C:\\test\\log.txt",true)){
            String stringToWrite = str + " = " + result + " at " + date();
            writer.append(stringToWrite);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }


        return result;
    }


}
