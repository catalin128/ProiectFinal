import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private JPanel panouPrincipal;
    private JButton btnJocuri;
    private JButton btnClienti;
    private JButton btnMagazin;
    private JLabel labelPrincipal;
    private JLabel labelBackground=new JLabel();
    private JFrame frame_joc;

    public MainWindow()
    {
        panouPrincipal.setOpaque(false);
       // panouPrincipal.setLayout(new FlowLayout());
        labelBackground.setLayout(new FlowLayout());
        labelBackground.setIcon(new ImageIcon("C:\\Users\\Asus TUF\\Desktop\\POO\\ProiectFinal-main\\src\\fundal1.jpg"));
        labelBackground.setLayout(new BorderLayout());
        labelBackground.add(panouPrincipal);
        add(labelBackground);

        btnJocuri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_joc = new FereastraJoc();
                frame_joc.setSize(1200,800);
                frame_joc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame_joc.pack();
                frame_joc.setLocationRelativeTo(null);
                frame_joc.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new MainWindow();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        //frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}