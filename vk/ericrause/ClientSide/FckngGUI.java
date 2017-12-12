package vk.ericrause.ClientSide;

import vk.ericrause.ServerSide.Check;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.JOptionPane;

import static vk.ericrause.ServerSide.Check.findFile;


public class FckngGUI extends JFrame {

    private JButton register, enter, clear, bPlus, bMinus, bDiv, bMul, bDot, bEq, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    static JTextField inputField;
    private JTextField login;
    private JPasswordField password;
    private JTextArea textArea;
    private JLabel authGreeting, authPass, authLogin;



    public FckngGUI (){
        createAuthForm();
        initButtons();
//        createButton();
        //createView();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(230,300);
        setLocationRelativeTo(null);
        setResizable(false);


    }

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }




//    static JButton[] buttons = new JButton[10];
//    static int i=0;
//    public static void createButton(){
//    for (int i = 0; i <= 9; i++){
//        buttons[i] = new JButton(String.valueOf(i));
//        buttons[i].addActionListener(nal);
//    }
//
//    }
//    private static NewActionListener nal = new NewActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            inputField.setText(inputField.getText() + buttons[i].getText());
//        }
//    };

private void initButtons(){

    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    b0 = new JButton("0");


    bPlus = new JButton("+");
    bMinus = new JButton("-");
    bDiv = new JButton("/");
    bMul = new JButton("*");
    bDot = new JButton(".");
    bEq = new JButton("=");


    b1.addActionListener( (ae) -> inputField.setText(inputField.getText() + b1.getText()));
    b2.addActionListener( (ae) -> inputField.setText(inputField.getText() + b2.getText()));
    b3.addActionListener( (ae) -> inputField.setText(inputField.getText() + b3.getText()));
    b4.addActionListener( (ae) -> inputField.setText(inputField.getText() + b4.getText()));
    b5.addActionListener( (ae) -> inputField.setText(inputField.getText() + b5.getText()));
    b6.addActionListener( (ae) -> inputField.setText(inputField.getText() + b6.getText()));
    b7.addActionListener( (ae) -> inputField.setText(inputField.getText() + b7.getText()));
    b8.addActionListener( (ae) -> inputField.setText(inputField.getText() + b8.getText()));
    b9.addActionListener( (ae) -> inputField.setText(inputField.getText() + b9.getText()));
    b0.addActionListener( (ae) -> inputField.setText(inputField.getText() + b0.getText()));

    bPlus.addActionListener( (ae) ->    inputField.setText(inputField.getText() + bPlus.getText()));
    bMinus.addActionListener( (ae) ->   inputField.setText(inputField.getText() + bMinus.getText()));
    bDiv.addActionListener( (ae) ->     inputField.setText(inputField.getText() + bDiv.getText()));
    bMul.addActionListener( (ae) ->     inputField.setText(inputField.getText() + bMul.getText()));
    bDot.addActionListener( (ae) ->     inputField.setText(inputField.getText() + bDot.getText()));

//    bEq.addActionListener( (ae) ->     inputField.setText(FileRotator.toCompute(inputField.getText())));
    bEq.addActionListener((ae) -> {
        try {
            inputField.setText(ClientHandler.sendData(inputField.getText()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    });
}
    public void createAuthForm(){
        JPanel authForm = new JPanel();

        authForm.setBorder(new EmptyBorder(3,3,3,3));
        authForm.setLayout(new BorderLayout());
        getContentPane().add(authForm);

        JPanel panelCenter = new JPanel(new GridLayout(10,2));

        authForm.add(panelCenter, BorderLayout.CENTER);

        login = new JTextField();
        password = new JPasswordField();
        authGreeting = new JLabel("Input your fckng data");
        authLogin = new JLabel("Login:");
        authPass = new JLabel("Pass:");
        register = new JButton("Register");
        enter = new JButton("Sign In");


        JPanel panelNorth = new JPanel(new BorderLayout());
        authForm.add(panelNorth, BorderLayout.NORTH);

        panelNorth.add(authGreeting);
        panelCenter.add(authLogin);
        panelCenter.add(login);
        panelCenter.add(authPass);
        panelCenter.add(password);


        JPanel panelSouth = new JPanel(new BorderLayout());
        authForm.add(panelSouth, BorderLayout.SOUTH);

        panelSouth.add(enter, BorderLayout.WEST);
        //check for access
        enter.addActionListener(e -> {
            try {
                if (Check.check(login.getText(), password.getText())) {             //instead use SendData(auth:login:pass)
                    authForm.setVisible(false);
                    createView();
//                if (ClientHandler.sendData("auth" + login + ":" + password) && ){
//
                }


                else {
                    FckngGUI.infoBox("mistake in login/password", "error");
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        panelSouth.add(register, BorderLayout.EAST);

        if(!findFile()) {register.setEnabled(true);} else { register.setEnabled(false);}

        register.addActionListener(e -> {
            try {
                Check.addToFile(login.getText(), password.getText());
                login.setText("");
                password.setText("");
                FckngGUI.infoBox("Successfully registered", "OK");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }

    public void createView(){
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(3,3,3,3));
        panel.setLayout(new BorderLayout());
        getContentPane().add(panel);

        JPanel panelNorth = new JPanel(new BorderLayout());
        panel.add(panelNorth, BorderLayout.NORTH);
        //panelNorth.add(new JLabel("enter something"), BorderLayout.WEST);

        inputField = new JTextField();
        panelNorth.add(inputField, BorderLayout.CENTER);

        JPanel panelCenter = new JPanel(new GridLayout(4,4));
        panel.add(panelCenter, BorderLayout.CENTER);
        panelCenter.add(b9);
        panelCenter.add(b8);
        panelCenter.add(b7);
        panelCenter.add(bPlus);

        panelCenter.add(b6);
        panelCenter.add(b5);
        panelCenter.add(b4);
        panelCenter.add(bMinus);

        panelCenter.add(b3);
        panelCenter.add(b2);
        panelCenter.add(b1);
        panelCenter.add(bDiv);

        panelCenter.add(bMul);
        panelCenter.add(b0);
        panelCenter.add(bDot);
        panelCenter.add(bEq);

        JPanel panelSouth = new JPanel();
        panel.add(panelSouth, BorderLayout.SOUTH);

        clear = new JButton("clear");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });
        panelSouth.add(clear);
    }

public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FckngGUI().setVisible(true);
            }
        });
}
}
