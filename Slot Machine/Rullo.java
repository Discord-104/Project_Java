public class Rullo {
    private int valore;

    public Rullo() {
        this.valore = 0;
    }

    public void eseguiRullo() {
        this.valore = (int) (Math.random() * 10);
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }
}
