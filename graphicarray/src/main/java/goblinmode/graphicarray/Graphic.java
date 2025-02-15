package goblinmode.graphicarray;

import java.util.ArrayList;

import javax.swing.*;

public class Graphic {
    JFrame frame;
    JTable table;

    public Graphic(ArrayList<?> array) {
        frame = new JFrame("Graphic Array");

        String[][] data = new String[array.size()][2];

        for (int i = 0; i < data.length; i++) {
            data[i][0] = "" + i;
            data[i][1] = "" + array.get(i);
        }

        String[] cNames = {"Index", "Value"};
        table = new JTable(data, cNames);

        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);

        frame.setSize(300,400);
        frame.setVisible(true);
    }
}
