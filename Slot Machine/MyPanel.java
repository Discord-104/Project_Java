
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
    public Bottone pulsanteStart;
    public Rullo rullo1, rullo2, rullo3;
    public String risuString = "";

    public MyPanel(){
        pulsanteStart = new Bottone(100, 100, 200, 40);
        rullo1 = new Rullo();
        rullo2 = new Rullo();
        rullo3 = new Rullo();
    }
    int x = 10;
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        g.drawRect(x, 100, 100, 100);
        x++;

        pulsanteStart.disegnati(g);
        g.setFont(new Font("Arial" , 0, 30));
        g.drawString(risuString, 180, 100);
        g.drawString("€: " + Portafoglio.getIstanza().getSoldi(),0,40);
        paintRullo(g);
    }


    private void paintRullo(Graphics g) {
        // Disegna il rullo 1
        g.setColor(Color.BLUE);
        g.fillRect(100, 200, 50, 50);
        g.setColor(Color.BLACK);
        g.drawRect(100, 200, 50, 50);
        g.setFont(new Font("Arial", 0, 20));
        g.drawString(Integer.toString(rullo1.getValore()), 115, 235);
    
        // Disegna il rullo 2
        g.setColor(Color.GREEN);
        g.fillRect(200, 200, 50, 50);
        g.setColor(Color.BLACK);
        g.drawRect(200, 200, 50, 50);
        g.setFont(new Font("Arial", 0, 20));
        g.drawString(Integer.toString(rullo2.getValore()), 215, 235);
    
        // Disegna il rullo 3
        g.setColor(Color.RED);
        g.fillRect(300, 200, 50, 50);
        g.setColor(Color.BLACK);
        g.drawRect(300, 200, 50, 50);
        g.setFont(new Font("Arial", 0, 20));
        g.drawString(Integer.toString(rullo3.getValore()), 315, 235);
    }
    
}
