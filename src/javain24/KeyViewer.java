package javain24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyViewer extends JFrame {
    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press any key");

    public KeyViewer() {
        super("KeyViewer");
        setSize(350,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char key = e.getKeyChar();
                keyLabel.setText("You pressed " + key);
            }
        });
        BorderLayout border =  new BorderLayout();
        setLayout(border);
        add(keyLabel,BorderLayout.NORTH);
        add(keyText,BorderLayout.CENTER);
        setVisible(true);


    }

    public static void main(String[] args) {
        new KeyViewer();
    }

}
