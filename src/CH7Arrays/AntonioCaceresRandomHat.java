package CH7Arrays;

import java.util.Random;

public class AntonioCaceresRandomHat {
        public static void main(String[] args) {
            //create a array for all my teams
            int[] teams = {1, 2, 3, 4, 5, 6, 7, 8};
            int[] copy = teams;
            //implements random class
            Random rand = new Random();
            System.out.println("ROUND ONE:");
            //for (int i = 0; i <= (copy.length) / 2 - 1; i++) {
            int x =0;
            int y =0;
            do {
                x = rand.nextInt(teams.length) + 1;
                teams[x] = 0;
                y = rand.nextInt(teams.length) + 1;
                teams[y] = 0;
                System.out.println("Team " + teams[x] + " VS Team " + teams[y]);
            } while(teams[x] != 0 && teams[y] != 0);

        }

    }

