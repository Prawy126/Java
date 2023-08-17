import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Grafika grafika = new Grafika();
        grafika.setSize(500,500);
        grafika.setTitle("GRA KÓŁKO KRZYŻYK!!!");
        grafika.setVisible(true);

        grafika.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}