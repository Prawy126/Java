import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grafika extends JFrame implements ActionListener{
    final private JButton lg, sg, pg, ls,s,ps,ld,sd,pd , wyjscie, nastepnaGra;
    final private int x = 10,y = 10,szerokosc = 50,wysokosc = 50;
    public char tablica[][] = new char[3][3];
    private char znakGracza = 'X';
    private Rozgrywka rozgrywka = new Rozgrywka();
    private Gracz gracz1 = new Gracz("Gacz1",'X'),gracz2 = new Gracz("Gracz2",'O');
    private char wygrany;
    public Grafika(){
        setLayout(null);
        lg = new JButton("");
        lg.setBounds(x,y,szerokosc, wysokosc);
        lg.addActionListener(this);
        add(lg);
        sg = new JButton("");
        sg.setBounds(x+50,y,szerokosc,wysokosc);
        sg.addActionListener(this);
        add(sg);
        pg = new JButton("");
        pg.setBounds(x+100,y,szerokosc,wysokosc);
        pg.addActionListener(this);
        add(pg);
        ls = new JButton("");
        ls.setBounds(x,y+50,szerokosc,wysokosc);
        ls.addActionListener(this);
        add(ls);
        s = new JButton("");
        s.setBounds(x+50,y+50,szerokosc,wysokosc);
        s.addActionListener(this);
        add(s);
        ps = new JButton("");
        ps.setBounds(x+100,y+50,szerokosc,wysokosc);
        ps.addActionListener(this);
        add(ps);
        ld = new JButton("");
        ld.setBounds(x,y+100,szerokosc,wysokosc);
        ld.addActionListener(this);
        add(ld);
        sd = new JButton("");
        sd.setBounds(x+50,y+100,szerokosc,wysokosc);
        sd.addActionListener(this);
        add(sd);
        pd = new JButton("");
        pd.setBounds(x+100,y+100,szerokosc,wysokosc);
        pd.addActionListener(this);
        add(pd);
        wyjscie = new JButton("Wyjscie");
        wyjscie.setBounds(x+200,y+200,szerokosc+100,wysokosc);
        wyjscie.addActionListener(this);
        add(wyjscie);
        nastepnaGra = new JButton("Następna Gra");
        nastepnaGra.setBounds(x+200,y+300,szerokosc+200,wysokosc);
        nastepnaGra.addActionListener(this);
        add(nastepnaGra);
        wyjscie.setBackground(Color.RED);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if(zrodlo == s){
            s.setEnabled(false);
            s.setText(String.valueOf(znakGracza));
            if((tablica[1][1]!='X')||(tablica[1][1]!='O')){
                tablica[1][1] = znakGracza;
            }
            if(rozgrywka.wygrana(tablica)){
                for(int i = 0; i < 3;i++){
                    for(int j = 0; j < 3; j++){
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
                if(gracz1.getZnak() == wygrany){
                    gracz1.wygrana();
                }else {
                    gracz2.wygrana();
                }
            }
            if(znakGracza == 'X'){
                znakGracza = 'O';
            }else {
                znakGracza = 'X';
            }
        }else if(zrodlo == lg){
            lg.setEnabled(false);
            lg.setText(String.valueOf(znakGracza));
            if((tablica[0][0]!='X')||(tablica[0][0]!='O')){
                tablica[0][0] = znakGracza;
            }
            if(rozgrywka.wygrana(tablica)){
                for(int i = 0; i < 3;i++){
                    for(int j = 0; j < 3; j++){
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
                if(gracz1.getZnak() == wygrany){
                    gracz1.wygrana();
                }else {
                    gracz2.wygrana();
                }
            }
            if(znakGracza == 'X'){
                znakGracza = 'O';
            }else {
                znakGracza = 'X';
            }
        }else if(zrodlo == sg){
            sg.setEnabled(false);
            sg.setText(String.valueOf(znakGracza));
            if((tablica[0][1]!='X')||(tablica[0][1]!='O')){
                tablica[0][1] = znakGracza;
            }
            if(rozgrywka.wygrana(tablica)){
                for(int i = 0; i < 3;i++){
                    for(int j = 0; j < 3; j++){
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
                if(gracz1.getZnak() == wygrany){
                    gracz1.wygrana();
                }else {
                    gracz2.wygrana();
                }
            }
            if(znakGracza == 'X'){
                znakGracza = 'O';
            }else {
                znakGracza = 'X';
            }
        }else if(zrodlo == pg){
            pg.setEnabled(false);
            if((tablica[0][2]!='X')||(tablica[0][2]!='O')){
                tablica[0][2] = znakGracza;
            }
            if(rozgrywka.wygrana(tablica)){
                for(int i = 0; i < 3;i++){
                    for(int j = 0; j < 3; j++){
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
                if(gracz1.getZnak() == wygrany){
                    gracz1.wygrana();
                }else {
                    gracz2.wygrana();
                }

                System.out.println(gracz1.getWynik()+" : "+gracz2.getWynik());
            }
            if(rozgrywka.sprawdzCzyRemis(tablica))
            {
                System.out.println("remis");
            }
            pg.setText(String.valueOf(znakGracza));
            if(znakGracza == 'X'){
                znakGracza = 'O';
            }else {
                znakGracza = 'X';
            }
        }else if(zrodlo == ls){
            ls.setEnabled(false);
            ls.setText(String.valueOf(znakGracza));
            if((tablica[1][0]!='X')||(tablica[1][0]!='O')){
                tablica[1][0] = znakGracza;
            }
            if(rozgrywka.wygrana(tablica)){
                for(int i = 0; i < 3;i++){
                    for(int j = 0; j < 3; j++){
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
                if(gracz1.getZnak() == wygrany){
                    gracz1.wygrana();
                }else {
                    gracz2.wygrana();
                }
            }
            if(rozgrywka.sprawdzCzyRemis(tablica))
            {
                System.out.println("remis");
            }
            if(znakGracza == 'X'){
                znakGracza = 'O';
            }else {
                znakGracza = 'X';
            }
        }else if(zrodlo == ps){
            ps.setEnabled(false);
            if((tablica[1][2]!='X')||(tablica[1][2]!='O')){
                tablica[1][2] = znakGracza;
            }
            if(rozgrywka.wygrana(tablica)){
                for(int i = 0; i < 3;i++){
                    for(int j = 0; j < 3; j++){
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
                if(gracz1.getZnak() == wygrany){
                    gracz1.wygrana();
                }else {
                    gracz2.wygrana();
                }
            }
            if(rozgrywka.sprawdzCzyRemis(tablica))
            {
                System.out.println("remis");
            }
            ps.setText(String.valueOf(znakGracza));
            if(znakGracza == 'X'){
                znakGracza = 'O';
            }else {
                znakGracza = 'X';
            }
        }else if(zrodlo == ld){
            ld.setEnabled(false);
            ld.setText(String.valueOf(znakGracza));
            if((tablica[2][0]!='X')||(tablica[2][0]!='O')){
                tablica[2][0] = znakGracza;
            }
            if(rozgrywka.wygrana(tablica)){
                for(int i = 0; i < 3;i++){
                    for(int j = 0; j < 3; j++){
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
                if(gracz1.getZnak() == wygrany){
                    gracz1.wygrana();
                }else {
                    gracz2.wygrana();
                }
            }
            if(rozgrywka.sprawdzCzyRemis(tablica))
            {
                System.out.println("remis");
            }
            if(znakGracza == 'X'){
                znakGracza = 'O';
            }else {
                znakGracza = 'X';
            }
        }else if(zrodlo == sd){
            sd.setEnabled(false);
            sd.setText(String.valueOf(znakGracza));
            if((tablica[2][1]!='X')||(tablica[2][1]!='O')){
                tablica[2][1] = znakGracza;
            }
            if(rozgrywka.wygrana(tablica)){
                for(int i = 0; i < 3;i++){
                    for(int j = 0; j < 3; j++){
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
                if(gracz1.getZnak() == wygrany){
                    gracz1.wygrana();
                }else {
                    gracz2.wygrana();
                }
            }
            if(rozgrywka.sprawdzCzyRemis(tablica))
            {
                System.out.println("remis");
            }
            if(znakGracza == 'X'){
                znakGracza = 'O';
            }else {
                znakGracza = 'X';
            }
        }else if(zrodlo == pd){
            pd.setEnabled(false);
            pd.setText(String.valueOf(znakGracza));
            if((tablica[2][2]!='X')||(tablica[2][2]!='O')){
                tablica[2][2] = znakGracza;
            }
            if(rozgrywka.wygrana(tablica)){
                for(int i = 0; i < 3;i++){
                    for(int j = 0; j < 3; j++){
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
                if(gracz1.getZnak() == wygrany){
                    gracz1.wygrana();
                }else {
                    gracz2.wygrana();
                }

            }
            if(rozgrywka.sprawdzCzyRemis(tablica))
            {
                System.out.println("remis");
            }
            if(znakGracza == 'X'){
                znakGracza = 'O';
            }else {
                znakGracza = 'X';
            }
        }
        if(zrodlo == wyjscie){
            for(int i = 0; i < 3;i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(tablica[i][j]);
                }
                System.out.println();
            }
            dispose();
        }else if(zrodlo == nastepnaGra){
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
        }
    }
}
