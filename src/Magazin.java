
public class Magazin extends Joc {
    private int nrJocuri;
    private int profit;

    public Magazin()
    {
        super();
        nrJocuri=-1;
        profit=-1;
    }
    public Magazin(int nrJocuri,int profit,String nume,String categorie,String developer, int pret,boolean restrictie)
    {
        super(nume,categorie,pret,developer,restrictie);
        this.nrJocuri=nrJocuri;
        this.profit=profit;

    }
    public int calculProfit()
    {
        profit=super.getSuma();
        return profit;
    }
    public double calculProfit(int suma)
    {
        return super.getSuma();
    }

}
