import java.awt.*;

public class TrainCar {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400,200);
        Graphics g = panel.getGraphics();
        g.fillRect(40, 10, 100, 50);
        g.setColor(Color.CYAN);
        g.fillRect(110, 20, 30, 20);
        g.setColor(Color.RED);
        for (int i = 0; i < 5; i++) {
            g.fillOval(20 * i + 40, 50, 20, 20);
        }
    }
}
