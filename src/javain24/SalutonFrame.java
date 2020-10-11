package javain24;

import javax.swing.*;

public class SalutonFrame extends JFrame {
    public SalutonFrame(){
        super("Saluton Mondo");
        setLookAndFeel();
        setSize(450,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
