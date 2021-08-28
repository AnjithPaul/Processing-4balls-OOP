public class Ball {
    private int xPosition;
    private int yPosition;
    private int speed;
    private int radius;

    Ball(int yPosition, int speed, int radius){
        this.yPosition =yPosition;
        this.speed = speed;
        this.radius = radius;
    }

    public void move(){
        xPosition += speed;
    }
    public int getxPosition(){
        return xPosition;
    }
    public int getyPosition(){
        return yPosition;
    }

    public int getRadius() {
        return radius;
    }
}
