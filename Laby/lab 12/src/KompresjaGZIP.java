import java.io.*;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
public class KompresjaGZIP {
    public static void main(String[] args) throws IOException { // wersja dla Linuxa String nazwa pliku = "/tmp/io_test.gzip"; // wersja dla Windows //String nazwaPliku = "c:\\io_test.gzip";
        String a = "kompresja w Java jest prosta";
        String nazwaPliku="C:\\Users\\micha\\Desktop\\strona_internetowa\\nauka\\java_lab\\lab 12\\src\\io_test.gzip";

        BufferedOutputStream os = new BufferedOutputStream( new GZIPOutputStream(new FileOutputStream (nazwaPliku)));
        PrintWriter pw = new PrintWriter( new OutputStreamWriter (os));
        pw.write(a);
        CRC32 crc32 = new CRC32();
        byte[] bytes = a.getBytes();
        crc32.update(bytes);
        long checkusm = crc32.getValue();
        pw.close();
// dekompresja
        BufferedInputStream is = new BufferedInputStream(
                new GZIPInputStream(new FileInputStream(nazwaPliku)));
        BufferedReader br = new BufferedReader(new InputStreamReader (is));
                String s;

        while ((s = br.readLine()) != null )
            System.out.println(s);
        System.out.println("Suma kontolna CRC32: " + checkusm);
    }
}