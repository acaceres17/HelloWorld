package CH9Inheritance;

public class Triangle implements ShapeV1 {
    private double a;
    private double b;
    private double c;
    //constructors

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b =b;
        this.c = c;
    }
    //area
    @Override
    public double area() {
        double s = .5 *(a + b + c);
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    //perimeter
    @Override
    public double perimeter() {
        return a + b +c;
    }
}
