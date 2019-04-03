package CH9Inheritance;

public class Rectangle implements ShapeV1 {
    private double width;
    private double length;

    //contructors

    public Rectangle( double width, double length) {
        this.width = width;
        this.length = length;
    }
    //area
    @Override
    public double area() {
        return length * width;
    }
    //perimeter
    @Override
    public double perimeter() {
        return 2*(length+ width);
    }
}
