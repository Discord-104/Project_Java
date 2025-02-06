public class ThraedRepaint extends Thread {
    MyPanel p;

    public ThraedRepaint(MyPanel p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.repaint();
            try {
                Thread.sleep(33);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
