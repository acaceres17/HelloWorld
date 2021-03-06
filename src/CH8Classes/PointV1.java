package CH8Classes;
// This class is a template to represent
// a point on the cartesian coordinate
public class PointV1 {
    //state fields below
    public int x;
    public int y;
    //behaviors below (methods)
    public void translate(int dx, int dy){ //mutator method, notice the void method
        x = x+ dx; // x+=dx;
        y = y +dx; //y+=dy;

    }
    public void setLocation(int newX, int newY) { //mutator method, doesn't return anything
        x = newX;
        y = newY;
    }
    //accessor method below, notice the return method
    public double distance(PointV1 other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }
    public double distanceFromOrigin(){ //doesn't need parameter because origin stays at 0,0
        return Math.sqrt((x * x) + (y * y));

    }

}
