package vk.ericrause.ClientSide;

import vk.ericrause.ClientSide.ClientHandler;
import vk.ericrause.ServerSide.ServerHandler;

public class FckngCalc{
    public static void main(String[] args) {
//        new Thread( new FckngGUI().setVisible(true));
//        FckngGUI gui = new FckngGUI();
//        gui.setVisible(true);

        new Thread(new ClientHandler()).start();
        new Thread(new ServerHandler()).start();
    }

//    public static void execute() {
//        FckngGUI gui = new FckngGUI();
//        gui.setVisible(true);
//    }

}

