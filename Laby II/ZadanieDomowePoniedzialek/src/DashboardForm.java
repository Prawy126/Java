import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;

public class DashboardForm extends JFrame {
    private JPanel JPanelBaza;
    private JPanel JPanel1;
    private JPanel JPanel2;
    private JPanel JPanel3;
    private javax.swing.JLabel JLabel;
    private JLabel iconLabel;
    private JButton registerButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton clearButton;
    private JButton closeButton;
    private javax.swing.JScrollPane JScrollPane1;
    private JTable table1;
    private ImageIcon iconUser = new ImageIcon(getClass().getResource("dashboard.png"));

    //<a href="https://www.flaticon.com/free-icons/dashboard" title="dashboard icons">Dashboard icons created by juicy_fish - Flaticon</a>

    public static void main(String[] args) {
        DashboardForm obiekt = new DashboardForm();
        obiekt.setVisible(true);
    }

    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight) {
        return new ImageIcon(src.getImage().getScaledInstance(destWidth, destHeight, Image.SCALE_SMOOTH));
    }

    public DashboardForm() {
        super("Dashboard");
        //setTitle("Swtórz konto");
        setContentPane(JPanelBaza);
        int width = 800, height = 600;
        setMinimumSize(new Dimension(width,height));
        //setLocationRelativeTo(parent);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iconLabel.setIcon(resize(iconUser, 60, 60));


    }
}
