import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password extends JFrame{
    private JPanel panel1;
    private JTextField textUser1;
    private JPasswordField textPassword;
    private JLabel textName;
    private JLabel login;
    private JButton loginButton;
    private JLabel JLabelOutput;
    String user="admin", password = "admin";

    public static void main(String[] args){
        Password password = new Password();
        password.setVisible(true);
    }
    public Password(){
        super("Logowanie");
        this.setContentPane(this.panel1);
        this.setSize(600,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = textName.getText();
                String userPassword = new String(textPassword.getPassword());

                if(userInput.equals(user) && userPassword.equals(password)){
                    JLabelOutput.setText("Zalogowano do systemu...");
                    dispose();
                    ButtonSystem buttonSystem = new ButtonSystem();
                    buttonSystem.setVisible(true);
                }
                else{
                    JLabelOutput.setText("Podano błędne dane ... spróbuj ponownie ...");
                    textUser1.setText("");
                    textPassword.setText("");
                }
            }
        });

    }

}
