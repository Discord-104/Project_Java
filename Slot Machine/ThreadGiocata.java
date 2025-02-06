public class ThreadGiocata extends Thread {

    MyPanel p;
    Portafoglio portafoglio;
    boolean hasPlayed = false; // Aggiungiamo una variabile per tenere traccia se è stata già effettuata una giocata

    public ThreadGiocata(MyPanel p) {
        this.p = p;
        this.portafoglio = Portafoglio.getIstanza();
    }

    @Override
    public void run() {
        // Verifica se è già stata effettuata una giocata
        if (hasPlayed) {
            System.out.println("Hai già effettuato una giocata, attendi il risultato.");
            return;
        }

        // Imposta la variabile per indicare che è stata effettuata una giocata
        hasPlayed = true;

        // Verifica se il giocatore ha abbastanza soldi per giocare
        if (!portafoglio.EffettuaGiocata()) {
            p.risuString = "NON HAI SOLDI!!! POVERO";
            return;
        }

        // Genera i numeri casuali per i rulli
        int num1 = generaNumeroCasuale();
        int num2 = generaNumeroCasuale();
        int num3 = generaNumeroCasuale();

        // Assegna i numeri ai rulli
        p.rullo1.setValore(num1);
        p.rullo2.setValore(num2);
        p.rullo3.setValore(num3);
        
        // Controlla se i numeri sono uguali e aggiorna il portafoglio di conseguenza
        if (num1 == num2 && num2 == num3) {
            p.risuString = "vinto";
            portafoglio.aggiungiVincita(1); // Guadagno 1 euro
        } else {
            p.risuString = "perso";
        }
    }

    // Metodo per generare un numero casuale tra 0 e 9 (inclusi)
    private int generaNumeroCasuale() {
        return (int) (Math.random() * 10);
    }
}