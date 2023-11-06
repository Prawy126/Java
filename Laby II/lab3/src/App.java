import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class App extends JFrame{
    private JPanel wyswietlacz;
    private JList list1;
    private JLabel tytul;
    private JLabel imie;
    private JTextField tImie;
    private JLabel emil;
    private JTextField tEmail;
    private JTextField tData;
    private JTextField tNumer;
    private JTextField tAdres;
    private JLabel data;
    private JLabel adres;
    private JLabel lNumer;
    private JButton zapiszNowegoUżytkownikaButton;
    private JButton nadpiszUżytkownikaButton;
    private JLabel wiek;
    private JLabel wiekLiczba;

    public static void main(String[] args){
        App app = new App();
        app.setVisible(true);
    }

    public App(){
        super("App");
        this.setContentPane(this.wyswietlacz);
        this.setSize(500,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        zapiszNowegoUżytkownikaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        list1.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                
            }

            @Override
            public void componentMoved(ComponentEvent e) {

            }

            @Override
            public void componentShown(ComponentEvent e) {

            }

            @Override
            public void componentHidden(ComponentEvent e) {

            }
        });
    }
}
