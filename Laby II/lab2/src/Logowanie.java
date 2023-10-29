import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logowanie extends JFrame{
    private JButton zaloguj;
    private JLabel Login;
    private JLabel Pasword;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel Wyswietlacz;
    String login = "admin", password = "admin";

    public static void main(String[] args){
        Logowanie logowanie = new Logowanie();
        logowanie.setVisible(true);
    }
    public Logowanie(){
        super("Logowanie");
        this.setContentPane(this.Wyswietlacz);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);

        zaloguj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pomoc1 = textField1.getText(), pomoc2 = passwordField1.getText();
                if(pomoc1.equals(login) && pomoc2.equals(password)){
                    JOptionPane.showMessageDialog(null,"Udało ci się zalogować","Pomyślne logowanie",JOptionPane.INFORMATION_MESSAGE);
                    ButtonSystem buttonSystem = new ButtonSystem();
                    dispose();
                    buttonSystem.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Nie udało się zalogować","Błąd",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }
}
