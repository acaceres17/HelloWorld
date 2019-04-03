
package CH8Classes;

public class PointClientV5 {
    public static void main(String[] args) {
        System.out.println(PointV4.getObjectCount());
        //instantiate a point object called p1 using constructor method
        PointV4 p1 = new PointV4(1, 5);
        System.out.println("P1: " + p1);

        //PointV1 p1 = new PointV1 (3,6);
        PointV4 p2 = new PointV4(3, 6);
        System.out.println("P2: " + p2);

        PointV4 p3 = new PointV4();
        System.out.println("P3: " + p3);

        System.out.println(PointV4.getObjectCount());

        if (p1.equals(p2)) {
            System.out.println("Both points are equal!");
        } else {
            System.out.println("Different points!");

        }
    }
}