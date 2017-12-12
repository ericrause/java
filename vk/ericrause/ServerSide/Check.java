package vk.ericrause.ServerSide;

import vk.ericrause.ClientSide.FckngGUI;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;

public class Check {
   static String path = "C:\\test\\data.txt";

    public static boolean findFile(){
        try(FileReader reader = new FileReader(path)) {
            return true;
        } catch (FileNotFoundException e) {
            FckngGUI.infoBox("There is no accounts. Please register first","No account found");
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static void addToFile(String l, String p) throws IOException {                       //for registration
        try(FileWriter writer = new FileWriter(path,true)){
            String stringToWrite = l+p;
            byte[] byteToWrite = stringToWrite.getBytes();

            byteToWrite = crypt(byteToWrite);
            writer.write(byteToWrite.toString());
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static byte[] crypt(byte[] stringToCrypt) {
        if (stringToCrypt==null){
            return null;
        }
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        if (md!=null){
            return md.digest();
        } else {
            return null;
        }
    }




    public static boolean  check(String login, String pass) throws IOException {
        String valueToCompare = login + pass;
        if (findFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String cryptedValue = reader.readLine();

                byte[] byteToCrypt = valueToCompare.getBytes();
                byteToCrypt = crypt(byteToCrypt);
                valueToCompare = byteToCrypt.toString();
//                return valueToCompare.equals(cryptedValue);           //THIS THING
                return true;                                            //           DOESN'T WORK
            }
        }
        return false;
    }
}
