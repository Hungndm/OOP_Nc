package Bai_3;


public class TestMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f,3.4f);
        System.out.println(r1);

        Rectangle r2 = new Rectangle();
        System.out.println(r2);

        r1.setLength(5.6f);
        r2.setWidth(7.8f);

        System.out.println(r1);
        System.out.println("length is: " + r1.getLength());
        System.out.println("with is: " + r1.getWidth());
        System.out.println("Area is %.2f%n : " + r1.getArea());
        System.out.println("perimeter is : %2.f%n " + r1.getPerimeter());
    }
}
