import java.awt.Dimension;

import javax.swing.JFrame;

public class App {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        panel.setSize(new Dimension(500, 500));
        frame.add(panel);
        panel.setSize(new Dimension(500, 500));
        frame.setVisible(true);
        ThraedRepaint repaint = new ThraedRepaint(panel);
        repaint.start();
        MyMouseListener listener = new MyMouseListener(panel);
        panel.addMouseListener(listener);
    }
}