package CH8Classes;

public class PointClientV3 {
    public static void main(String[] args) {
        //instantiate a point object called p1
        PointV3 p1 = new PointV3(3,6);
        System.out.println("P1: " + p1);

        //PointV1 p1 = new PointV1 (3,6);
        PointV3 p2 = new PointV3();
        System.out.println("P2: " + p2);

    }
}