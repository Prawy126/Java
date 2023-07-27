import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menuPlik, menuNarzedzia, menuPomoc, menuOpcje;
    private JMenuItem mOtworz, mZapisz, mWyjscie, mNarz1, mNarz2, mOProgramy, menuOpcja1, menuOpcja2;
    public Menu(){
        setTitle("Menu");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        menuBar = new JMenuBar();
        menuPlik = new JMenu("Plik");

        mOtworz = new JMenuItem("Otwórz");
        mZapisz = new JMenuItem("Zapisz");
        mWyjscie = new JMenuItem("Wyjście");
        menuPlik.add(mOtworz);
        menuPlik.add(mZapisz);
        menuPlik.addSeparator();
        menuPlik.add(mWyjscie);

        menuNarzedzia = new JMenu("Narzędzia");
        mNarz1 = new JMenuItem("Narzędzia1");
        mNarz2 = new JMenuItem("Narzędzia2");
        menuNarzedzia.add(mNarz1);
        menuNarzedzia.add(mNarz2);

            menuOpcje = new JMenu("Opcje");
            menuOpcja1 = new JMenuItem("Opcja1");
            menuOpcja2 = new JMenuItem("Opcja2");

            menuOpcje.add(menuOpcja1);
            menuOpcje.add(menuOpcja2);
        menuNarzedzia.add(menuOpcje);


        menuPomoc = new JMenu("Pomoc");
        mOProgramy = new JMenuItem("O Programie");
        menuPomoc.add(mOProgramy);

        setJMenuBar(menuBar);
        menuBar.add(menuPlik);
        menuBar.add(menuNarzedzia);
        menuBar.add(menuPomoc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}