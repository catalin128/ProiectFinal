import javax.swing.*;
import java.awt.*;
public class MainWindow extends JFrame {

    private JPanel panouPrincipal;
    private JButton btnJocuri;
    private JButton btnClienti;
    private JButton btnMagazin;
    private JLabel labelPrincipal;
    private JLabel labelBackground=new JLabel();

    public MainWindow()
    {
        panouPrincipal.setOpaque(false);
       // panouPrincipal.setLayout(new FlowLayout());
        labelBackground.setLayout(new FlowLayout());
        labelBackground.setIcon(new ImageIcon("C:\\Users\\Asus TUF\\Desktop\\POO\\ProiectFinal-main\\src\\fundal1.jpg"));
        labelBackground.setLayout(new BorderLayout());
        labelBackground.add(panouPrincipal);
        add(labelBackground);

    }

    public static void main(String[] args) {
        JFrame frame=new MainWindow();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        //frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}