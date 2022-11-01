import java.util.ArrayList;

public class Joc {
    private String nume;
    private String categorie;
    private int pret;
    private String dezvoltator;
    private boolean restrictieVarsta;
    private int suma;
    private ArrayList<Magazin> a;

    public Joc()
    {
        this.nume="";
        this.categorie="";
        this.pret=0;
        this.dezvoltator="";

    }
    public Joc(String nume,String categorie,int pret,String dezvoltator,boolean restrictieVarsta)
    {
        this.nume=nume;
        this.categorie=categorie;
        this.pret=pret;
        this.dezvoltator=dezvoltator;
        this.restrictieVarsta=restrictieVarsta;
    }

    public String getNume() {
        return nume;
    }

    public String getCategorie() {
        return categorie;
    }

    public int getPret() {
        return pret;
    }

    public String getDezvoltator() {
        return dezvoltator;
    }

    public boolean getRestrictie(){
        return restrictieVarsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDezvoltator(String dezvoltator) {
        this.dezvoltator = dezvoltator;
    }

    public boolean isRestrictieVarsta() {
        return restrictieVarsta;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setRestrictieVarsta(boolean restrictieVarsta) {
        this.restrictieVarsta = restrictieVarsta;
    }
    public String toString(){
        return "Nume: "+nume+" Categorie: "+categorie+" Pret: "+pret+" Dezvoltator: "+dezvoltator;
    }

    public void setSuma(int suma)
    {
        this.suma=suma;
    }

    public int getSuma() {
        return suma;
    }
}
