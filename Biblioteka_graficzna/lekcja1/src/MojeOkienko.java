import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MojeOkienko extends JFrame implements ActionListener {

    public MojeOkienko(){
        setSize(300,200);
        setTitle("Moje pierwsze okienko");
        JButton button = new JButton("Podaj datę");
        setLayout(null);
        button.setBounds(50,50,100,20);
        add(button);
        button.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(new Date());
    }
}
