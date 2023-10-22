package Zadanie2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame{
    private JPanel wyswietlacz;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JLabel a;
    private JLabel B;
    private JLabel wynik;
    private JLabel wynikWartosc;
    private JButton plus;
    private JButton minus;
    private JButton mnozenie;
    private JButton dzielenie;
    private JButton kiloMetryNaMileButton;
    private JButton mileNaKiloMetryButton;
    double liczbaA, liczbaB, wynikD;
    String pomoc;

    public static void main(String[] args){
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setVisible(true);
    }
    public Kalkulator(){
        super("Kalkulator");
        this.setContentPane(this.wyswietlacz);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczbaA = Double.valueOf(textFieldA.getText());
                liczbaB = Double.valueOf(textFieldB.getText());
                wynikD = liczbaA + liczbaB;
                wynik.setText(String.valueOf(wynikD));
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczbaA = Double.valueOf(textFieldA.getText());
                liczbaB = Double.valueOf(textFieldB.getText());
                wynikD = liczbaA - liczbaB;
                wynik.setText(String.valueOf(wynikD));
            }
        });
        mnozenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczbaA = Double.valueOf(textFieldA.getText());
                liczbaB = Double.valueOf(textFieldB.getText());
                wynikD = liczbaA * liczbaB;
                wynik.setText(String.valueOf(wynikD));
            }
        });
        dzielenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczbaA = Double.valueOf(textFieldA.getText());
                liczbaB = Double.valueOf(textFieldB.getText());

                    wynikD = liczbaA / liczbaB;

                    wynik.setText(String.valueOf(wynikD));


            }
        });
        kiloMetryNaMileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pomoc = JOptionPane.showInputDialog("Podaj wartość w kilometrach");
                liczbaA = Double.valueOf(pomoc);
                wynikD = liczbaA/1.609344;
                JOptionPane.showMessageDialog(null,liczbaA+"km to " + wynikD + "mill");
            }
        });
        mileNaKiloMetryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pomoc = JOptionPane.showInputDialog("Podaj wartość w milach");
                liczbaA = Double.valueOf(pomoc);
                wynikD = liczbaA*1.609344;
                JOptionPane.showMessageDialog(null,liczbaA+"mill to " + wynikD + "km");
            }
        });
    }
}
