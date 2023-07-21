import javax.swing.*;
import java.util.jar.JarEntry;

public class RownianieGUI extends JFrame {
    private JTextField tA, tB, tC, tWynik;
    private JLabel lA, lB, lC;
    private JButton bWyjscie, bRozwiaz;
    public RownianieGUI(){
        setSize(400,400);
        setTitle("Rozwiązanie równania kwadratowego");
        setLayout(null);

        tA = new JTextField();
        tA.setBounds(50,60,50,20);
        add(tA);
        lA = new JLabel("A",JLabel.RIGHT);
        lA.setBounds(10,60,30,20);
        add(lA);
        tA.setToolTipText("Podaj wpółczynnik a");

        tB = new JTextField();
        tB.setBounds(50,80,50,20);
        add(tB);
        lB = new JLabel("B",JLabel.RIGHT);
        lB.setBounds(10,80,30,20);
        add(lB);
        tB.setToolTipText("Podaj wpółczynnik b");

        tC = new JTextField();
        tC.setBounds(50,100,50,20);
        add(tC);
        lC = new JLabel("C",JLabel.RIGHT);
        lC.setBounds(10,100,30,20);
        add(lC);
        tC.setToolTipText("Podaj wpółczynnik c");
    }
}
