import java.util.HashMap;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String pomoc;
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> tab = new HashMap<String, String>();
        tab.put("tak","yes");
        tab.put("nie","no");
        tab.put("Cześć","Hello");
        while(true){
            System.out.println("Proszę podać słowo po poslku: ");
            pomoc = scanner.next();
            if(pomoc.equalsIgnoreCase("koniec!"))System.exit(0);
            else System.out.println(tab.get(pomoc));

        }
    }
}
