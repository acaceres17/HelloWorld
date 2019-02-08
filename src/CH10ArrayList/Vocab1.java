package CH10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocab1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("text1.txt"));
        Scanner input2 = new Scanner(new File("text2.txt"));

        ArrayList<String> list1 = getWords(input1);
        ArrayList<String> list2 = getWords(input2);
        //prints both data files of unique words
        System.out.println(list1);
        System.out.println(list2);
        //get the overlap of the two lsits
        ArrayList<String> common = getOverlap(list1, list2);
        System.out.println(common);
        //calculate the percent overlap
        double list1percent = getPercentOverlap(common, list1);
        double list2percent = getPercentOverlap(common, list2);
        System.out.println("Percent of overlap for 1: " + list1percent +"%\n" +
                "Percent of overlap for 2: " + list2percent + "%");

    }

    //This methods reads in all the data from an external file
    //applies case folding. ArrayList is then sorted to
    //eliminate duplicates. The method returns an ArrayList
    //of Strings that are unique.
    public static ArrayList<String> getWords(Scanner input) {
        // read all words and sort
        ArrayList<String> words = new ArrayList<String>();
        while (input.hasNext()) {
            words.add(input.next().toLowerCase());
        }
        Collections.sort(words);

        //eliminate duplicates in the array list
        ArrayList<String> uniqueWords = new ArrayList<String>();
        if (words.size() > 0) {
            uniqueWords.add(words.get(0));
        } for (int i = 1; i < words.size(); i++) {
            if (!words.get(i).equals(words.get(i - 1))) {
                uniqueWords.add(words.get(i));
            }

        }
        return uniqueWords;
    }
    //this method accepts two sorted ArrayLists and returns
    //an ArrayList is the intersection of these lists
    public static ArrayList<String> getOverlap(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> overlap = new ArrayList<String>();
        int i1 = 0, i2 = 0;
       while (i1 < list1.size() && i2 < list2.size()) {
           int comparison = list1.get(i1).compareTo(list2.get(i2));
           if (comparison ==0) {
               overlap.add(list1.get(i1));
               i1++;
               i2++;
           } else if (comparison < 0) {
               i1++;

           } else {
               i2++;
           }
       }
       return overlap;
    }
    public static double getPercentOverlap(ArrayList<String> common, ArrayList<String> list ) {
        //type cast to double bc you cant divide strings
        return (double)common.size()/list.size()* 100;
    }
}

