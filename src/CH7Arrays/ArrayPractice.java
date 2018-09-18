package CH7Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args ) {
        //Step 1: declare a variable

        int x;
        int[] numbers1 = new int[5]; //an integer array of size 5

        //Step 2: initialize the variable

       x=5;
       System.out.println(Arrays.toString(numbers1)); //before populating the array
       for (int i=0; i < 5; i++) {
           numbers1[i] = i+1;

       }
        System.out.println(Arrays.toString(numbers1));

       //OR

        //Step 3: Declare and initialize

        int y =5;
        int[] numbers2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers2));

    }
}
