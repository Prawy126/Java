import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MojeOkienko extends JFrame implements ActionListener {
JButton bPodajDate, bWyjscie;
    public MojeOkienko(){
        setSize(300,200);
        setTitle("Moje pierwsze okienko");
        bPodajDate = new JButton("Podaj datę");
        setLayout(null);
        bPodajDate.setBounds(50,50,100,20);
        add(bPodajDate);
        bPodajDate.addActionListener(this);
        bWyjscie = new JButton("Wyjście");
        bWyjscie.setBounds(150,50,100,20);
        add(bWyjscie);
        bWyjscie.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if(zrodlo == bPodajDate){
            System.out.println(new Date());
        }else if(zrodlo == bWyjscie){
            dispose();
        }

    }
}
