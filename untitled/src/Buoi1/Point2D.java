package Buoi1;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point2D(){
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }
    public void setXY(float x, float y){
        this.setXY();
    }

    private void setXY() {
    }

    public float getXY(){
        return getXY();
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(float x, float y, float z){
        super();
        this.z = z;
    }
    public Point3D(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.setXYZ();
    }

    private void setXYZ() {
    }

    public float getXYZ(){
        return getXYZ();
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                "z=" + z +
                '}';
    }
}
class Point2DAnd3DTest {
    public static void main(String[] args) {
        
    }
}
