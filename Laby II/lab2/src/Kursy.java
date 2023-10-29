import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kursy extends JFrame{
    private JPanel JPanel2;
    private JLabel JLabel1;
    private JCheckBox cPrice3000PLNCheckBox;
    private JCheckBox cPrice4000PLNCheckBox;
    private JCheckBox javaPrice3500PLNCheckBox;
    private JCheckBox pythonPrice5000PLNCheckBox;
    private JButton okButton;
    private javax.swing.JPanel JPanel;
    private JButton cofnijButton;

    public static void main(String[] args){
        Kursy kursy = new Kursy();
        kursy.setVisible(true);
    }
    public Kursy(){
        super("Kup kurs");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float cena = 0;
                String msg = "";
                if(javaPrice3500PLNCheckBox.isSelected()){
                    cena+=3500;
                    msg+="Java #price 3500,00 PLN\n";
                }
                if(pythonPrice5000PLNCheckBox.isSelected()){
                    cena+=5000;
                    msg+="Python #price 5000,00 PLN\n";
                }
                if(cPrice4000PLNCheckBox.isSelected()){
                    cena+=4000;
                    msg+="C++ #price 4000,00 PLN\n";
                }
                if(cPrice3000PLNCheckBox.isSelected()){
                    cena+=3000;
                    msg+="C# #price 3000,00 PLN\n";
                }
                msg+="=================================\n";
                JOptionPane.showMessageDialog(null,msg+"Razem: "+cena);
            }
        });
        cofnijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ButtonSystem buttonSystem = new ButtonSystem();
                buttonSystem.setVisible(true);
            }
        });
    }
}
