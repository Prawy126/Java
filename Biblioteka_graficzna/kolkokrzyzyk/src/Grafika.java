import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grafika extends JFrame implements ActionListener{
    final private JButton lg, sg, pg, ls,s,ps,ld,sd,pd , wyjscie;
    final private int x = 10,y = 10,szerokosc = 50,wysokosc = 50;
    private char tablica[][] = new char[3][3];
    private char znakGracza = 'X';
    public Grafika(){
        setLayout(null);
        lg = new JButton("lg");
        lg.setBounds(x,y,szerokosc, wysokosc);
        lg.addActionListener(this);
        add(lg);
        sg = new JButton("sg");
        sg.setBounds(x+50,y,szerokosc,wysokosc);
        sg.addActionListener(this);
        add(sg);
        pg = new JButton("pg");
        pg.setBounds(x+100,y,szerokosc,wysokosc);
        pg.addActionListener(this);
        add(pg);
        ls = new JButton("ls");
        ls.setBounds(x,y+50,szerokosc,wysokosc);
        ls.addActionListener(this);
        add(ls);
        s = new JButton("s");
        s.setBounds(x+50,y+50,szerokosc,wysokosc);
        s.addActionListener(this);
        add(s);
        ps = new JButton("ps");
        ps.setBounds(x+100,y+50,szerokosc,wysokosc);
        ps.addActionListener(this);
        add(ps);
        ld = new JButton("ld");
        ld.setBounds(x,y+100,szerokosc,wysokosc);
        ld.addActionListener(this);
        add(ld);
        sd = new JButton("sd");
        sd.setBounds(x+50,y+100,szerokosc,wysokosc);
        sd.addActionListener(this);
        add(sd);
        pd = new JButton("pd");
        pd.setBounds(x+100,y+100,szerokosc,wysokosc);
        pd.addActionListener(this);
        add(pd);
        wyjscie = new JButton("Wyjscie");
        wyjscie.setBounds(x+200,y+200,szerokosc,wysokosc);
        wyjscie.addActionListener(this);
        add(wyjscie);

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
            if(znakGracza == 'X'){
                znakGracza = 'O';
            }else {
                znakGracza = 'X';
            }
        }
        /*if(zrodlo == wyjscie){
            for(int i = 0; i < 3;i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(tablica[i][j]);
                }
                System.out.println();
            }
            dispose();
        }*/
    }
}
