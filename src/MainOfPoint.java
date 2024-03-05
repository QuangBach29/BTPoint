import java.util.Scanner;

public class MainOfPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x :");
        float x = scanner.nextFloat();
        System.out.println("y:");
        float y = scanner.nextFloat();
        System.out.println("z : ");
        float z = scanner.nextFloat();

        Point2D point2D = new Point2D(x,y);
        System.out.println(point2D);

        Point3D point3D = new Point3D(x,y,z);
        System.out.println(point3D);
    }
}
