import java.util.Scanner;
public class Main {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width , height);
        System.out.println ("your rectangle" + rectangle.Display());
        System.out.println ("perimeter is" + rectangle.Perimeter());
        System.out.println ("the area " + rectangle.getArea());
    }
}
