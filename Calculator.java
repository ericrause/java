import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Calculator {
    /**
    public static void initButtons(String[] args){
        for (String item : args) {
            String itemName = "button" + item.toString();

            JButton itemName = new JButton(itemName);
            itemName.addActionListener( (ae) -> textLabel2.setText(itemName.getText()));
        }

    }
     */
    Calculator() {

        //init container
        JFrame container = new JFrame("Hello kiity");
        container.setSize(205,330);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setLayout(new FlowLayout());


        //init components
        JLabel textLabelGreetings = new JLabel("some textbox here some textbox ");
        JLabel textLabel2 = new JLabel("");
        //buttons
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");



        //better to use lambda
        /**
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textLabel2.setText(button1.getText());
            }
        });
         */
        //button 1 pressed
        b1.addActionListener( (ae) -> textLabel2.setText(b1.getText()));
        b2.addActionListener( (ae) -> textLabel2.setText(b2.getText()));
        b3.addActionListener( (ae) -> textLabel2.setText(b3.getText()));
        b4.addActionListener( (ae) -> textLabel2.setText(b4.getText()));
        b5.addActionListener( (ae) -> textLabel2.setText(b5.getText()));
        b6.addActionListener( (ae) -> textLabel2.setText(b6.getText()));
        b7.addActionListener( (ae) -> textLabel2.setText(b7.getText()));
        b8.addActionListener( (ae) -> textLabel2.setText(b8.getText()));
        b9.addActionListener( (ae) -> textLabel2.setText(b9.getText()));
        b0.addActionListener( (ae) -> textLabel2.setText(b0.getText()));


        //adding components
        container.add(textLabelGreetings);
        container.add(b1);
        container.add(b2);
        container.add(b3);
        container.add(b4);
        container.add(b5);
        container.add(b6);
        container.add(b7);
        container.add(b8);
        container.add(b9);
        container.add(b0);
        container.add(textLabel2);

        //show container
        container.setVisible(true);

    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();
            }
        });
    }
}
