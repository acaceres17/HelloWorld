//This class is a template to represent a point
//on the cartesian coordinate
package CH8Classes;

public class PointV3 {
    //state fields below (Variables)
    public int x;
    public int y;
    public PointV3(int initialX, int initialY){
        x = initialX;
        y =initialY;

    }
    public PointV3(){
        x =0;
        y =0;
    }

    //Behaviors below (Methods)
    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public void setLocation(int newX, int newY){
        x = newX;
        y = newY;

    }
    //Getter (accessor) method below
    public double distance(PointV3 other){
        int dx = x-other.x;
        int dy = y-other.y;
        double answer = Math.sqrt((dx*dx) + (dy * dy));
        return answer;
    }
    public double distanceOrigin(){
        double answer = Math.sqrt((x*x) + (y * y));
        return answer;

    }
    // we are over riding the objects built in toString() method
    //to print the contents
    public String toString(){
        return("(" + x +", " + y + ")");
    }
}