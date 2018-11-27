package CH7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AntonioCaceresSum {
    public static final String DATA_FILE = "sum.txt";
    public static final int MAX = 25;

    public static void main(String[] args) {
    File f =new File(DATA_FILE);
    try {           //to avoid FileNotFoundException
        Scanner finput = new Scanner(f); //input external file
        start(finput);
    }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

}


    public static void start(Scanner input){    //This method creates the outline of
                                                // the array based on the file given
        int linecount = 0, col =0;
        while(input.hasNextLine()){
            linecount++;     //Counter for the # of lines
            String scan = input.nextLine();
            Scanner line1 = new Scanner(scan);
            int count = 0;
            while (line1.hasNext()){
                count++;
                line1.next();
            }
            col = count;
            Scanner line = new Scanner(scan);
            while(line.hasNext()){      //Checks if the equation is done or not
                if(count != 1) {
                    System.out.print(line.next() + " + ");
                    count--;
                }else{
                    System.out.print(line.next() + " = ");
                }
            }
            int[][] table = new int[col + 2][MAX + (col * col)]; //Since max number has to be 25
            content(table, scan);
        }
        System.out.println();
        System.out.println("Total lines = " + linecount);


    }

    public static void content(int[][] a, String scan) {    //This method populates the array using the file given
        int row = 0;
        Scanner line = new Scanner(scan);
        while (line.hasNext()) {
            int col = a[row].length - 1;
            String num = line.next();
            for (int i = num.length() - 1; i >= 0; i--) { //Turns line into String and converts into int
                char index = num.charAt(i);
                int digit = index - '0';
                a[row][col] = digit;
                col--;
            }
            row++;
        }
        addCol(a);
    }
    public static void addCol(int[][] array){      //Adds columns
        int colAt = array[0].length - 1, sum = 0, rest = 0;
        while(colAt > 0){
            for(int i = 0; i < array.length - 1; i++) {
                sum += array[i][colAt];
            }
            if(sum >= 10) {         //Aligns numbers with 0's accordingly
                rest = sum % 10;
                array[array.length - 1][colAt] = rest;
                sum = sum / 10;
                array[array.length - 2][colAt - 1] = sum;
            }else{
                array[array.length - 1][colAt] = sum;
            }
            colAt--;
            sum = 0;
        }
        output(array);
    }
     public static void output(int[][] a){  //This method outputs the array as the format given
        int test = 0;
        for(int i = 0; i < a[0].length; i++){
            if(a[a.length - 1][i] != 0){        //Checks for either blanks or 0's in file
                test++;
            }
            if(test != 0){
                System.out.print(a[a.length - 1][i]);
            }
        }
        if(test == 0){
            System.out.print(0);
        }
        System.out.println();
    }


}





