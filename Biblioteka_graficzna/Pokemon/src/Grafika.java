import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.jar.JarEntry;

public class Grafika extends JFrame implements ActionListener {
    private JLabel opis;
    private String informacje;
    private PokemonInfo pokemon;
    private JTextField poleTekstu;
    private JButton bSzukaj;
    private int x = 0, y = 0, szerokosc = 350,wysokosc = 50;
    public Grafika(){

        opis = new JLabel("Podaj nazwę pokemona którego chcesz wyszukać:");
        opis.setBounds(x+10,y,szerokosc,wysokosc);
        add(opis);

        poleTekstu = new JTextField("");
        poleTekstu.setBounds(x+10,y+60,szerokosc,wysokosc-20);
        poleTekstu.addActionListener(this);
        poleTekstu.setToolTipText("Tutaj wpisz nazwę pokemona");
        add(poleTekstu);

       /* bSzukaj = new JButton("Szukaj");
        bSzukaj.setBounds(x+50,y+90,szerokosc-250,wysokosc-20);
        add(bSzukaj);
        bSzukaj.addActionListener(this);*/
        //ustawienia standardowe okna
        setSize(500,500);
        setTitle("PokemonInfo");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if(zrodlo == poleTekstu){
            pokemon = new PokemonInfo(poleTekstu.getText());
           informacje =  pokemon.informacje();
            System.out.println(informacje);
            Zapisywanie zapisywanie = new Zapisywanie(informacje);

        }
    }
}
