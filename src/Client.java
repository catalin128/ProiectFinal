import proiectPack.*;
public class Client extends StareClient implements IClient {
    String numeClient;
    int nrJocuri;

    public Client(String numeClient,int nrJocuri){
        this.numeClient = numeClient;
        this.nrJocuri = nrJocuri;
    }


    public int medieJocuri(int nrClienti,int nrJoc) {
        return nrJoc/nrClienti;
    }

    public int getNrJocuri() {
        return nrJocuri;
    }

    public String getNumeClient(String numeClient)
    {
        return numeClient;
    }
    public String Stare1() {
        return "Client fericit";
    }
    public String Stare2() {
        return "Client nefericit";
    }
}
