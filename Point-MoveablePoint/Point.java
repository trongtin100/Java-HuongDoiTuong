public class Point {
    float x; float y;
    public Point(){}
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX () {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY () {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY (float x, float y) {
        setX(x);
        setY(y);
    }
    public float[]getXY(){
        float []xyz = { getX(), getY()};
        return xyz;
    }
    public String toString(){
        return"a POINT with="
                + getX()
                + getY();
    }
}
