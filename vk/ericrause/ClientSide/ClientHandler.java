package vk.ericrause.ClientSide;

        import javax.swing.*;
        import java.io.IOException;
        import java.io.ObjectInputStream;
        import java.io.ObjectOutputStream;
        import java.net.Socket;

        import static java.net.InetAddress.getByName;
        import static vk.ericrause.ClientSide.FckngGUI.inputField;

public class ClientHandler implements Runnable{

    static private Socket connection;
    static private ObjectOutputStream output;
    static private ObjectInputStream input;
    static private String gotResult;


    public static void main(String[] args) {
//        new Thread(new ClientHandler()).start();
//        new Thread(new ServerHandler()).start();
    }



    @Override
    public void run() {
        try {
            FckngGUI gui = new FckngGUI();
            gui.setVisible(true);
            while (true){
                connection = new Socket(getByName("localhost"),8956);
                output = new ObjectOutputStream(connection.getOutputStream());
                input = new ObjectInputStream(connection.getInputStream());
//                JOptionPane.showMessageDialog(null,"got message" +input.readObject());
                gotResult = (String) input.readObject();
                FckngGUI.inputField.setText(gotResult);
                gotResult = null;


                try{
                    Thread.sleep(10);
                }catch (InterruptedException ex){

                }

            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String sendData(Object obj) throws IOException {
        try {
            output.flush();
            output.writeObject(obj);
            return obj.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Can't send data";
    }
}
