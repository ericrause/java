package vk.ericrause;

import java.io.*;
import java.util.Objects;

public class Check {

    public static boolean findFile(){
        try(FileReader reader = new FileReader("C:\\test\\data.txt")) {
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
        try(FileWriter writer = new FileWriter("C:\\test\\data.txt",true)){
            String stringToWrite = l + ":" + p;
            writer.append(stringToWrite);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }




    public static boolean  check(String login, String pass) throws IOException {
        String readedLogin = login;
        String readedPass = pass;


        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\test\\data.txt")) {

            String pair = reader.readLine();
            String[] pairArr = pair.split("[ :]+");
            String existingLogin = pairArr[0];
            String existingPass = pairArr[1];



            }
            return existingLogin;



        }

        //place here reader and comp
        //if readed login=login and pass=pass then return true. else false.
    }
}
