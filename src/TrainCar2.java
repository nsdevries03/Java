import java.awt.*;

public class TrainCar2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400, 200);
        Graphics g = panel.getGraphics();
        drawTrainCar(g, 40, 10, 100);
        drawTrainCar(g, 160, 50, 50);
        drawTrainCar(g, 220, 10, 160);
        for (int i = 0; i <= 10; i++) {
            drawTrainCar(g, 60 * i, 150, 50);
        }
    }
    public static void drawTrainCar(Graphics g, int x, int y, int size) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, size, size / 2);
        g.setColor(Color.CYAN);
        g.fillRect(x + 7 * size / 10, y + size / 10, 3 * size / 10, size / 5);
        g.setColor(Color.RED);
        for (int i = 0; i < 5; i++) {
            g.fillOval(size * i / 5 + x, y + 2 * size / 5, size / 5, size / 5);
        }
    }
}
