package javain24;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class SalutonFrame extends JFrame {

    JButton okButton,cancelButton, abortButton;

    public SalutonFrame(){
        super("Saluton Mondo");
        setLookAndFeel();
        setSize(450,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout flowLayout = new FlowLayout();
        setLayout(flowLayout);

        okButton = new JButton("OK");
        add(okButton);
        cancelButton = new JButton("Cancel");
        add(cancelButton);
        abortButton = new JButton("Abort");
        add(abortButton);

        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        new SalutonFrame();
    }

}
