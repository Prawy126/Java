import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Menu extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menuPlik, menuNarzedzia, menuPomoc, menuOpcje;
    private JMenuItem mOtworz, mZapisz, mWyjscie, mNarz1, mNarz2, mOProgramy, menuOpcja1, menuOpcja2;
    private JCheckBoxMenuItem chOpcja2;
    private JTextArea notatnik;
    public Menu(){
        setTitle("Menu");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        menuBar = new JMenuBar();
        menuPlik = new JMenu("Plik");

        mOtworz = new JMenuItem("Otwórz", 'O');
        mOtworz.addActionListener(this);
        mZapisz = new JMenuItem("Zapisz");
        mZapisz.addActionListener(this);
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

        notatnik = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(notatnik);

        scrollPane.setBounds(50,50,200,200);
        add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if(zrodlo == mOtworz){
            JFileChooser fc = new JFileChooser();
            if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                File plik = fc.getSelectedFile();
                //JOptionPane.showMessageDialog(null,"Wybrany plik to " + plik.getAbsolutePath());
                try {
                    Scanner skanner = new Scanner(plik);
                    while(skanner.hasNext()){
                        notatnik.append(skanner.nextLine()+"\n");
                    }
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }else if(zrodlo == mZapisz){
            JFileChooser fc = new JFileChooser();
            if(fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
                File plik = fc.getSelectedFile();
                //JOptionPane.showMessageDialog(null,"Wybrany plik to " + plik);

                try {
                    PrintWriter pw = new PrintWriter(plik);
                    Scanner skaner = new Scanner(notatnik.getText());
                    while(skaner.hasNext()){
                        pw.println(skaner.nextLine()+"\n");
                    }
                    pw.close();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }


            }
        }
        else if(zrodlo == mWyjscie){
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
