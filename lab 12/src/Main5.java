import java.io.*;
import java.util.concurrent.TimeUnit;

public class Main5 {
    public static void main(String[] args) {
        echoWithBuffering("C:\\Users\\micha\\Desktop\\strona_internetowa\\nauka\\java_lab\\lab 12\\src\\tekst.txt", "C:\\Users\\micha\\Desktop\\strona_internetowa\\nauka\\java_lab\\lab 12\\src\\tekst2.txt");
        echoWithoutBuffering("C:\\Users\\micha\\Desktop\\strona_internetowa\\nauka\\java_lab\\lab 12\\src\\tekst.txt", "C:\\Users\\micha\\Desktop\\strona_internetowa\\nauka\\java_lab\\lab 12\\src\\tekst2.txt");

    }

    public static void echoWithoutBuffering(String plikOdczytu, String plikZapisu) {
        long startTime = System.nanoTime();
        try (Reader reader = new FileReader(plikOdczytu); Writer writer = new FileWriter(plikZapisu)) {
            int znak;
            while ((znak = reader.read()) != -1) {
                writer.write(znak);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            long milliseconds = TimeUnit.NANOSECONDS.toMillis(duration);
            System.out.println("Czas kopiowania bez buforowania: " + milliseconds + " ms");
        }
    }

    public static void echoWithBuffering(String plikOdczytu, String plikZapisu) {
        long startTime = System.nanoTime();
        try (Reader reader = new BufferedReader(new FileReader(plikOdczytu));
             Writer writer = new BufferedWriter(new FileWriter(plikZapisu))) {
            int znak;
            while ((znak = reader.read()) != -1) {
                writer.write(znak);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            long milliseconds = TimeUnit.NANOSECONDS.toMillis(duration);
            System.out.println("Czas kopiowania z buforowaniem: " + milliseconds + " ms");
        }
    }
}
