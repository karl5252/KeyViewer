package javain24;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FreeSpacePanel extends JFrame {

    JLabel spaceLabel = new JLabel();
    JLabel space = new JLabel();

    public FreeSpacePanel(){
        super();
        setLookAndFeel();
        setSize(450,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout flowLayout = new FlowLayout();
        setLayout(flowLayout);
        add(spaceLabel);
        add(space);
        try {
            setValue();
        } catch (IOException e) {
            space.setText("Error");
            e.printStackTrace();

        }

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
    private void setValue() throws IOException{
        Path current = Paths.get("");
        FileStore store = Files.getFileStore(current);

        long totalSpace = store.getTotalSpace();
        long freeSpace = store.getUsableSpace();

        double percent = (double)freeSpace / (double)totalSpace * 100;
        percent = (int)(percent * 100) / (double)100;
        space.setText(freeSpace + " free space out of "+ totalSpace + " (" + percent + " %)");


    }

    public static void main(String[] args) {
        new FreeSpacePanel();
    }
}
