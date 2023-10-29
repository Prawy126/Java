import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSystem extends JFrame{
    private JPanel JPanel1;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macRadioButton;
    private JLabel JLabelRysunek;
    private JButton okButton;
    private JButton cofnijButton;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("Tuxflat.svg.png"));
    private ImageIcon iconWindows = new ImageIcon(getClass().getResource("Icon-windows_os.svg.png"));
    private ImageIcon iconMac = new ImageIcon(getClass().getResource("Finder_icon_macOS_Big_Sur.png"));

    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight){
            return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }

    public static void main(String[] args){
        ButtonSystem buttonSystem = new ButtonSystem();
        buttonSystem.setVisible(true);
    }
    public ButtonSystem(){
        super("Tytuł");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectOption = "";
                if(linuxRadioButton.isSelected()){
                    selectOption="Linux";
                }if(windowsRadioButton.isSelected()){
                    selectOption="Windows";
                }if(macRadioButton.isSelected()){
                    selectOption="Mac";
                }

                JOptionPane.showMessageDialog(ButtonSystem.this,"wybrano systyem: " + selectOption);
                dispose();
                Kursy kursy = new Kursy();
                kursy.setVisible(true);
            }
        });
        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(linuxRadioButton.isSelected()){
                    JLabelRysunek.setIcon(resize(iconLinux,120,120));
                }
            }
        });
        macRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(macRadioButton.isSelected()){
                    JLabelRysunek.setIcon(resize(iconMac,120,120));
                }
            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(windowsRadioButton.isSelected()){
                    JLabelRysunek.setIcon(resize(iconWindows,120,120));
                }
            }
        });
        cofnijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Logowanie logowanie = new Logowanie();
                logowanie.setVisible(true);
            }
        });
    }
}
