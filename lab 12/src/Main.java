import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{



        File plik = new File("plik.class");
        Scanner scanner = new Scanner(plik);

        String tekst = scanner.nextLine();
        try(FileInputStream imputStream = new FileInputStream(plik)) {
            byte[] pamiec = new byte[20];
            imputStream.read(pamiec);
            for(byte x : pamiec){
                int wartoscInt =  x & 0xFF; // Konwersja na typ int

                String wartoscHex = Integer.toHexString(wartoscInt);
                System.out.println(wartoscHex); // Wyświetli: a

            }
        }catch (IOException a){
            a.printStackTrace();
        }

    }
}