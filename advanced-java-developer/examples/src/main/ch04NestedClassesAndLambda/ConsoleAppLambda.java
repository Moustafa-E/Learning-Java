package main.ch04NestedClassesAndLambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConsoleAppLambda extends JFrame {
    private JButton btnPress;
    private JButton btnExit;
    private JTextField txt;

    public ConsoleAppLambda() {
        btnPress = new JButton("Press me");
        btnExit = new JButton("Exit");
        txt = new JTextField(30);

        setSize(800, 600);
        setTitle("Console App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        add(btnPress);
        add(txt);
        add(btnExit);

        setVisible(true);
        // calls a named member inner class.
        btnPress.addActionListener(e -> txt.setText("You pressed le button"));
        // calls an anonymous member inner class
        btnExit.addActionListener(
            // ActionListener is an interface but we implemented its methods with an nameless method: a lambda function.
            e -> System.exit(0)
            // Full version of this: (ActionEvent e) -> {System.exit(0);}. ActionEvent typing expected by class so can be omitted.
        );
        txt.addKeyListener( new TxtListener() ); // You can't make this a lambda because we aren't implementing a functional interface (one with only 1 method to implement)

    }

    class TxtListener extends KeyAdapter {
        public void keyTyped(KeyEvent e) {
            txt.setBackground(Color.LIGHT_GRAY);
        }
    }

    public static void main(String[] args) {
        new ConsoleApp();
    }
    
}
