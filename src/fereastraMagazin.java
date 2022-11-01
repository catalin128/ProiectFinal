import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fereastraMagazin extends JFrame {
    private JButton btnCumpara;
    private JButton btnAfisare;
    private JList lista;
    private JTextField numeJoc;
    private JLabel labelNume;
    private JButton btnProfit;
    private JLabel labelProfit;
    private JPanel panouMagazin;
    private JLabel label = new JLabel();
    private int suma;

    private void refreshList(){
        lista.setListData(FereastraJoc.j.toArray());
    }
    public fereastraMagazin(){
        panouMagazin.setOpaque(false);
        // panouPrincipal.setLayout(new FlowLayout());
        label.setLayout(new FlowLayout());
        //label.setIcon(new ImageIcon("C:\\Users\\Asus TUF\\Desktop\\POO\\ProiectFinal-main\\steam.jpg"));
        label.setLayout(new BorderLayout());
        label.add(panouMagazin);
        add(label);
        btnCumpara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ok = 0;
                suma = 0;
                if(numeJoc.getText().isEmpty()) JOptionPane.showMessageDialog(null,"Eroare camp gol");
                for(Magazin i:FereastraJoc.j){
                    if(i.getNume().equals(numeJoc.getText())){
                        ok=1;
                       if( JOptionPane.showConfirmDialog(null,"Esti sigur ca vrei sa cumperi acest joc?","Confirmare",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                        suma +=i.getPret();
                        FereastraJoc.j.remove(i);
                       }
                    }
                    if(ok==0) JOptionPane.showMessageDialog(null,"Nu exista joc cu acest nume");
                }
            }
        });
        btnAfisare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshList();
            }
        });


        btnProfit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Magazin aux = new Magazin();
                aux.setSuma(suma);
                int a = aux.calculProfit();
                labelProfit.setText(Integer.toString(a));
            }
        });
    }
}
