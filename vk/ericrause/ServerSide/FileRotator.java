package vk.ericrause.ServerSide;

import vk.ericrause.ClientSide.FckngGUI;
import vk.ericrause.ClientSide.Mapping;
import vk.ericrause.ServerSide.RegEXed;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileRotator {

    private static String uniqueID = UUID.randomUUID().toString();
    private static Path source = Paths.get("C:\\test\\log.txt");
    private static Path sourceRandom = Paths.get("C:\\test\\log "+ uniqueID +".txt");

    public static String date(){
        Date d = new Date();
        SimpleDateFormat formatMy = new SimpleDateFormat("dd.MM.yyyy hh:mm");

        String dateMy = formatMy.format(d);
        return dateMy;
    }

    public static void rename(Path source) throws IOException {
        Files.copy(source,sourceRandom);                        //copy to new file with unique id
        PrintWriter pw = new PrintWriter(String.valueOf(source));//erasing an existing file's content
        pw.print("");
        pw.close();

    }


    public static String toProcess(String str) {

                if ((Mapping.mapCounted != null) && !Objects.equals(Mapping.searchInMap(str), "nope")) {
                        return Mapping.searchInMap(str);
                }

        double result;
        result = RegEXed.toRegEx(str);


        int lineNumber = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\test\\log.txt"))) {

            while (reader.readLine()!=null){
                lineNumber+=1;
            }

            if (lineNumber >= 10){
                FckngGUI.infoBox("Just created a new log file","title");
                rename(source);
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
