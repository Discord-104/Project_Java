import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Bottone {
    int x,y,w,h;

    public Bottone(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    boolean isPressed(int xMouse, int yMouse){
        if(x < xMouse && xMouse < x + w){
            if(y < yMouse && yMouse < y + h){
                return true;
            }
        }
        return false;
    }

    void disegnati(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(x, y, w, h);
        g.setColor(Color.black);
        g.drawRect(x, y, w, h);

        g.setFont(new Font("Arial", Font.PLAIN, 30));
        g.drawString("Ludopatico", x + 10, y + h - 10);
    }
}
