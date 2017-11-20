package vk.ericrause;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.JOptionPane;

import static vk.ericrause.Check.findFile;


public class FckngGUI extends JFrame {

    private JButton register, enter, clear, bPlus, bMinus, bDiv, bMul, bDot, bEq, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JTextField input, login, password;
    private JTextArea textArea;
    private JLabel authGreeting, authPass, authLogin;



    public FckngGUI (){
        createAuthForm();
        initButtons();
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


    b1.addActionListener( (ae) -> input.setText(input.getText() + b1.getText()));
    b2.addActionListener( (ae) -> input.setText(input.getText() + b2.getText()));
    b3.addActionListener( (ae) -> input.setText(input.getText() + b3.getText()));
    b4.addActionListener( (ae) -> input.setText(input.getText() + b4.getText()));
    b5.addActionListener( (ae) -> input.setText(input.getText() + b5.getText()));
    b6.addActionListener( (ae) -> input.setText(input.getText() + b6.getText()));
    b7.addActionListener( (ae) -> input.setText(input.getText() + b7.getText()));
    b8.addActionListener( (ae) -> input.setText(input.getText() + b8.getText()));
    b9.addActionListener( (ae) -> input.setText(input.getText() + b9.getText()));
    b0.addActionListener( (ae) -> input.setText(input.getText() + b0.getText()));

    bPlus.addActionListener( (ae) ->    input.setText(input.getText() + bPlus.getText()));
    bMinus.addActionListener( (ae) ->   input.setText(input.getText() + bMinus.getText()));
    bDiv.addActionListener( (ae) ->     input.setText(input.getText() + bDiv.getText()));
    bMul.addActionListener( (ae) ->     input.setText(input.getText() + bMul.getText()));
    bDot.addActionListener( (ae) ->     input.setText(input.getText() + bDot.getText()));

    bEq.addActionListener( (ae) ->     input.setText(Compute.toCompute(input.getText())));

}
    public void createAuthForm(){
        JPanel authForm = new JPanel();

        authForm.setBorder(new EmptyBorder(3,3,3,3));
        authForm.setLayout(new BorderLayout());
        getContentPane().add(authForm);

        JPanel panelCenter = new JPanel(new GridLayout(10,2));

        authForm.add(panelCenter, BorderLayout.CENTER);

        login = new JTextField();
        password = new JTextField();
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
                if (Check.check(login.getText(), password.getText())) {
                    authForm.setVisible(false);
                    createView();

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

        input = new JTextField();
        panelNorth.add(input, BorderLayout.CENTER);

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
                input.setText("");
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
