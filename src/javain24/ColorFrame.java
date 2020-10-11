package javain24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame {
    JButton red, green, blue;

    public ColorFrame() {
        super("ColorFrame");
        setSize(322, 122);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);

        red = new JButton("Red");
        add(red);
        green = new JButton("Green");
        add(green);
        blue = new JButton("Blue");
        add(blue);

        ActionListener act = (event) -> {
            if (event.getSource() == red) {
                getContentPane().setBackground((Color.RED));
            }
            if (event.getSource() == green) {
                getContentPane().setBackground((Color.GREEN));
            }
            if (event.getSource() == blue) {
                getContentPane().setBackground((Color.BLUE));
            }
        };
        red.addActionListener(act);
        green.addActionListener(act);
        blue.addActionListener(act);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ColorFrame();
    }

}
