import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

//<a href="https://www.flaticon.com/free-icons/user" title="user icons">User icons created by Freepik - Flaticon</a>

public class Rejestracja extends JDialog {
    private JPanel JPanelBaza;
    private JLabel iconLabel;
    private JLabel registerLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JLabel emailLabel;
    private JLabel nameLabel;
    private JLabel phoneLabel;
    private JLabel addressLabel;
    private JLabel passwordLabel;
    private JLabel confirmPasswordLabel;
    private JButton registerButton;
    private JButton cancelButton;
    private ImageIcon iconUser = new ImageIcon(getClass().getResource("user.png"));

 /*   public static void main(String[] args) {
        Rejestracja obiekt = new Rejestracja(null);
        obiekt.setVisible(true);
        User user = obiekt.user;
        if(user != null){
            System.out.println("Rejestracja przeszła pomyślnie : " + user.name);

        }else{
            System.out.println("Rejsetracja nie powiodła się");
        }
        obiekt.setVisible(true);
    }
*/
    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight) {
        return new ImageIcon(src.getImage().getScaledInstance(destWidth, destHeight, Image.SCALE_SMOOTH));
    }

    public Rejestracja(JFrame parent) {
        super(parent);
        setTitle("Swtórz konto");
        setContentPane(JPanelBaza);
        int width = 450, height = 475;
        setMinimumSize(new Dimension(width,height));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        iconLabel.setIcon(resize(iconUser, 60, 60));

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });

    }
    private void registerUser(){
        String name = textField1.getText();
        String email = textField2.getText();
        String phone = textField3.getText();
        String addrwss = textField4.getText();
        String password = String.valueOf(passwordField1.getPassword());
        String confirmPassword = String.valueOf(passwordField2.getPassword());

        if(name.isEmpty() || email.isEmpty() || phone.isEmpty()||password.isEmpty() || addrwss.isEmpty()){
            JOptionPane.showMessageDialog(null,"Uzupełnij wszystkie dane","Błąd",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(null,"Hasła nie są takie same","Błąd",JOptionPane.ERROR_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null,"Udało się zarejestować użytkownika","Sukces",JOptionPane.OK_OPTION);

        }
        user = addUserToDatabase(name, email, phone, addrwss,password);
        if(user != null){
            dispose();

        }else{
            JOptionPane.showMessageDialog(this,"Coś poszło nie tak", "Spróbuj ponownie",JOptionPane.ERROR_MESSAGE);
        }
    }
    public User user;
    private User addUserToDatabase(String name, String email, String phone, String addrwss, String password){
        User user = null;
        final String DB_URL="jdbc:mysql://localhost/MyStore?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO users (name,email,phone,address,password) VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,phone);
            preparedStatement.setString(4,addrwss);
            preparedStatement.setString(5,password);

            int addedRows = preparedStatement.executeUpdate();
            if(addedRows>0){
                user = new User();
                user.name = name;
                user.email = email;
                user.phone = phone;
                user.address = addrwss;
                user.password = password;
            }

            stmt.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }


      return user;
    }


}
