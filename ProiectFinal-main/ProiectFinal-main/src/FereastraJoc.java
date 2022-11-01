import javax.swing.*;
import java.awt.*;

public class FereastraJoc extends JFrame{
    private JPanel panouJoc;
    private JLabel label = new JLabel();
    public FereastraJoc(){
        panouJoc.setOpaque(false);
        // panouPrincipal.setLayout(new FlowLayout());
        label.setLayout(new FlowLayout());
        label.setIcon(new ImageIcon("C:\\Users\\Asus TUF\\Desktop\\POO\\ProiectFinal-main\\src\\fundal1.jpg"));
        label.setLayout(new BorderLayout());
        label.add(panouJoc);
        add(label);
    }

}
