package CH8Classes;

import java.util.ArrayList;

public class AntonioCaceresMovieCollectionMod {
       //arraylist of DVD's

        private ArrayList <AntonioCaceresDVD> collection;

        // count the number of DVDs
        private int count;
        private double totalCost;

        public void addDVD(String title, String director, int year, double cost, boolean blueray){

            // add the new DVD
            collection.set(count,new AntonioCaceresDVD(title, director, year, cost, blueray));

            // increment count
            count++;

            // updates totalCost
            totalCost += cost;
        }

        @Override
        public String toString() {
            String output = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n" +
                    "My DVD Collection\r\n\r\n" + "Number of DVDs: " + count + "\r\n" +
                    "Total cost: $" + String.format("%.2f", totalCost) + "\r\n" +
                    "Average cost: $" +
                    // help format the prices to the nearest decimal
                    (count > 0 ? String.format("%.2f", totalCost/count) : 0.00) + "\r\n\r\n" +
                    "DVD List\r\n\r\n";
// to print out all movies at once
            for(int i = 0; i < count; i++){
                output += (collection.get(i).toString() + "\r\n");
            }

            return output;
        }

    }

