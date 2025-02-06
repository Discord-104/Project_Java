import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {

    MyPanel panel;
    ThreadGiocata tg = null;

    public MyMouseListener(MyPanel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (tg != null && tg.isAlive()) { 
            System.out.println("Sta ancora rollando");
            return; // Esci se il thread è ancora in esecuzione
        }
        
        System.out.println(e.getX() + " " + e.getY());

        // Verifica se il clic è avvenuto sul bottone "Start"
        if(panel.pulsanteStart.isPressed(e.getX(), e.getY())){
            panel.risuString = "";
            System.out.println("PREMUTO");

            // Avvia il thread di gioco solo se non è già in esecuzione
            if (tg == null || !tg.isAlive()) {
                this.tg = new ThreadGiocata(panel);
                tg.start();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
    
}
