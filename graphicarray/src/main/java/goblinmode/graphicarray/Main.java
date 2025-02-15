package goblinmode.graphicarray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        EXAMPLE:
        ArrayList<String> names = new ArrayList<>();
        names.add("John Smith");
        names.add("Jane Smith");
        names.add("Jenny Doe");
        names.add("Joey Doe");
        showGraphic(names);
        */
    }

    public static void showGraphic(ArrayList<?> array) {
        Graphic graphic = new Graphic(array);
    }
}