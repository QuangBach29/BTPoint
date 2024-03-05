import java.util.Scanner;

public class MainOfPoint2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" x :");
        float x = scanner.nextFloat();
        System.out.println(" y :");
        float y = scanner.nextFloat();
        System.out.println(" xspeed : ");
        float xspeed = scanner.nextFloat();
        System.out.println(" yspeed : ");
        float yspeed = scanner.nextFloat();

        MovablePoint movablePoint = new MovablePoint(x,y,xspeed,yspeed);
        System.out.println("point : " + movablePoint);
    }
}
