public class Circle {
    private  double radius;
    private String color;
    public Circle() {}
    public Circle (double radius) {
        this.radius = radius;
    }
    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea (){
        return radius*radius*Math.PI ;
    }
    public String toString () {
        return "A Circle with radius = "
                + getRadius()
                + ", which is a subclass of"
                + super.toString();
    }
}
