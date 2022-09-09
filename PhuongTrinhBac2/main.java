import java.util.Scanner;
public class main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap vao so a:");
        double a = scanner.nextDouble();

        System.out.print("nhap vao so b:");
        double b = scanner.nextDouble();

        System.out.print("nhap vao so c:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Delta la:" + quadraticEquation.getdelta() );
        System.out.println("root 1 la: " + quadraticEquation.getRoot1() );
        System.out.println("root 2 la:" + quadraticEquation.getRoot2() );
    }
}
