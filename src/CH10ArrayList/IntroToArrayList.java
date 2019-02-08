package CH10ArrayList;

import java.util.ArrayList;

public class IntroToArrayList {
    public static void main(String args[]) {
        ArrayList<String> students = new ArrayList<String>();
        System.out.println(students);
        students.add("Matt");
        System.out.println(students);
        students.add(0, "Jonny");
        System.out.println(students);
        students.add(0, "Roberta");
        System.out.println(students);
        if (students.contains("Jonny")) {
            students.remove("Jonny");
        }
        System.out.println(students);

      /*  for (int i = 0; i < students.size(); i++) {
            if (students.get(i).startsWith("M")) {

                System.out.println("A student with the " +
                        "letter M exsists in the ArrayList");
            }

        }
        students.clear(); */
        //System.out.println(students);
        addStars(students);
    }

    public static void addStars(ArrayList students) {
        int size = students.size();
        for (int i = 1; i <= students.size(); i+=2) {
            students.add(i, "*");
        }
        System.out.println(students);

    }
}