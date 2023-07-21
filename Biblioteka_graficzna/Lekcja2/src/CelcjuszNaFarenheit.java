import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelcjuszNaFarenheit extends JFrame implements ActionListener {
    private JLabel lCelsjusz, lFahrenheit;
    private JTextField tCelsjusz, tFahrenheit;
    private JButton bKonwertuj, bWyjscie;
    private JCheckBox chWielkie;
    private JRadioButton rbCtoF, rbFtoC;
    private ButtonGroup bgRozmiar, radioPanel;
    //private JRadioButton rbMaly, rbSredni, rbDuzy;
    private double tempCelsius, temFarenheit;

    public CelcjuszNaFarenheit() {

        setSize(400, 250);
        setTitle("Przeliczanie stopni celcjusza");
        setLayout(null);

        lCelsjusz = new JLabel("Stopnie Celsjusza: ");
        lCelsjusz.setBounds(20, 20, 150, 20);
        add(lCelsjusz);

        tCelsjusz = new JTextField("");
        tCelsjusz.setBounds(170, 20, 150, 20);
        tCelsjusz.addActionListener(this);
        add(tCelsjusz);
        tCelsjusz.setToolTipText("Podaj temperturę w stopniach Celsjusza");

        lFahrenheit = new JLabel("Stopnie Fahrenheit: ");
        lFahrenheit.setBounds(20, 50, 150, 20);
        add(lFahrenheit);


        tFahrenheit = new JTextField("");
        tFahrenheit.setBounds(170, 50, 150, 20);
        tFahrenheit.setToolTipText("Temperatura w Fahrenheit");
        tFahrenheit.addActionListener(this);
        add(tFahrenheit);

        bKonwertuj = new JButton("Przelicz");
        bKonwertuj.setBounds(120, 80, 80, 40);
        add(bKonwertuj);


        bWyjscie = new JButton("Wyjście");
        bWyjscie.setBounds(210, 80, 80, 40);
        add(bWyjscie);
        bWyjscie.addActionListener(this);
        bKonwertuj.addActionListener(this);

        chWielkie = new JCheckBox("Wielkie litery");
        chWielkie.setBounds(250, 120, 150, 20);
        add(chWielkie);
        chWielkie.addActionListener(this);
        bgRozmiar = new ButtonGroup();

        /*rbMaly = new JRadioButton("Mały", true);
        rbMaly.setBounds(50,150,100,20);
        bgRozmiar.add(rbMaly);
        add(rbMaly);
        rbMaly.addActionListener(this);

        rbSredni = new JRadioButton("Średni",false);
        rbSredni.setBounds(150,150,100,20);
        bgRozmiar.add(rbSredni);
        add(rbSredni);
        rbSredni.addActionListener(this);

        rbDuzy = new JRadioButton("Duży", false);
        rbDuzy.setBounds(250,150,100,20);
        bgRozmiar.add(rbDuzy);
        add(rbDuzy);
        rbDuzy.addActionListener(this);*/

        radioPanel = new ButtonGroup();
        rbFtoC = new JRadioButton("Fahrenheit na Celsiusz");
        rbFtoC.setBounds(50,150,150,20);
        radioPanel.add(rbFtoC);
        add(rbFtoC);
        rbCtoF = new JRadioButton("Ceslsiusz na Fahrenheit");
        rbCtoF.setBounds(200,150,150,20);
        rbCtoF.setSelected(true);
        radioPanel.add(rbCtoF);
        add(rbCtoF);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if (zrodlo == bWyjscie) {
            dispose();
        } else if (zrodlo == bKonwertuj) {

            if(rbCtoF.isSelected()){
                tempCelsius = Double.parseDouble(tCelsjusz.getText());
                temFarenheit = 32.0 + (9.0 / 5.0) * tempCelsius;
                tFahrenheit.setText(String.valueOf(temFarenheit));
            }else if(rbCtoF.isSelected()){
                temFarenheit = Double.parseDouble(tFahrenheit.getText());
                tempCelsius=(temFarenheit-32)*(5.0/9.0);
                tCelsjusz.setText(String.valueOf(tempCelsius));
            }



        } else if (zrodlo == chWielkie) {
            if (true == chWielkie.isSelected()) {
                tFahrenheit.setFont(new Font("SansSerif", Font.BOLD, 18));
            } else {
                tFahrenheit.setFont(new Font("SansSerif", Font.BOLD, 12));
            }
        }/*else if(zrodlo == rbMaly){
            tFahrenheit.setFont(new Font("SansSerif",Font.PLAIN,12));
        }else if(zrodlo == rbSredni){
            tFahrenheit.setFont(new Font("SansSerif",Font.PLAIN,16));
        }else if(zrodlo == rbDuzy){
            tFahrenheit.setFont(new Font("SansSerif",Font.PLAIN,20));
        }*/
        if(zrodlo == tCelsjusz){
            tempCelsius = Double.parseDouble(tCelsjusz.getText());
            temFarenheit = 32.0 + (9.0 / 5.0) * tempCelsius;
            tFahrenheit.setText(String.valueOf(temFarenheit));

        }else if(zrodlo == tFahrenheit){
            temFarenheit = Double.parseDouble(tFahrenheit.getText());
            tempCelsius=(temFarenheit-32)*(5.0/9.0);
            tCelsjusz.setText(String.valueOf(tempCelsius));

        }
    }
}
