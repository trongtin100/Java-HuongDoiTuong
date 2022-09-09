public class QuadraticEquation {
    double a;
    double b;
    double c;
    double x;
    public QuadraticEquation () {}

    public QuadraticEquation (double a, double b, double c) {
        this.a = a ;
        this.b = b ;
        this.c = c ;

    }
    public double getdelta (){
        return ((this.b*this.b) - (4*this.a*this.c));
    }
    public double getdelta1() {
        return (-this.b/(2*this.a));
    }

    public double getRoot1(){
        return (-this.b + Math.pow(getdelta(),0.5))/(2*this.a);
    }
    public double getRoot2(){
        return (-this.b - Math.pow(getdelta(),0.5))/(2*this.a);
    }
    public double DisplayRoot(){
        if (getdelta()<0){
            System.out.println("No answer");
        } else if (getdelta() ==0) {
            System.out.println("TheQuaDraticEquation" + getdelta1());
        } else {
            System.out.println (" root 1:" + getRoot1());
            System.out.println ("root 2:" + getRoot2());
        }
        return DisplayRoot();
    }
}
