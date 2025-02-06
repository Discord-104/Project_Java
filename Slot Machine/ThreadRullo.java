public class ThreadRullo extends Thread {
    private int valore;
    private Rullo rullo;

    
    public ThreadRullo(Rullo rullo) {
        this.rullo = rullo;
    }

    @Override
    public void run() {
        eseguiRullo();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void eseguiRullo() {
        rullo.eseguiRullo(); 
        valore = rullo.getValore(); 
    }

    public int getValore() {
        return valore;
    }
}