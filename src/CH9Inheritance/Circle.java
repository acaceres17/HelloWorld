package CH9Inheritance;
//Circle implements shape class
// therefore, it is circle's responsibility to
//implement area and perimeter
public class Circle implements ShapeV1 {
    public double radius;
    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //area
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    //perimeter
    @Override
    public double perimeter() {
        return 2* Math.PI *radius;
    }
}
