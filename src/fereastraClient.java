import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class fereastraClient extends JFrame{
    private JButton btnAdaugare;
    private JButton btnAfisare;
    private JLabel labelAfisare;
    private JTextField textAdaugare;
    private JTextField textField1;
    private JPanel panouClient;
    private JButton apelareSingletonButton;
    private JLabel label = new JLabel();
    public static ArrayList <Client> c;
    int nrClienti = 0;
    int nrJoc=0;

    public fereastraClient(){
        panouClient.setOpaque(false);
        // panouPrincipal.setLayout(new FlowLayout());
        label.setLayout(new FlowLayout());
        label.setIcon(new ImageIcon("C:\\Users\\Asus TUF\\Desktop\\POO\\ProiectFinal-main\\steam.jpg"));
        label.setLayout(new BorderLayout());
        label.add(panouClient);
        add(label);
        c = new ArrayList<Client>();
        btnAdaugare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textAdaugare.getText().isEmpty())
                    JOptionPane.showMessageDialog(null,"Nu ati introdus numele");
                else if(textField1.getText().isEmpty())
                    JOptionPane.showMessageDialog(null,"Nu ati introdus numarul de jocuri cumparate");
                else{
                    String nume = textAdaugare.getText();
                    int nr = Integer.parseInt(textField1.getText());
                    Client aux = new Client(nume,nr);
                    c.add(aux);
                    nrClienti++;
                }

            }
        });

        btnAfisare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(Client i:c) {
                    nrJoc += i.getNrJocuri();
                }
                Client aux= new Client("",-1);
               int rezultat= aux.medieJocuri(nrClienti,nrJoc);
               labelAfisare.setText(String.valueOf(rezultat));
            }
        });
        apelareSingletonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Singleton x = Singleton.getInstance();
                labelAfisare.setText(x.s);
            }
        });
    }
}
