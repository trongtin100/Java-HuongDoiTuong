public class ShapeTest {
    public static void main (String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape ("yellow", true);
        System.out.println(shape);
    }
}
