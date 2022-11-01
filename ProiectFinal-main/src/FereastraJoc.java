import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FereastraJoc extends JFrame{
    private JPanel panouJoc;
    private JTextField textNume;
    private JTextField textCategorie;
    private JTextField textPret;
    private JTextField textDezvoltator;
    private JTextField textRestriciteVarsta;
    private JLabel labelNumeJoc;
    private JLabel labelCategorie;
    private JLabel labelPret;
    private JLabel labelDezvoltator;
    private JLabel labelRestrictieVarsta;
    private JButton btnAdaugare;
    private JButton btnModificare;
    private JButton btnStergere;
    private JLabel labelAfisare;
    private JLabel labelModificare;
    private JLabel label = new JLabel();
    public ArrayList<Joc> j;
    public FereastraJoc(){
        panouJoc.setOpaque(false);
        // panouPrincipal.setLayout(new FlowLayout());
        label.setLayout(new FlowLayout());
        label.setIcon(new ImageIcon("C:\\Users\\Asus TUF\\Desktop\\POO\\ProiectFinal-main\\steam.jpg"));
        label.setLayout(new BorderLayout());
        label.add(panouJoc);
        add(label);
        j=new ArrayList<Joc>();


        btnAdaugare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textNume.getText().isEmpty())
                    JOptionPane.showMessageDialog(null,"Nu ati introdus numele jocului");
                else if(textCategorie.getText().isEmpty())
                    JOptionPane.showMessageDialog(null,"Nu ati introdus categoria");
                else if (textDezvoltator.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Nu ati introdus dezvoltatorul");
                 else if (textPret.getText().isEmpty())
                    JOptionPane.showMessageDialog(null,"Nu ati introdus pret");
                else if (textRestriciteVarsta.getText().isEmpty())
                    JOptionPane.showMessageDialog(null,"Nu ati introdus restrictia");
                else
                {
                    int ok=1;
                    String nume=textNume.getText();
                    int pret=Integer.parseInt(textPret.getText());
                    String dezvoltator=textDezvoltator.getText();
                    String categorie=textCategorie.getText();
                    String restrictie=textRestriciteVarsta.getText();
                    boolean restrictiebool;
                    if(restrictie.equals("DA")||restrictie.equals("da"))
                        restrictiebool=true;
                    else
                        restrictiebool=false;
                    for(Joc i:j)
                    {
                        if(i.getNume().equals(nume))
                            ok=0;
                    }
                    if(ok==1)
                    {
                        Joc aux=new Joc(nume,categorie,pret,dezvoltator,restrictiebool);
                        j.add(aux);

                    }
                    else
                        JOptionPane.showMessageDialog(null,"Exista deja un joc cu acest nume");


                }




            }

       } );


        btnModificare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int ok;
                for(Joc i:j){
                    if(i.getNume().equals(textNume.getText())){
                        ok=1;
                        if(!textPret.getText().isEmpty()) {
                            i.setPret(Integer.parseInt(textPret.getText()));
                            labelModificare.setText(i.toString());
                        }
                        if(!textCategorie.getText().isEmpty()) {
                            i.setCategorie(textCategorie.getText());
                            labelModificare.setText(i.toString());
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Camp categorie/pret gol");

                        }
                    }
                    else ok =0;
                    if(ok==0) JOptionPane.showMessageDialog(null, "Nu exista un joc cu acest nume");
                }
            }
        });
        btnStergere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ok=0;
                for(Joc i:j){
                    if(i.getNume().equals(textNume.getText())) {
                        j.remove(i);
                        ok=1;
                        JOptionPane.showMessageDialog(null, "Jocul a fost sters");
                    }
                }
                if(ok==0) JOptionPane.showMessageDialog(null, "Nu exista un joc cu acest nume");
            }
        });
    }

}
