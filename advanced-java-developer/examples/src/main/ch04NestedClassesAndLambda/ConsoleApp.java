package main.ch04NestedClassesAndLambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConsoleApp extends JFrame {

    private JButton btnPress;
    private JButton btnExit;
    private JTextField txt;

    public ConsoleApp() {
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
        btnPress.addActionListener(new PressedListener());
        // calls an anonymous member inner class
        btnExit.addActionListener(
            // ActionListener is an interface but we implemented its methods with an nameless class.
            new ActionListener() {
                public void actionPerformed(ActionEvent e) { System.exit(0); }
            }
        );
        txt.addKeyListener(new TxtListener());

    }

    class PressedListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText("You pressed me :)");
        }
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
