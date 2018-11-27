package CH7Arrays;

import java.util.Random;
import java.util.Scanner;
/*  This program simulates multiple teams going against each other at random
    all while no team is mentioned twice. In this case, user input dictates
    the amount of teams going against each other.
*/
public class AntonioCaceresRandomHatV2 {
    public static void main(String[] args) {
    input();
    }

    public static void input() {
    int num =0;
    //collects user input
    Scanner console = new Scanner(System.in);
    // Makes sure that user input is an even number
        do {
        if (num % 2 != 0) {
            System.out.println("You can only input even numbers!");
        }
        System.out.print("How many teams would you like? ");
        num = console.nextInt();
    } while(num %2!=0);

    randArray(num);

}

    public static void randArray( int num) {
        Random rand = new Random();  // RNG to fill array
        int[] array = new int[num];
        //for loop to populate the array with the # of teams given
        for (int i = 0; i < num; i++) {
            array[i] = 1 + i;
        }
        // for loop to randomly shuffle the array
        for (int i = 0; i < array.length; i++) {
            int shuffle = rand.nextInt(array.length);
            //create temporary array to shuffle objects
            int temp = array[i];
            array[i] = array[shuffle];
            array[shuffle] = temp;
        }
        create(array);

    }
    // Seperate method to arrange teams going against eachother
    public static void create(int[] array) {
        for (int i = 0; i <= array.length - 1; i += 2) {
            System.out.println("team " + array[i] + " vs. team " + array[i + 1]);
        }
    }
}







