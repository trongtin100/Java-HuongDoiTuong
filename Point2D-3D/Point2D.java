public class Point2D {
    float x=1;
    float y=1;
    public Point2D (){}
    public Point2D (float x, float y) {
        this.x=x;
        this.y=y;
    }
    public float getX () {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y=y;
    }
    public void setXY( float x, float y) {
        setX(x);
        setY(y);
    }
    public float[]getXY(){
        float [] xy = {getX(),getY()} ;
        return xy;
    }
    public String toString(){
        return "a point2D with = "
            + getX()
                + getY()
                + super.toString();
    }



}
