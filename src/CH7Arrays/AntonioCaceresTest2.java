package CH7Arrays;

public class AntonioCaceresTest2 {
    public static void main(String[] args) {
        //Author: Antonio Caceres
        // Date: 11/14/28
        // Period: 2
        //Q4
        //Q5
        //Q6
        //Q7
    }

    public static int[] collapse(int[] a) {
        int[] temp = new int[a.length  +1 / 2];
        int i =0;
        for (int j = 0; j <= (a.length -2); j+=2) {
            temp[i] = a[i] + a[i + 1];
            i++;

        }
        if(i != temp.length) {
            temp[i] = a[a.length - 1];
        }
        return a;
    }

    public static boolean isUnique(int[] a) {
        if (a.length == 0 || a.length == 1) {
            return true;
        } else {
            for (int i = 0; i <=( a.length - 1); i++) {
                for (int j = 0; j < (a.length - 1); j++) {
                    if (a[i] == a[j + i]) {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    public static int[] vowel(String s) {
        int[] array = new int[5];
        for (int i = 0; i <= s.length(); i++) {
            if (s.charAt(i) == 'a') {
                array[0]++;
            } else if (s.charAt(i) == 'e') {
                array[1]++;
            } else if (s.charAt(i) == 'i') {
                array[2]++;
            } else if (s.charAt(i) == 'o') {
                array[3]++;
            } else if (s.charAt(i) == 'u') {
                array[4]++;
            }

        }
        return array;


    }

    public static int[] flattenedArray(int[][] array2D) {
        int[] a = new int[array2D.length * array2D[0].length];
        int index = 0;
        for (int i = 0; i <= array2D.length - 1; i++) {
            for (int j = 0; j <= array2D[i].length; j++) {
            a[index++] = array2D[i][j];
            }
        }
        return a;
    }
}