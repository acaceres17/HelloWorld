package WorkSpace;

public class ACSLV1 {

    public static void main (String args[]) {
        int x = 1325678095;
        String xStr = Integer.toString(x);
        int newX = 0;
        for(int i=0; i <= xStr.length()-1; i++) {
            newX = Integer.parseInt(xStr.substring(i));
            System.out.println(newX);;

        }

    }
}
