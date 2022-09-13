public class Point3D extends Point2D {
    float z = 1;
    float x=1;
    float y=1;
    public Point3D (){}
    public Point3D (float x, float y, float z) {
        super(x,y);
        this.z=z;
    }
    public float getX () {
        return this.x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return this.y;
    }
    public void setY(float y) {
        this.y=y;
    }
    public float getZ () {
        return this.z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ( float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }
    public float[] getXYZ(){
        float [] xyz = {getX(),getY(),getZ()} ;
        return xyz;
    }
    public String toString(){
        return "a point3D with = "
                + getX()
                + getY()
                + getZ();
    }
}
