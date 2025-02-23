package Bai_3;

public class Rectangle {
    private float length ;
    private float width ;

    public Rectangle(float length, float with){
this.length = length ;
this.width = with;

    }
public Rectangle(){};

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return length * width ;

    }
    public double getPerimeter(){
        return 2*( length + width );

    }

    @Override
    public String toString() {
        return "Retangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
