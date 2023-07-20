import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelcjuszNaFarenheit extends JFrame implements ActionListener {
    private JLabel lCelsjusz, lFahrenheit;
    private JTextField tCelsjusz, tFahrenheit;
    private JButton bKonwertuj, bWyjscie;
    private JCheckBox chWielkie;
    private double tempCelsius, temFarenheit;
    public CelcjuszNaFarenheit(){

        setSize(400,200);
        setTitle("Przeliczanie stopni celcjusza");
        setLayout(null);

        lCelsjusz = new JLabel("Stopnie Celsjusza: ");
        lCelsjusz.setBounds(20,20,150,20);
        add(lCelsjusz);

        tCelsjusz = new JTextField("");
        tCelsjusz.setBounds(170,20,150,20);
        tCelsjusz.addActionListener(this);
        add(tCelsjusz);

        lFahrenheit = new JLabel("Stopnie Fahrenheit: ");
        lFahrenheit.setBounds(20,50,150,20);
        add(lFahrenheit);

        tFahrenheit = new JTextField("");
        tFahrenheit.setBounds(170,50,150,20);

        add(tFahrenheit);

        bKonwertuj = new JButton("Przelicz");
        bKonwertuj.setBounds(120,80,80,40);
        add(bKonwertuj);

        bWyjscie = new JButton("Wyjście");
        bWyjscie.setBounds(210,80,80,40);
        add(bWyjscie);
        bWyjscie.addActionListener(this);
        bKonwertuj.addActionListener(this);

        chWielkie = new JCheckBox("Wielkie litery");
        chWielkie.setBounds(250,120,150,20);
        add(chWielkie);
        chWielkie.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if (zrodlo == bWyjscie) {
            dispose();
        } else if (zrodlo == bKonwertuj || zrodlo == tCelsjusz) {
            tempCelsius = Double.parseDouble(tCelsjusz.getText());
            temFarenheit = 32.0 + (9.0 / 5.0) * tempCelsius;
            tFahrenheit.setText(String.valueOf(temFarenheit));

        }else if(zrodlo == chWielkie){
            if(true == chWielkie.isSelected()){
                tFahrenheit.setFont(new Font("SansSerif",Font.BOLD,18));
            }else {
                tFahrenheit.setFont(new Font("SansSerif",Font.BOLD,12));
            }
        }
    }
}
