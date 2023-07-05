import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        int licz=0;
        List<? super Owoc> oList = new ArrayList<>();
        oList.add(new Owoc());
        oList.add(new Jablko());
        oList.add(new Papierowka());
        oList.add(new Banan());
        oList.add(new Gruszka());
        for(Object i : oList){
            licz +=1;
            System.out.println(licz);
        }
    }
}
