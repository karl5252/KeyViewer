package javain24;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FreeSpacePanel extends JPanel {

    JLabel spaceLabel = new JLabel("Disk space: ");
    JLabel space = new JLabel();

    public FreeSpacePanel() {
        super();
        add(spaceLabel);
        add(space);
        try {
            setValue();
        } catch (IOException e) {
            space.setText("Error");
            e.printStackTrace();

        }
    }


    private final void setValue() throws IOException{
        Path current = Paths.get("");
        FileStore store = Files.getFileStore(current);

        long totalSpace = store.getTotalSpace();
        long freeSpace = store.getUsableSpace();

        double percent = (double)freeSpace / (double)totalSpace * 100;
        percent = (int)(percent * 100) / (double)100;
        space.setText(freeSpace + " free space out of "+ totalSpace + " (" + percent + " %)");


    }


}

