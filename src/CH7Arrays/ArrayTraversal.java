package CH7Arrays;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int [] array = {5, 8, 7, 12};
        abbyAlgo(array);
    }
    public static void jonnyAlgo(int[] ja) {

    }
    public static void abbyAlgo(int[] aa) {
        //Step 1: create a temp. variable for length
        int[] temp = new int [aa.length];
        //Step2: create an integer array of the same size
        for(int i = aa.length-1; i  >=0; i-- ) {
            //Step3: copy the contents of original array into the new
            //array in reverse order
           temp[aa.length-i-1] = aa[i];
        }
        //Step4: set the original array equal to the temporary reversed one
        aa = temp;
        System.out.println(Arrays.toString(aa));



    }
}
