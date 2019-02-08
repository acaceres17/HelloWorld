package CH10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fInput = new Scanner (new File("data.txt"));
        ArrayList<String> list = new ArrayList<>();
        while (fInput.hasNext()) {
            list.add(fInput.next());
        }
        System.out.println(list);
        reverse(list);
        capPlural(list);
        noPlural(list);
    }
    public static void reverse( ArrayList<String> list) {
            int length = list.size();
            ArrayList<String> newArray = new ArrayList<String>();

            for (int i = list.size() - 1; i >= 0; i--) {
                newArray.add(list.get(i));
            }

            System.out.println(newArray);
        }
        public static void capPlural(ArrayList<String> list) {
            for(int i = 0; i <= list.size()-1; i++) {
                if(list.get(i).charAt(list.get(i).length()-1) == 's') {
                    list.set(i,list.get(i).toUpperCase());
                }
            }
            System.out.println(list);
        }
        public static void noPlural(ArrayList<String> list) {
            for(int i = 0; i <= list.size()-1; i++) {
                if(list.get(i).endsWith("S")) {
                    list.remove(i);
                }
            }
            System.out.println(list);
        }
}
