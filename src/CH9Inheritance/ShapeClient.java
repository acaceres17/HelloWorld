package CH9Inheritance;

public class ShapeClient {
    public static void main(String[] args) {
        ShapeV1[] shapes = {new Circle( 5), new Rectangle(8, 11),
                new Triangle(3,4,5)};
        //shapeInfo should print the area and perimeter of all the
        // shapes in the array
        shapeInfo(shapes);
    }
    public static void shapeInfo(ShapeV1[] shapes) {
        for(ShapeV1 s: shapes) {
            System.out.println("Area: " + s.area());
            System.out.println("Perimeter: " + s.perimeter() + "\n");
        }
    }

}
