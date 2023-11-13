import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

//<a href="https://www.flaticon.com/free-icons/user" title="user icons">User icons created by kmg design - Flaticon</a>


public class Logowanie extends JDialog {
    private JPanel JPanelBaza;
    private JPanel JPanel1;
    private JPanel JPanel2;
    private JLabel welcomeToTheLabel;
    private JLabel loginFormLabel;
    private JLabel iconLabel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel passwordLabel;
    private JLabel emailLabel;
    private JButton okButton;
    private JButton cancelButton;
    private ImageIcon iconUser = new ImageIcon(getClass().getResource("user2.png"));

 /*   public static void main(String[] args) {
        Logowanie obiekt = new Logowanie(null);
        obiekt.setVisible(true);
        //User user = obiekt.user;
        User user = new User();
        if(user != null){
            System.out.println("Sukces" + user.name);
            System.out.println("Email: " + user.email);
            System.out.println("Phone: " + user.phone);
            System.out.println("Address: " + user.address);
        }
    }
*/
    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight) {
        return new ImageIcon(src.getImage().getScaledInstance(destWidth, destHeight, Image.SCALE_SMOOTH));
    }

    public Logowanie(JFrame parent) {
        super(parent);
        setTitle("Swtórz konto");
        setContentPane(JPanelBaza);
        int width = 450, height = 475;
        setMinimumSize(new Dimension(width,height));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        iconLabel.setIcon(resize(iconUser, 60, 60));

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = textField1.getText();
                String password = String.valueOf(passwordField1.getPassword());
                User user = new User();
                user = getAutenticateUser(email,password);

                if(user != null){
                    dispose();
                    DashboardForm dashboardForm = new DashboardForm();
                    dashboardForm.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Email lub hasło są nie poprawne", "Spróbuj ponownie", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

    }
    private User getAutenticateUser(String email, String password){
        User user= null;

        final String DB_URL="jdbc:mysql://localhost/MyStore?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FORM users WHERE email=? AND password=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                user = new User();
                user.name = resultSet.getString("name");
                user.email = resultSet.getString("email");
                user.phone = resultSet.getString("phone");
                user.address = resultSet.getString("address");
                user.password = resultSet.getString("passowrd");
            }

            stmt.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return user;
    }
}
