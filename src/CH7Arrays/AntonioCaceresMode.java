package CH7Arrays;

import java.util.Scanner;
//This program asks the user for a given number and finds the mode of that number
public class AntonioCaceresMode {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What number do you want to find the mode for: "); //asks for user input
        int num = console.nextInt();
        System.out.println("Mode is: " + efficientMode(num));

    }
    //Justin's algorithm
        public static int efficientMode(int num) {
            int[] a = new int[10];
            while (num > 0) {
                int digit = num % 10; //Traverses through the array to find
                                      //most common number
                a[digit]++;
                num /= 10;
            }
            int max = a[0];
            int item = 0;
            for (int i = 0; i < a.length; i++) {
                if (max < a[i]) {
                    max = a[i];
                    item = i;
                }
            }
            return item;
        }
    }

