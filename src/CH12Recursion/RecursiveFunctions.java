package CH12Recursion;

public class RecursiveFunctions {
    public static void main (String args[]) {
        System.out.print(f(12));
    }
    public static int f(int x) {
        //base case
        if(x <=4) {
            return x+4;
        } //recursive case(s)
        else if(x > 6) {
            return 2*f(x-3) -3;
        } else {
            return f(x +2) +1;
        }
    }
}
