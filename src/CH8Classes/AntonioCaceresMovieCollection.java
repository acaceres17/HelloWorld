package CH8Classes;

import CH8Classes.AntonioCaceresDVD;

public class AntonioCaceresMovieCollection {
       //array of DVD's

        private AntonioCaceresDVD[] collection;

        // count the number of DVDs
        private int count;
        private double totalCost;

        public void addDVD(String title, String director, int year, double cost, boolean blueray){

            // add extra space to the array to add the new DVD
            increaseSize();

            // add the new DVD
            collection[count] = new AntonioCaceresDVD(title, director, year, cost, blueray);

            // increment count
            count++;

            // updates totalCost
            totalCost += cost;
        }

        // to add a one or more movies
        // would be a lot easier with ArrayList
        private void increaseSize(){
            // array size + 1 --> newtemp array
            AntonioCaceresDVD[] temp = new AntonioCaceresDVD[count + 1];
            // loop to populate the new tem array from existing collection
            for (int i = 0; i < count; i++){
                temp[i] = collection[i];
            }

            collection = temp;
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
                output += (collection[i].toString() + "\r\n");
            }

            return output;
        }

    }

