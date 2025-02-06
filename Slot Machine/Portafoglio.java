public class Portafoglio {
    int soldi;

    private static Portafoglio istanza = null;
    static Portafoglio getIstanza(){
        if(istanza == null){
            istanza = new Portafoglio();
        }
        return istanza;
    }
    private Portafoglio() {
        this.soldi = 10;
    }

    synchronized public void setSoldi(int soldi) {
        this.soldi = soldi;
    }

    public int getSoldi() {
        return soldi;
    }

    synchronized boolean EffettuaGiocata(){
        if(soldi > 0){
            soldi-=1;
            return true;
        }
        else
            return false;
    }

    synchronized void aggiungiVincita(int vincita){
        soldi += vincita;
    }

    
}
