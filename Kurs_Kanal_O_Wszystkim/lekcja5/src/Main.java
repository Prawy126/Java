public class Main {
    public static void main(String[] args) {

        int wiek = 16;
        if(wiek>=18)
        {
            System.out.println("Pełnoletnia");
        }
        else if(wiek>=16)
                System.out.println("Możesz pracować");
        else
                System.out.println("Nie możesz nic!");
        //nawiasy klamrowe jeśli warunek ma wynoać wiele rzeczy ale jeśli wykonuje tylko jedną rzecz nie musi być nawiasu

        //skrócony warunek
        String imie = wiek >=18 ? "Bartek" : "Bartuś";
        System.out.println(imie);

    }
}