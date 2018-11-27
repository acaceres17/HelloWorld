package CH7Arrays;
import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args){
        int[][] mult = new int[5][10];
       /* for(int i = 0; i < mult.length; i++){
            for(int x = 0; x< mult[i].length; x++){
                    mult[i][x] = (i + 1) * (x + 1);
            }
        }*/
        for(int row = 0; row < mult.length; row++){
            for(int column = 0; column < mult[row].length; column++){
                System.out.print(mult[row][column] + " ");
            }
            System.out.println();
        }


    }
}