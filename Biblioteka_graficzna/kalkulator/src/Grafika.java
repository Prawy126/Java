import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grafika extends JFrame implements ActionListener {
    //zmienne do przycisków
    final private JButton bRownaSie, b1, b2 ,b3, b4 , b5, b6, b7, b8, b9, bDodawanie, bMnozenie, bOdejmowanie, bDzielenie;
    final private JButton b0, bZnak, bPrzecinek, bCzyszczenie, bWylacz, bPierwiastek, bPamiec, bcPamiec;
    final private JButton bSinus, bCosinus, bTangens, bCotangens, bWartoscBezwgledna, hsinus, hcosinus, htangens, hcotangens;
    final private ButtonGroup grupa;
    final private JRadioButton radian, stopien;
    final private JMenu mOpcje, mPomoc;
    final private JMenuBar menuBar;
    final private JMenuItem funkcjeTrygomometryczne, funkcjaBezwgledna, pierwiastek, mPamiec, zamanaNaDwojkowy, zamanaNaOsemkowy, zamanaNaSzestnastkowy, pomoc;

    //zmienna do wyświetlacza
    final private JLabel wyswietlacz;

    //zmienna do zmiany znaku
    private boolean zmianaZnaku = false, przecinek;

    //zmienna wyświetlająca liczby w onknie
    private String liczba = "", wyniks, pamiec = "0", trygonometria;

    //zmienna do określenia które działanie trzeba wykonać
    private char znak;

    private double liczba1 = 0, liczba2 = 0, wynik = 0;

    Obliczenia licz = new Obliczenia();

    private int x = 11, y = 35, wysokosc = 50, szerokosc = 50;
    public Grafika(){
        setTitle("Kalkulator");
        setLayout(null);
        //dodanie przycisków
        bRownaSie = new JButton("=");
        bRownaSie.setBounds(x+150,y+250,szerokosc,wysokosc);
        bRownaSie.addActionListener(this);
        add(bRownaSie);
        b1 = new JButton("1");
        b1.setBounds(x,y+200,szerokosc,wysokosc);
        b1.addActionListener(this);
        add(b1);
        b2 = new JButton("2");
        b2.setBounds(x+50,y+200,szerokosc,wysokosc);
        b2.addActionListener(this);
        add(b2);
        b3 = new JButton("3");
        b3.setBounds(x+100,y+200,szerokosc,wysokosc);
        b3.addActionListener(this);
        add(b3);
        b6 = new JButton("6");
        b6.setBounds(x+100,y+150,szerokosc,wysokosc);
        b6.addActionListener(this);
        add(b6);
        b5 = new JButton("5");
        b5.setBounds(x+50,y+150,szerokosc,wysokosc);
        b5.addActionListener(this);
        add(b5);
        b4 = new JButton("4");
        b4.setBounds(x,y+150,szerokosc,wysokosc);
        b4.addActionListener(this);
        add(b4);
        b9 = new JButton("9");
        b9.setBounds(x+100,y+100,szerokosc,wysokosc);
        b9.addActionListener(this);
        add(b9);
        b8 = new JButton("8");
        b8.setBounds(x+50,y+100,szerokosc,wysokosc);
        b8.addActionListener(this);
        add(b8);
        b7 = new JButton("7");
        b7.setBounds(x,y+100,szerokosc,wysokosc);
        b7.addActionListener(this);
        add(b7);
        bDodawanie = new JButton("+");
        bDodawanie.setBounds(x+150,y+200,szerokosc,wysokosc);
        bDodawanie.addActionListener(this);
        add(bDodawanie);
        bPrzecinek = new JButton(".");
        bPrzecinek.setBounds(x+100,y+250,szerokosc,wysokosc);
        bPrzecinek.addActionListener(this);
        add(bPrzecinek);
        b0 = new JButton("0");
        b0.setBounds(x+50,y+250,szerokosc,wysokosc);
        b0.addActionListener(this);
        add(b0);
        bZnak = new JButton("+/-");
        bZnak.setBounds(x,y+250,szerokosc,wysokosc);
        bZnak.addActionListener(this);
        add(bZnak);
        bOdejmowanie = new JButton("-");
        bOdejmowanie.setBounds(x+150,y+150,szerokosc,wysokosc);
        bOdejmowanie.addActionListener(this);
        add(bOdejmowanie);
        bMnozenie = new JButton("*");
        bMnozenie.setBounds(x+150,y+100,szerokosc,wysokosc);
        bMnozenie.addActionListener(this);
        add(bMnozenie);
        bDzielenie = new JButton("/");
        bDzielenie.setBounds(x+150,y+50,szerokosc,wysokosc);
        bDzielenie.addActionListener(this);
        add(bDzielenie);
        bCzyszczenie = new JButton("AC");
        bCzyszczenie.setBounds(x+100,y+50,szerokosc,wysokosc);
        bCzyszczenie.addActionListener(this);
        add(bCzyszczenie);
        bWylacz = new JButton("OFF");
        bWylacz.setBounds(x,y+50,szerokosc*2,wysokosc);
        bWylacz.addActionListener(this);
        add(bWylacz);
        bPierwiastek = new JButton("√");
        bPierwiastek.setBounds(x+150,y,szerokosc,wysokosc);
        bPierwiastek.addActionListener(this);
        add(bPierwiastek);
        bPamiec = new JButton("M+");
        bPamiec.setBounds(x+100,y,szerokosc,wysokosc);
        bPamiec.addActionListener(this);
        bPamiec.setFont(new Font("SansSerif",Font.BOLD,10));
        add(bPamiec);
        bcPamiec = new JButton("MC");
        bcPamiec.setBounds(x+50,y,szerokosc,wysokosc);
        bcPamiec.addActionListener(this);
        bcPamiec.setFont(new Font("SansSerif",Font.BOLD,10));
        add(bcPamiec);
        //funkcje tygonometrynczne
        bSinus = new JButton("Sin");
        bSinus.setBounds(x+200,y+100,szerokosc,wysokosc);
        bSinus.addActionListener(this);
        bSinus.setFont(new Font("SansSerif",Font.BOLD,9));
        add(bSinus);
        bCosinus = new JButton("Cos");
        bCosinus.setBounds(x+200,y+150,szerokosc,wysokosc);
        bCosinus.addActionListener(this);
        bCosinus.setFont(new Font("SansSerif",Font.BOLD,8));
        add(bCosinus);
        bTangens = new JButton("Tg");
        bTangens.setBounds(x+200,y+200,szerokosc,wysokosc);
        bTangens.addActionListener(this);
        bTangens.setFont(new Font("SansSerif",Font.BOLD,9));
        add(bTangens);
        bCotangens = new JButton("Ctg");
        bCotangens.setBounds(x+200,y+250,szerokosc,wysokosc);
        bCotangens.addActionListener(this);
        bCotangens.setFont(new Font("SansSerif",Font.BOLD,9));
        add(bCotangens);
        hsinus = new JButton("SH");
        hsinus.setBounds(x+250,y+100,szerokosc,wysokosc);
        hsinus.addActionListener(this);
        hsinus.setFont(new Font("SansSerif",Font.BOLD,9));
        add(hsinus);
        hcosinus = new JButton("CH");
        hcosinus.setBounds(x+250, y+150,szerokosc,wysokosc);
        hcosinus.setFont(new Font("SansSerif",Font.BOLD,9));
        hcosinus.addActionListener(this);
        add(hcosinus);
        htangens = new JButton("TH");
        htangens.setBounds(x+250, y+200,szerokosc,wysokosc);
        htangens.setFont(new Font("SansSerif",Font.BOLD,9));
        htangens.addActionListener(this);
        add(htangens);
        hcotangens = new JButton("CtH");
        hcotangens.setBounds(x+250,y+250,szerokosc,wysokosc);
        hcotangens.setFont(new Font("SansSerif",Font.BOLD,9));
        hcotangens.addActionListener(this);
        add(hcotangens);
        //przełączniki z radnianów na stopnie i odwrotnie
        grupa = new ButtonGroup();
        radian = new JRadioButton("RAD");
        radian.setBounds(x+200,y,szerokosc,wysokosc);
        grupa.add(radian);
        radian.setSelected(true);
        add(radian);
        stopien = new JRadioButton("DEG");
        stopien.setFont(new Font("SansSerif",Font.BOLD,9));
        stopien.setBounds(x+200,y+40,szerokosc,wysokosc);
        grupa.add(stopien);
        add(stopien);
        bWartoscBezwgledna = new JButton("|x|");
        bWartoscBezwgledna.setBounds(x,y,szerokosc,wysokosc);
        bWartoscBezwgledna.addActionListener(this);
        add(bWartoscBezwgledna);
        //dodanie wyświetlacza
        wyswietlacz = new JLabel("0");
        wyswietlacz.setBounds(x,y-30,250,20);
        wyswietlacz.setForeground(Color.BLUE);
        wyswietlacz.setFont(new Font("SansSerif",Font.BOLD,20));
        add(wyswietlacz);

        //pasek menu
        menuBar = new JMenuBar();
        mOpcje = new JMenu("Opcje");
        mOpcje.addActionListener(this);
        mPomoc = new JMenu("Pomoc");
        mPomoc.addActionListener(this);
        setJMenuBar(menuBar);
        menuBar.add(mOpcje);
        menuBar.add(mPomoc);
        funkcjeTrygomometryczne = new JMenuItem("Funkcje trygonomtryczne", 'F');
        mPomoc.add(funkcjeTrygomometryczne);
        funkcjeTrygomometryczne.addActionListener(this);
        funkcjaBezwgledna = new JMenuItem("Funckja bezwzględna",'F');
        mPomoc.add(funkcjaBezwgledna);
        funkcjaBezwgledna.addActionListener(this);
        pierwiastek = new JMenuItem("Pierwiastek",'P');
        mPomoc.add(pierwiastek);
        pierwiastek.addActionListener(this);
        mPamiec = new JMenuItem("Pamięć kalkulatora",'P');
        mPomoc.add(mPamiec);
        mPamiec.addActionListener(this);
        zamanaNaDwojkowy = new JMenuItem("Zamiana z systemu dziesiętnego na dwójkowy",'Z');
        zamanaNaDwojkowy.addActionListener(this);
        mOpcje.add(zamanaNaDwojkowy);

        zamanaNaOsemkowy = new JMenuItem("Zamiana z systemu dziesiętnego na ósemkowy",'Z');
        zamanaNaOsemkowy.addActionListener(this);
        mOpcje.add(zamanaNaOsemkowy);
        zamanaNaSzestnastkowy = new JMenuItem("Zamiana z systemu dziesiętnego na szesnastkowy",'Z');
        zamanaNaSzestnastkowy.addActionListener(this);
        mOpcje.add(zamanaNaSzestnastkowy);
        pomoc = new JMenuItem("Informacje o kalkulatorze",'I');
        pomoc.addActionListener(this);
        mPomoc.add(pomoc);
        setSize(340,400);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        //odczytywanie przycisków i zamienianie ich na tekst
        if (zrodlo == b0 || zrodlo == b1 || zrodlo == b2 || zrodlo == b3 || zrodlo == b4 ||
                zrodlo == b5 || zrodlo == b6 || zrodlo == b7 || zrodlo == b8 || zrodlo == b9) {
            liczba = liczba + ((JButton) zrodlo).getText();
            wyswietlacz.setText(liczba);
        }
        //zapisanie tekstu jako liczbę i wybranie działania
        else if(zrodlo == bPrzecinek){
            if(przecinek == false){
                liczba = liczba + ".";
                przecinek = true;
            }
            //pierwiastek
        }else if(zrodlo == bPierwiastek){
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            przecinek = false;
            zmianaZnaku = false;
            wynik = licz.pierwiastek(liczba1);
            wyniks = String.valueOf(wynik);
            wyswietlacz.setText(wyniks);
            liczba = wyniks;
            //pamięć kalkulatora
        }else if(zrodlo == bPamiec) {
            if(pamiec.equals("0")){
                pamiec = liczba;
            }
            wyswietlacz.setText(pamiec);
            liczba = pamiec;
        //czyszczenie pamięci
        }else if(zrodlo == bcPamiec){
            pamiec="0";
            System.out.println("Czyszczenie");
        }
        //przyciski od funkcji trygonometrycznych
        if(zrodlo == bSinus){
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            przecinek = false;
            zmianaZnaku = false;
            znak = 's';
        }else if(zrodlo == bCosinus){
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            przecinek = false;
            zmianaZnaku = false;
            znak = 'c';
        }else if(zrodlo == bTangens) {
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            przecinek = false;
            zmianaZnaku = false;
            znak = 't';
        }else if(zrodlo == bCotangens){
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            przecinek = false;
            zmianaZnaku = false;
            znak = 'k';
        }else if(zrodlo == hsinus){
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            przecinek = false;
            zmianaZnaku = false;
            trygonometria = "sinus";
        }else if(zrodlo == hcosinus){
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            przecinek = false;
            zmianaZnaku = false;
            trygonometria = "cosinus";
        }else if(zrodlo == htangens){
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            przecinek = false;
            zmianaZnaku = false;
            trygonometria = "tangens";
        }else if(zrodlo == hcotangens){
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            przecinek = false;
            zmianaZnaku = false;
            trygonometria = "cotangens";
        }
        if(zrodlo == bDodawanie) {
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            przecinek = false;
            zmianaZnaku = false;
            znak = '+';
        }else if(zrodlo == bOdejmowanie) {
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            przecinek = false;
            zmianaZnaku = false;
            znak = '-';
        }else if(zrodlo == bMnozenie) {
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            przecinek = false;
            zmianaZnaku = false;
            znak = '*';
        }else if(zrodlo == bDzielenie) {
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            przecinek = false;
            zmianaZnaku = false;
            znak = '/';
        //wykonywanie odpowiednich równań
        }else if(zrodlo == bWartoscBezwgledna){
            liczba1 = Double.parseDouble(liczba);
            liczba="";
            przecinek = false;
            zmianaZnaku = false;
            znak = 'a';
        }else if(zrodlo == bRownaSie) {
            if(znak == 'a'){
                wynik = licz.wartoscBezwzgledna(liczba1);
                wyniks = String.valueOf(wynik);
                wyswietlacz.setText(wyniks);
            }else if(znak == 's'){
                wynik = licz.sinus(liczba1, stopien.isSelected());
                wyniks = String.valueOf(wynik);
                wyswietlacz.setText(wyniks);
            }else if(znak == 'c'){
                wynik = licz.cosinus(liczba1, stopien.isSelected());
                wyniks = String.valueOf(wynik);
                wyswietlacz.setText(wyniks);
            }else if(znak == 't'){
                    wynik = licz.tangens(liczba1, stopien.isSelected());
                    wyniks = String.valueOf(wynik);
                    wyswietlacz.setText(wyniks);
            }else  if(znak == 'k'){
                wynik = licz.cotangens(liczba1, stopien.isSelected());
                wyniks = String.valueOf(wynik);
                wyswietlacz.setText(wyniks);
            }else if(trygonometria.equals("sinus")){
                wynik = licz.hyper(liczba1,"sinus");
                wyniks = String.valueOf(wynik);
                wyswietlacz.setText(wyniks);
            }else if(trygonometria.equals("cosinus")){
                wynik = licz.hyper(liczba1,"cosinus");
                wyniks = String.valueOf(wynik);
                wyswietlacz.setText(wyniks);
            }else if(trygonometria.equals("tangens")){
                wynik = licz.hyper(liczba1,"tangens");
                wyniks = String.valueOf(wynik);
                wyswietlacz.setText(wyniks);
            }else if(trygonometria.equals("cotangens")){
                wynik = licz.hyper(liczba1,"cotangens");
                wyniks = String.valueOf(wynik);
                wyswietlacz.setText(wyniks);
            }
            if(znak == '+'){
                liczba2 = Double.parseDouble(liczba);
                liczba = "";
                przecinek = false;
                zmianaZnaku = false;
                wynik = licz.dodawanie(liczba1, liczba2);
                wyniks = String.valueOf(wynik);
                wyswietlacz.setText(wyniks);
            }else if(znak == '-') {
                liczba2 = Double.parseDouble(liczba);
                liczba = "";
                przecinek = false;
                zmianaZnaku = false;
                wynik = licz.odejmowanie(liczba1, liczba2);
                wyniks = String.valueOf(wynik);
                wyswietlacz.setText(wyniks);
            }else if(znak == '*'){
                liczba2 = Double.parseDouble(liczba);
                liczba = "";
                przecinek = false;
                zmianaZnaku = false;
                wynik = licz.mnozenie(liczba1,liczba2);
                wyniks = String.valueOf(wynik);
                wyswietlacz.setText(wyniks);
            }else if(znak == '/'){
               try{
                   liczba2 = Double.parseDouble(liczba);
                   liczba = "";
                   przecinek = false;
                   zmianaZnaku = false;
                   wynik = licz.dzielenie(liczba1,liczba2);
               }catch (Exception a){
                   wyniks = "nie można dzielić przez 0";
                   wyswietlacz.setText(wyniks);
               }
               if(liczba2!=0){
                   wyniks = String.valueOf(wynik);
                   wyswietlacz.setText(wyniks);
               }else
                zmianaZnaku = false;
            }
            //implementacja przycisko czyszczącego
        } else if(zrodlo == bCzyszczenie){
            liczba = "";
            przecinek = false;
            wyswietlacz.setText(liczba);
            //implementacja przycisku wyłączenia(nie jest to x w górnym prawym rogu)
        }else if(zrodlo == bWylacz) {
            dispose();
            //implementacja przycsku do zmiany znaku liczby
        }else if(zrodlo == bZnak){
            if(zmianaZnaku == false){
                liczba= "-"+liczba;
                zmianaZnaku = true;
                wyswietlacz.setText(liczba);
            }else if(zmianaZnaku == true){
                liczba1 = Double.parseDouble(liczba);
                liczba1 = Math.abs(liczba1);
                liczba = String.valueOf(liczba1);
                zmianaZnaku = false;
                wyswietlacz.setText(liczba);
            }
        }
        //obsługa menu bara
        if(zrodlo == funkcjeTrygomometryczne){
            JOptionPane.showMessageDialog(this, "Funkcje tygonometryczne działają w następujący sposób:\nNależy wybrać liczbę następnie nacisnąć wybraną funckję a następnie znak równa się\nUwaga!!\nWyniku funkcji trygonometrycznej aktualnie nie wolono dodawać ani wykonywać obliczeń chyba że uzyje sie funkcji pamięci kalkulatora.");
        }else if(zrodlo == mPamiec){
            JOptionPane.showMessageDialog(this, "Funkcja pamięci kalkulatora działa w następujący sposób:\nNależy wybrać liczbę następnie nacisnąć przycisk 'M+' a następnie liczba zostaje zapisana w pamięci\nUwaga!!\nTrzeba pamiętać że liczba z pamięci po wykonaniu obliczeń nie zeruje się ani nie przepada więc trzeba ręcznie ją wyczyścić za pomocą przycisku 'MC'");
        }else if(zrodlo == pierwiastek){
            JOptionPane.showMessageDialog(this, "Pierwaistek działa w następujący sposób:\nNależy wybrać liczbę następnie nacisnąć symbol pierwiastka a następnie znak równa się by obliczyć pierwiaste\nUwaga!!\nTrzeba pamiętać że na takim wyniku nie wolno wykonywać obliczeń należy użyć pamięci kalkulatora żeby można było wykonywać obliczenia");
        }else if(zrodlo == pomoc){
            JOptionPane.showMessageDialog(this,"Wersja 1.0.2\nKalkulator prosty obsługujący proste funkcje matematyczne oraz zamianę systemów liczbowych z dziesiętnego na dwójkowy, ósemkowy i szestnastkowy\n\tAutor programu: Prawy_126");
        }
        //obsługa zamiany systemów
        if(zrodlo == zamanaNaDwojkowy){
            String liczba = JOptionPane.showInputDialog(this,"Podaj liczbę w systemie dziesiętnym:");
            int liczba1 =Integer.valueOf(liczba);
            String koniec = licz.innySystem(liczba1,2);
            JOptionPane.showMessageDialog(this, liczba + " w systemie dwójkowym wygląda następująco: " + koniec);
        }
        else if(zrodlo == zamanaNaOsemkowy){
            String liczba = JOptionPane.showInputDialog(this,"Podaj liczbę w systemie dziesiętnym:");
            int liczba1 =Integer.valueOf(liczba);
            String koniec = licz.innySystem(liczba1,8);
            JOptionPane.showMessageDialog(this, liczba + " w systemie ósemkowym wygląda następująco: " + koniec);
        }
        else if(zrodlo == zamanaNaSzestnastkowy){
            String liczba = JOptionPane.showInputDialog(this,"Podaj liczbę w systemie dziesiętnym:");
            int liczba1 =Integer.valueOf(liczba);
            String koniec = licz.innySystem(liczba1, 16);
            JOptionPane.showMessageDialog(this, liczba + " w systemie szesnastkowym wygląda następująco: " + koniec);
        }

    }
}
