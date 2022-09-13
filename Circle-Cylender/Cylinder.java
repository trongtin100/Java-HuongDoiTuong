public class Cylinder extends Circle {
    private double radius = 1.0;
    private double height = 1.0;
    public Cylinder () {}
    public Cylinder (double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double getRadius () {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getHeight () {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double  getArea() {
        return radius*radius*height*Math.PI;
    }
    public double getPerimeter() {
        return 2*radius*height*Math.PI;
    }
    @Override
    public String toString(){
        return "Cylinder with radius = "
                + getRadius()
                +getHeight()
                + "which a subsclass" + super.toString();
    }
}
