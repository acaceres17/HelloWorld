package CH8Classes;
// This class is a template to represent
// a point on the cartesian coordinate
public class PointV2 {
    //state fields below
    public int x;
    public int y;
    //behaviors below (methods)
    public void translate(int dx, int dy){ //mutator method, notice the void method
        x = x+ dx; // x+=dx;
        y = y +dx; //y+=dy;

    }
    public void setLocation(int newX, int newY) { //mutator method, doesn't return anything but changes the content
        x = newX;
        y = newY;
    }
    //accessor method below, notice the return method, just reveals object's state
    public double distance(PointV2 other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }
    public double distanceFromOrigin(){ //doesn't need parameter because origin stays at 0,0
        return Math.sqrt((x * x) + (y * y));

    }
    //Overriding the object's built-in toString() method
    //to print the contents of the object instead of its location
    public String toString() {
       return "(" + x + ", " + y + ")";
    }

}
