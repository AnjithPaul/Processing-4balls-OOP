import processing.core.PApplet;

public class BallHandler extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;

    public static void main(String[] args) {
        PApplet.main("BallHandler", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

        ball1 = new Ball(HEIGHT/5, 1, 10);
        ball2 = new Ball(2*HEIGHT/5, 2, 10);
        ball3 = new Ball(3*HEIGHT/5, 3, 10);
        ball4 = new Ball(4*HEIGHT/5, 4, 10);
    }

    @Override
    public void draw() {
        drawCircle(ball1);
        drawCircle(ball2);
        drawCircle(ball3);
        drawCircle(ball4);
    }

    private void drawCircle(Ball ball) {
        int ballRadius = ball.getRadius();
        ellipse(ball.getxPosition(), ball.getyPosition(), ballRadius, ballRadius);
        ball.move();
    }
}
