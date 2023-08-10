import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menuPlik, menuNarzedzia, menuPomoc, menuOpcje;
    private JMenuItem mOtworz, mZapisz, mWyjscie, mNarz1, mNarz2, mOProgramy, menuOpcja1, menuOpcja2;
    private JCheckBoxMenuItem chOpcja2;
    public Menu(){
        setTitle("Menu");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        menuBar = new JMenuBar();
        menuPlik = new JMenu("Plik");

        mOtworz = new JMenuItem("Otwórz", 'O');
        mZapisz = new JMenuItem("Zapisz");
        mWyjscie = new JMenuItem("Wyjście");
        menuPlik.add(mOtworz);
        menuPlik.add(mZapisz);
        menuPlik.addSeparator();
        menuPlik.add(mWyjscie);

        mWyjscie.addActionListener(this);
        mWyjscie.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));

        menuNarzedzia = new JMenu("Narzędzia");
        mNarz1 = new JMenuItem("Narzędzia1");
        mNarz2 = new JMenuItem("Narzędzia2");
        mNarz2.addActionListener(this);
        menuNarzedzia.add(mNarz1);
        mNarz1.setEnabled(false);
        menuNarzedzia.add(mNarz2);

            menuOpcje = new JMenu("Opcje");
            menuOpcja1 = new JMenuItem("Opcja1");
            chOpcja2 = new JCheckBoxMenuItem("Opcja2");
            chOpcja2.addActionListener(this);
            menuOpcje.add(menuOpcja1);
            menuOpcje.add(chOpcja2);
        menuNarzedzia.add(menuOpcje);


        menuPomoc = new JMenu("Pomoc");
        mOProgramy = new JMenuItem("O Programie");
        menuPomoc.add(mOProgramy);
        mOProgramy.addActionListener(this);

        setJMenuBar(menuBar);
        menuBar.add(menuPlik);
        menuBar.add(menuNarzedzia);
        menuBar.add(menuPomoc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if(zrodlo == mWyjscie){
            int odp = JOptionPane.showConfirmDialog(null,"Czy na pewno wyjść?","Pytanie",JOptionPane.YES_NO_OPTION);
            if(odp == JOptionPane.YES_OPTION){
                dispose();
            }else if(odp == JOptionPane.CLOSED_OPTION){
                JOptionPane.showMessageDialog(null,"Tak nie robimy","Tytuł",JOptionPane.WARNING_MESSAGE);
            }

        }
        if(zrodlo == chOpcja2){
            if(chOpcja2.isSelected()){
                mNarz1.setEnabled(true);
            }else if(!chOpcja2.isSelected()){
                mNarz1.setEnabled(false);
            }
        }
        if(zrodlo == mNarz2){
            String sMetry = JOptionPane.showInputDialog("Podaj długość w metrach");
            double metry = Double.parseDouble(sMetry);
            double stopy = metry/0.3048;
            String sStopy = String.format("%.2f",stopy);
            JOptionPane.showMessageDialog(null,metry + " metrów = " + sStopy + " stóp");
        }
        if(zrodlo == mOProgramy){
            JOptionPane.showMessageDialog(null,"Program demonstruje wykorzystanie JMenuBar i JMenu\n Wersja 1.0","Tytuł",JOptionPane.QUESTION_MESSAGE);
        }
    }
}
