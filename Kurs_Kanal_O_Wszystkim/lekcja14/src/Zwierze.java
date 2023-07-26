public class Zwierze {
    static int liczebnosc=0;
    Zwierze(){
        liczebnosc++;
    }
    String imie;
    String glos = "Grrrrr";
    public void dajGlos(int x)
    {
        for(int i = 0; i<x;i++)
        {
            System.out.println(glos);


        }
    }
    public void przedstawSie()
    {
        System.out.println("Nazywam się " + imie);
    }

}
