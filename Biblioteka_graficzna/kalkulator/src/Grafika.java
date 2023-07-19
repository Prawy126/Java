import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grafika extends JFrame implements ActionListener {
    private JButton bRownaSie, b1, b2 ,b3, b4 , b5, b6, b7, b8, b9, bDodawanie, bMnozenie, bOdejmowanie, bDzielenie;
    private JButton b0, bZnak, bPrzecinek;
    JLabel wyswietlacz;
    private String liczba = "", wyniks;
    private char znak;
    private double liczba1, liczba2, wynik = 0;

    Obliczenia licz = new Obliczenia();

    private int x = 5, y = 5, wysokosc = 50, szerokosc = 50;
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
        bPrzecinek = new JButton(",");
        bPrzecinek.setBounds(x+100,y+250,szerokosc,wysokosc);
        bPrzecinek.addActionListener(this);
        //add(bPrzecinek);
        b0 = new JButton("0");
        b0.setBounds(x+50,y+250,szerokosc,wysokosc);
        b0.addActionListener(this);
        add(b0);
        bZnak = new JButton("+/-");
        bZnak.setBounds(x,y+250,szerokosc,wysokosc);
        bZnak.addActionListener(this);
        //add(bZnak);
        bOdejmowanie = new JButton("-");
        bOdejmowanie.setBounds(x+150,y+150,szerokosc,wysokosc);
        bOdejmowanie.addActionListener(this);
       // add(bOdejmowanie);
        bMnozenie = new JButton("*");
        bMnozenie.setBounds(x+150,y+100,szerokosc,wysokosc);
        bMnozenie.addActionListener(this);
        //add(bMnozenie);
        bDzielenie = new JButton("/");
        bDzielenie.setBounds(x+150,y+50,szerokosc,wysokosc);
        bDzielenie.addActionListener(this);
       // add(bDzielenie);
        //dodanie wyświetlacza
        wyswietlacz = new JLabel("Domyślny tekst");
        wyswietlacz.setBounds(x,y,250,20);
        wyswietlacz.setForeground(Color.BLUE);
        wyswietlacz.setFont(new Font("SansSerif",Font.BOLD,20));
        add(wyswietlacz);

        setSize(225,350);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if (zrodlo == b0 || zrodlo == b1 || zrodlo == b2 || zrodlo == b3 || zrodlo == b4 ||
                zrodlo == b5 || zrodlo == b6 || zrodlo == b7 || zrodlo == b8 || zrodlo == b9 || zrodlo == bPrzecinek) {
            liczba = liczba + ((JButton) zrodlo).getText();
            wyswietlacz.setText(liczba);
        }
        if(zrodlo == bDodawanie) {
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            znak = '+';
        }else if(zrodlo == bOdejmowanie) {
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            znak = '-';
        }else if(zrodlo == bMnozenie) {
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            znak = '*';
        }else if(zrodlo == bDzielenie) {
            liczba1 = Double.parseDouble(liczba);
            liczba = "";
            znak = '/';
        }else if(zrodlo == bRownaSie) {
            liczba2 = Double.parseDouble(liczba);
            liczba = "";
            if(znak == '+'){
                wynik = licz.dodawanie(liczba1, liczba2);
            }else if(znak == '-') {
                wynik = licz.odejmowanie(liczba1, liczba2);
            }else if(znak == '*'){
                wynik = licz.mnozenie(liczba1,liczba2);

            }else if(znak == '/'){
               try{
                   wynik = liczba.dzielenie(liczba1,liczba2);
               }catch (Exception a){

               }
            }
        }


    }
}
