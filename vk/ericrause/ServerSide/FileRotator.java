package vk.ericrause.ServerSide;

import vk.ericrause.ClientSide.FckngGUI;
import vk.ericrause.ClientSide.Mapping;
import vk.ericrause.ServerSide.RegEXed;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileRotator {

    public static String date(){
        Date d = new Date();
        SimpleDateFormat formatMy = new SimpleDateFormat("dd.MM.yyyy hh:mm");

        String dateMy = formatMy.format(d);
        return dateMy;
    }

    public static void rename() {
        java.io.File file = new java.io.File("C:\\test\\log.txt");
        if (file.exists()) {
            String uniqueID = UUID.randomUUID().toString();
            //file.renameTo(new java.io.File("C:\\test\\log" + uniqueID + ".txt"));

            file.renameTo(new File("C:\\test\\log" + uniqueID + ".txt"));

        }
        else {
            FckngGUI.infoBox("error when renaming file","error");
        }
    }


    public static String toProcess(String str) {

                if ((Mapping.mapCounted != null) && Mapping.searchInMap(str) != "nope") {
                        return Mapping.searchInMap(str);
                }

//        String operations = "[ +-/*]+";     //use REGEX instead
//        String[] parsedStr = str.split(operations);
//        double test1, test2, test3;
//        test1 = Double.parseDouble(parsedStr[0]);
//        test2 = Double.parseDouble(parsedStr[1]);
//        test3 = test1 + test2;
/*
        double items[]=null;
        int len = parsedStr.length;
        //for (int i=0; i < len; i++){
            items[0] = Double.parseDouble(parsedStr[0].toString());
            items[1] = Double.parseDouble(parsedStr[1].toString());
       // }
 */
        double result;
        result = RegEXed.toRegEx(str);


        int lineNumber = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\test\\log.txt"))) {

            while (reader.readLine()!=null){
                lineNumber+=1;
            }

            if (lineNumber == 10){
                FckngGUI.infoBox("line="+lineNumber,"title");
                rename();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileWriter writer = new FileWriter("C:\\test\\log.txt",true)){
            String stringToWrite = str + " = " + result + " at " + date();
            writer.append(stringToWrite);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

//        ADDING TO HASHMAP AFTER COMPUTONG
        Mapping.addToHashMap(str, result);
//        return str+ "=" +result;
        return Double.toString(result);      //this result goes to input.setText()
    }


}
