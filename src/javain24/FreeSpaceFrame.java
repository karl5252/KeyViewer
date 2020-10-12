package javain24;

import javax.swing.*;
import java.awt.*;
import  javain24.FreeSpacePanel;

public class FreeSpaceFrame extends JFrame {

    public FreeSpaceFrame() {
        super("Disk Free Space");
        setLookAndFeel();
        setSize(450,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout flowLayout = new FlowLayout();
        setLayout(flowLayout);
        FreeSpacePanel freeSpacePanel = new FreeSpacePanel();
        add(freeSpacePanel);
        setVisible(true);
    }




    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        }catch(Exception e){
            //System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        new FreeSpaceFrame();
    }

}
