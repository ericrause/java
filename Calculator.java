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
        JTextField textBox = new JTextField(16);
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

        JButton bPlus = new JButton("+");
        JButton bMinus = new JButton("-");
        JButton bDiv = new JButton("/");
        JButton bMul = new JButton("*");
        JButton bDot = new JButton(".");
        JButton bEq = new JButton("=");



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
        b1.addActionListener( (ae) -> textBox.setText(textBox.getText() + b1.getText()));
        b2.addActionListener( (ae) -> textBox.setText(textBox.getText() + b2.getText()));
        b3.addActionListener( (ae) -> textBox.setText(textBox.getText() + b3.getText()));
        b4.addActionListener( (ae) -> textBox.setText(textBox.getText() + b4.getText()));
        b5.addActionListener( (ae) -> textBox.setText(textBox.getText() + b5.getText()));
        b6.addActionListener( (ae) -> textBox.setText(textBox.getText() + b6.getText()));
        b7.addActionListener( (ae) -> textBox.setText(textBox.getText() + b7.getText()));
        b8.addActionListener( (ae) -> textBox.setText(textBox.getText() + b8.getText()));
        b9.addActionListener( (ae) -> textBox.setText(textBox.getText() + b9.getText()));
        b0.addActionListener( (ae) -> textBox.setText(textBox.getText() + b0.getText()));

        bPlus.addActionListener( (ae) ->    textBox.setText(textBox.getText() + bPlus.getText()));
        bMinus.addActionListener( (ae) ->   textBox.setText(textBox.getText() + bMinus.getText()));
        bDiv.addActionListener( (ae) ->     textBox.setText(textBox.getText() + bDiv.getText()));
        bMul.addActionListener( (ae) ->     textBox.setText(textBox.getText() + bMul.getText()));
        bDot.addActionListener( (ae) ->     textBox.setText(textBox.getText() + bDot.getText()));
        bEq.addActionListener( (ae) ->      textBox.setText(textBox.getText() + bEq.getText()));


        //adding components
        container.add(textBox);
        container.add(b9);
        container.add(b8);
        container.add(b7);
        container.add(bPlus);

        container.add(b6);
        container.add(b5);
        container.add(b4);
        container.add(bMinus);

        container.add(b3);
        container.add(b2);
        container.add(b1);
        container.add(bDiv);

        container.add(bMul);
        container.add(b0);
        container.add(bDot);
        container.add(bEq);
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
