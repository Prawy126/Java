import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grafika extends JFrame implements ActionListener {
    final private JButton lg, sg, pg, ls, s, ps, ld, sd, pd, wyjscie, nastepnaGra;
    final private int x = 10, y = 10, szerokosc = 50, wysokosc = 50;
    private int pomocX, pomocY;
    public char tablica[][] = new char[3][3];
    private Ruch ruch;
    private char znakGracza = 'X';
    private JMenuBar menuBar;
    private JMenu menuOpcje, menuPomoc, menuInfoarmacje;
    private JMenuItem mUstawNickGracza1, mUstawNickGracza2, mJakGrac, mInformacje, mUstawanieBota;
    private JCheckBoxMenuItem botLatwyKolko, botlatwyKrzyzyk;
    private Rozgrywka rozgrywka = new Rozgrywka();
    private Gracz gracz1 = new Gracz("Gacz1", 'X'), gracz2 = new Gracz("Gracz2", 'O');
    private char wygrany;
    private JLabel aktualniGracze, aktualnyWynik;
    private boolean graczX = false, graczY = false;

    public Grafika() {
        //tworzenie przycisków gry
        setLayout(null);
        setBackground(Color.blue);
        lg = new JButton("");
        lg.setBounds(x, y, szerokosc, wysokosc);
        lg.addActionListener(this);
        add(lg);
        sg = new JButton("");
        sg.setBounds(x + 50, y, szerokosc, wysokosc);
        sg.addActionListener(this);
        add(sg);
        pg = new JButton("");
        pg.setBounds(x + 100, y, szerokosc, wysokosc);
        pg.addActionListener(this);
        add(pg);
        ls = new JButton("");
        ls.setBounds(x, y + 50, szerokosc, wysokosc);
        ls.addActionListener(this);
        add(ls);
        s = new JButton("");
        s.setBounds(x + 50, y + 50, szerokosc, wysokosc);
        s.addActionListener(this);
        add(s);
        ps = new JButton("");
        ps.setBounds(x + 100, y + 50, szerokosc, wysokosc);
        ps.addActionListener(this);
        add(ps);
        ld = new JButton("");
        ld.setBounds(x, y + 100, szerokosc, wysokosc);
        ld.addActionListener(this);
        add(ld);
        sd = new JButton("");
        sd.setBounds(x + 50, y + 100, szerokosc, wysokosc);
        sd.addActionListener(this);
        add(sd);
        pd = new JButton("");
        pd.setBounds(x + 100, y + 100, szerokosc, wysokosc);
        pd.addActionListener(this);
        add(pd);
        wyjscie = new JButton("Wyjscie");
        wyjscie.setBounds(x + 200, y + 200, szerokosc + 100, wysokosc);
        wyjscie.addActionListener(this);
        add(wyjscie);
        nastepnaGra = new JButton("Następna Gra");
        nastepnaGra.setBounds(x + 200, y + 300, szerokosc + 200, wysokosc);
        nastepnaGra.addActionListener(this);
        add(nastepnaGra);
        wyjscie.setBackground(Color.RED);

        //menu gry
        if (rozgrywka.sprawdzCzyRemis(tablica)) {
            System.out.println("remis");
        }
        menuBar = new JMenuBar();
        menuOpcje = new JMenu("Opcje");
        mUstawNickGracza1 = new JMenuItem("Ustaw nick gracza 1");
        mUstawNickGracza1.setToolTipText("Ustaw nick gracza grającego X");
        menuOpcje.add(mUstawNickGracza1);
        mUstawNickGracza1.addActionListener(this);
        menuBar.add(menuOpcje);
        setJMenuBar(menuBar);
        mUstawNickGracza1.addActionListener(this);
        mUstawNickGracza2 = new JMenuItem("Ustaw nick gracza 2");
        mUstawNickGracza2.setToolTipText("Ustaw nick gracza grającego O");
        menuOpcje.add(mUstawNickGracza2);
        mUstawNickGracza2.addActionListener(this);
        menuInfoarmacje = new JMenu("Inforamcje");
        mInformacje = new JMenuItem("Inforamcje o grze",'I');
        menuInfoarmacje.add(mInformacje);
        mInformacje.addActionListener(this);
        menuBar.add(menuInfoarmacje);
        menuPomoc = new JMenu("Pomoc");
        mJakGrac = new JMenuItem("Jak grać",'a');
        menuPomoc.add(mJakGrac);
        mJakGrac.addActionListener(this);
        menuBar.add(menuPomoc);
        mUstawanieBota = new JMenuItem("Ustawienie bota",'U');
        menuOpcje.add(mUstawanieBota);
        botLatwyKolko = new JCheckBoxMenuItem("Bot gra jako gracz 2(O)");
        botlatwyKrzyzyk = new JCheckBoxMenuItem("Bot gra jako gracz 1(X)");
        botlatwyKrzyzyk.addActionListener(this);
        botLatwyKolko.addActionListener(this);
        mUstawanieBota.add(botLatwyKolko);
        mUstawanieBota.add(botlatwyKrzyzyk);
        botlatwyKrzyzyk.setState(true);

        //wynik gry
        aktualniGracze = new JLabel(gracz1.getNazwa() + " : " + gracz2.getNazwa());
        aktualniGracze.setBounds(x, y + 200, szerokosc + 200, wysokosc);
        add(aktualniGracze);
        aktualnyWynik = new JLabel(gracz1.getWynik() + " : " + gracz2.getWynik());
        aktualnyWynik.setBounds(x, y + 250, szerokosc, wysokosc);
        add(aktualnyWynik);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if (zrodlo == s) {
            s.setEnabled(false);
            s.setText(String.valueOf(znakGracza));
            if ((tablica[1][1] != 'X') || (tablica[1][1] != 'O')) {
                tablica[1][1] = znakGracza;
            }
            if (rozgrywka.wygrana(tablica)) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablica[i][j]);
                    }
                    System.out.println();
                }
                s.setEnabled(false);
                lg.setEnabled(false);
                sg.setEnabled(false);
                pg.setEnabled(false);
                ls.setEnabled(false);
                ps.setEnabled(false);
                ld.setEnabled(false);
                sd.setEnabled(false);
                pd.setEnabled(false);
                wygrany = rozgrywka.kto(tablica);
                if (gracz1.getZnak() == wygrany) {
                    gracz1.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                } else if(gracz2.getZnak()==wygrany){
                    gracz2.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }else if(rozgrywka.sprawdzCzyRemis(tablica)){
                    gracz2.remis();
                    gracz1.remis();
                    aktualnyWynik.setText(String.valueOf(gracz1.getWynik())+" : "+String.valueOf(gracz2.getWynik()));
                }
            }
            if (znakGracza == 'X') {
                znakGracza = 'O';
            } else {
                znakGracza = 'X';
            }
        } else if (zrodlo == lg) {
            lg.setEnabled(false);
            lg.setText(String.valueOf(znakGracza));
            if ((tablica[0][0] != 'X') || (tablica[0][0] != 'O')) {
                tablica[0][0] = znakGracza;
            }
            if (rozgrywka.wygrana(tablica)) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablica[i][j]);
                    }
                    System.out.println();
                }
                s.setEnabled(false);
                lg.setEnabled(false);
                sg.setEnabled(false);
                pg.setEnabled(false);
                ls.setEnabled(false);
                ps.setEnabled(false);
                ld.setEnabled(false);
                sd.setEnabled(false);
                pd.setEnabled(false);
                wygrany = rozgrywka.kto(tablica);
                if (gracz1.getZnak() == wygrany) {
                    gracz1.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                } else if(gracz2.getZnak()==wygrany){
                    gracz2.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }else if(rozgrywka.sprawdzCzyRemis(tablica)){
                    gracz1.remis();
                    gracz2.remis();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }
            }
            if (znakGracza == 'X') {
                znakGracza = 'O';
            } else {
                znakGracza = 'X';
            }
        } else if (zrodlo == sg) {
            sg.setEnabled(false);
            sg.setText(String.valueOf(znakGracza));
            if ((tablica[0][1] != 'X') || (tablica[0][1] != 'O')) {
                tablica[0][1] = znakGracza;
            }
            if (rozgrywka.wygrana(tablica)) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablica[i][j]);
                    }
                    System.out.println();
                }
                s.setEnabled(false);
                lg.setEnabled(false);
                sg.setEnabled(false);
                pg.setEnabled(false);
                ls.setEnabled(false);
                ps.setEnabled(false);
                ld.setEnabled(false);
                sd.setEnabled(false);
                pd.setEnabled(false);
                wygrany = rozgrywka.kto(tablica);
                if (gracz1.getZnak() == wygrany) {
                    gracz1.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                } else if(gracz2.getZnak()==wygrany){
                    gracz2.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }else if(rozgrywka.sprawdzCzyRemis(tablica)){
                    gracz1.remis();
                    gracz2.remis();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }
            }
            if (znakGracza == 'X') {
                znakGracza = 'O';
            } else {
                znakGracza = 'X';
            }
        } else if (zrodlo == pg) {
            pg.setEnabled(false);
            if ((tablica[0][2] != 'X') || (tablica[0][2] != 'O')) {
                tablica[0][2] = znakGracza;
            }
            if (rozgrywka.wygrana(tablica)) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablica[i][j]);
                    }
                    System.out.println();
                }
                s.setEnabled(false);
                lg.setEnabled(false);
                sg.setEnabled(false);
                pg.setEnabled(false);
                ls.setEnabled(false);
                ps.setEnabled(false);
                ld.setEnabled(false);
                sd.setEnabled(false);
                pd.setEnabled(false);
                wygrany = rozgrywka.kto(tablica);
                if (gracz1.getZnak() == wygrany) {
                    gracz1.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                } else if(gracz2.getZnak()==wygrany){
                    gracz2.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }else if(rozgrywka.sprawdzCzyRemis(tablica)){
                    gracz1.remis();
                    gracz2.remis();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }


            }
            pg.setText(String.valueOf(znakGracza));
            if (znakGracza == 'X') {
                znakGracza = 'O';
            } else {
                znakGracza = 'X';
            }
        } else if (zrodlo == ls) {
            ls.setEnabled(false);
            ls.setText(String.valueOf(znakGracza));
            if ((tablica[1][0] != 'X') || (tablica[1][0] != 'O')) {
                tablica[1][0] = znakGracza;
            }
            if (rozgrywka.wygrana(tablica)) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablica[i][j]);
                    }
                    System.out.println();
                }
                s.setEnabled(false);
                lg.setEnabled(false);
                sg.setEnabled(false);
                pg.setEnabled(false);
                ls.setEnabled(false);
                ps.setEnabled(false);
                ld.setEnabled(false);
                sd.setEnabled(false);
                pd.setEnabled(false);
                wygrany = rozgrywka.kto(tablica);
                if (gracz1.getZnak() == wygrany) {
                    gracz1.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                } else if(gracz2.getZnak()==wygrany){
                    gracz2.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }else if(rozgrywka.sprawdzCzyRemis(tablica)){
                    gracz1.remis();
                    gracz2.remis();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }
            }

            if (znakGracza == 'X') {
                znakGracza = 'O';
            } else {
                znakGracza = 'X';
            }
        } else if (zrodlo == ps) {
            ps.setEnabled(false);
            if ((tablica[1][2] != 'X') || (tablica[1][2] != 'O')) {
                tablica[1][2] = znakGracza;
            }
            if (rozgrywka.wygrana(tablica)) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablica[i][j]);
                    }
                    System.out.println();
                }
                s.setEnabled(false);
                lg.setEnabled(false);
                sg.setEnabled(false);
                pg.setEnabled(false);
                ls.setEnabled(false);
                ps.setEnabled(false);
                ld.setEnabled(false);
                sd.setEnabled(false);
                pd.setEnabled(false);
                wygrany = rozgrywka.kto(tablica);
                if (gracz1.getZnak() == wygrany) {
                    gracz1.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                } else if(gracz2.getZnak()==wygrany){
                    gracz2.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }else if(rozgrywka.sprawdzCzyRemis(tablica)){
                    gracz1.remis();
                    gracz2.remis();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }
            }

            ps.setText(String.valueOf(znakGracza));
            if (znakGracza == 'X') {
                znakGracza = 'O';
            } else {
                znakGracza = 'X';
            }
        } else if (zrodlo == ld) {
            ld.setEnabled(false);
            ld.setText(String.valueOf(znakGracza));
            if ((tablica[2][0] != 'X') || (tablica[2][0] != 'O')) {
                tablica[2][0] = znakGracza;
            }
            if (rozgrywka.wygrana(tablica)) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablica[i][j]);
                    }
                    System.out.println();
                }
                s.setEnabled(false);
                lg.setEnabled(false);
                sg.setEnabled(false);
                pg.setEnabled(false);
                ls.setEnabled(false);
                ps.setEnabled(false);
                ld.setEnabled(false);
                sd.setEnabled(false);
                pd.setEnabled(false);
                wygrany = rozgrywka.kto(tablica);
                if (gracz1.getZnak() == wygrany) {
                    gracz1.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                } else if(gracz2.getZnak()==wygrany){
                    gracz2.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }else if(rozgrywka.sprawdzCzyRemis(tablica)){
                    gracz1.remis();
                    gracz2.remis();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }
            }
            if (rozgrywka.sprawdzCzyRemis(tablica)) {
                System.out.println("remis");
            }
            if (znakGracza == 'X') {
                znakGracza = 'O';
            } else {
                znakGracza = 'X';
            }
        } else if (zrodlo == sd) {
            sd.setEnabled(false);
            sd.setText(String.valueOf(znakGracza));
            if ((tablica[2][1] != 'X') || (tablica[2][1] != 'O')) {
                tablica[2][1] = znakGracza;
            }
            if (rozgrywka.wygrana(tablica)) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablica[i][j]);
                    }
                    System.out.println();
                }
                s.setEnabled(false);
                lg.setEnabled(false);
                sg.setEnabled(false);
                pg.setEnabled(false);
                ls.setEnabled(false);
                ps.setEnabled(false);
                ld.setEnabled(false);
                sd.setEnabled(false);
                pd.setEnabled(false);
                wygrany = rozgrywka.kto(tablica);
                if (gracz1.getZnak() == wygrany) {
                    gracz1.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                } else if(gracz2.getZnak() == wygrany){
                    gracz2.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }else if(rozgrywka.sprawdzCzyRemis(tablica)){
                    gracz1.remis();
                    gracz2.remis();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }
            }
            if (rozgrywka.sprawdzCzyRemis(tablica)) {
                System.out.println("remis");
            }
            if (znakGracza == 'X') {
                znakGracza = 'O';
            } else {
                znakGracza = 'X';
            }
        } else if (zrodlo == pd) {
            pd.setEnabled(false);
            pd.setText(String.valueOf(znakGracza));
            if ((tablica[2][2] != 'X') || (tablica[2][2] != 'O')) {
                tablica[2][2] = znakGracza;
            }
            if (rozgrywka.wygrana(tablica)) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablica[i][j]);
                    }
                    System.out.println();
                }
                s.setEnabled(false);
                lg.setEnabled(false);
                sg.setEnabled(false);
                pg.setEnabled(false);
                ls.setEnabled(false);
                ps.setEnabled(false);
                ld.setEnabled(false);
                sd.setEnabled(false);
                pd.setEnabled(false);
                wygrany = rozgrywka.kto(tablica);
                if (gracz1.getZnak() == wygrany) {
                    gracz1.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                } else if(gracz2.getZnak()==wygrany){
                    gracz2.wygrana();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }else if(rozgrywka.sprawdzCzyRemis(tablica)){
                    gracz1.remis();
                    gracz2.remis();
                    aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
                }

            }

            if (znakGracza == 'X') {
                znakGracza = 'O';
            } else {
                znakGracza = 'X';
            }
        }
        if (zrodlo == wyjscie) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablica[i][j]);
                }
                System.out.println();
            }
            dispose();
        } else if (zrodlo == nastepnaGra) {
            tablica = rozgrywka.czyszsczenie(tablica);
            s.setEnabled(true);
            lg.setEnabled(true);
            sg.setEnabled(true);
            pg.setEnabled(true);
            ls.setEnabled(true);
            ps.setEnabled(true);
            ld.setEnabled(true);
            sd.setEnabled(true);
            pd.setEnabled(true);
            s.setText("");
            lg.setText("");
            sg.setText("");
            pg.setText("");
            ls.setText("");
            ps.setText("");
            ld.setText("");
            sd.setText("");
            pd.setText("");
            aktualnyWynik.setText(gracz1.getWynik()+" : "+gracz2.getWynik());
            znakGracza = 'X';
        }
        //kod odpowiedzialny za funkcjonowanie menu gry
        if(zrodlo == mUstawNickGracza1){
            String nazwa = JOptionPane.showInputDialog("Podaj nazwę gracza 1(gracz X):");
            if(nazwa!=null){
                gracz1.setNazwa(nazwa);
            }
            aktualniGracze.setText(gracz1.getNazwa()+" : "+gracz2.getNazwa());
        }else if(zrodlo == mUstawNickGracza2){
            String nazwa = JOptionPane.showInputDialog("Podaj nazwę gracza 2(gracz O):");
            if(nazwa!= null){
                gracz2.setNazwa(nazwa);
            }
            aktualniGracze.setText(gracz1.getNazwa()+" : "+gracz2.getNazwa());
        }

        if(zrodlo == mInformacje){
            JOptionPane.showMessageDialog(null,"Gra w kółko krzyżyk\nGra stworzona żeby przećwiczyć umiejętności programowania w Javie\nAktualna wersja gry:\n1.4","Informacje o grze",JOptionPane.INFORMATION_MESSAGE);

        }
        if(zrodlo == mJakGrac){
            JOptionPane.showMessageDialog(null,"Jak zacząć grać\nPierwszy zawsze rozpoczyna gracz krzyżyk, a dopiero drugi ruch ma gracz kółko\nWynik rozgrywki jest cały czas wyświetlany wraz z nickami\nŻeby wygrać dany gracz musi zapełnić 3 pola swoim znakiem w pionie, poziomie lub po skosie\nTeraz już wiesz wszystko więc życzę powodzenia i myłej gry","Jak grać?",JOptionPane.QUESTION_MESSAGE);
        }
        if(botLatwyKolko.getState()){
            if(znakGracza == 'O'){
                ruch =  bot(tablica,'O');
                pomocX = ruch.getX();
                pomocY = ruch.getY();
                if(pomocX==0){
                    if(pomocY == 0){
                        lg.setText("O");
                        lg.setEnabled(false);
                    }else if(pomocY == 1){
                        sg.setText("O");
                        sg.setEnabled(false);
                    }else if(pomocY == 2){
                        pg.setText("O");
                        pg.setEnabled(false);
                    }
                } else if (pomocX == 1) {
                    if(pomocY == 0){
                        ls.setText("O");
                        ls.setEnabled(false);
                    }else if(pomocY == 1){
                        s.setText("O");
                        s.setEnabled(false);
                    }else if(pomocY == 2){
                        ps.setEnabled(false);
                        ps.setText(")");
                    }
                }else if(pomocX == 2){
                    if(pomocY == 0){
                        ld.setText("O");
                        ld.setEnabled(false);
                    }else if(pomocY == 1){
                        sd.setText("O");
                        sd.setEnabled(false);
                    }else if(pomocY == 2){
                        ps.setEnabled(false);
                        ps.setText("O");
                    }
                }
                znakGracza = 'X';
            }
        }
        if(botlatwyKrzyzyk.getState()){
            if(znakGracza == 'X'){
                ruch = bot(tablica,'X');
                pomocX = ruch.getX();
                pomocY = ruch.getY();
                if(pomocX==0){
                    if(pomocY == 0){
                        lg.setText("X");
                        lg.setEnabled(false);
                    }else if(pomocY == 1){
                        sg.setText("X");
                        sg.setEnabled(false);
                    }else if(pomocY == 2){
                        pg.setText("X");
                        pg.setEnabled(false);
                    }
                } else if (pomocX == 1) {
                    if(pomocY == 0){
                        ls.setText("X");
                        ls.setEnabled(false);
                    }else if(pomocY == 1){
                        s.setText("X");
                        s.setEnabled(false);
                    }else if(pomocY == 2){
                        ps.setEnabled(false);
                        ps.setText("X");
                    }
                }else if(pomocX == 2){
                    if(pomocY == 0){
                        ld.setText("X");
                        ld.setEnabled(false);
                    }else if(pomocY == 1){
                        sd.setText("X");
                        sd.setEnabled(false);
                    }else if(pomocY == 2){
                        ps.setEnabled(false);
                        ps.setText("X");
                    }
                }
                znakGracza = 'O';
            }
        }
    }

    private Ruch bot(char[][]tab, char znak){
        Bot bot = new Bot();
        graczX = false;
        graczY = false;

        return bot.latwy(tab,znak);
    }
}