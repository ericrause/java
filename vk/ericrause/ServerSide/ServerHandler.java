package vk.ericrause.ServerSide;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerHandler extends JFrame implements Runnable{

    static private ServerSocket server;
    static private Socket connection;
    static private ObjectOutputStream output;
    static private ObjectInputStream input;
    static private String result;


    public static void main(String[] args) {

    }

    @Override
    public void run() {
        try {
            server = new ServerSocket(8956,10);
            while (true){
                connection = server.accept();
                output = new ObjectOutputStream(connection.getOutputStream());
                input = new ObjectInputStream(connection.getInputStream());
                result = FileRotator.toProcess((String) input.readObject());

                output.writeObject(result);

                try{
                    Thread.sleep(10);
                }catch (InterruptedException ex){

                }
//                FckngCalc.execute();

            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
