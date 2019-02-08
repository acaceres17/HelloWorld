//This program creates grocery list of items to purchase for the
//upcoming holidays
package CH8Classes;

public class AntonioCaceresGroceryList {
    public static final int MAX_ITEMS = 10;
    //state fields
    //NEVER INITIALIZE
    private AntonioCaceresGroceryItemOrder [] list;
    private int numItems;
    //constructors
    public AntonioCaceresGroceryList() {
        list = new AntonioCaceresGroceryItemOrder[MAX_ITEMS];
        numItems =0;
    }
    //behaviors
    public void addItems(AntonioCaceresGroceryItemOrder item) {
        list[numItems] = item;
        numItems++;
    }
    public double getTotalCost() {
        double totalCost =0;
        for(int i =0; i <numItems; i++) {
            totalCost += list[i].getCost();
        }
        return totalCost;
    }
    public String toString() {
        String myList = "";
        for(int i =0; i <numItems; i++){
            myList = myList + "Item #" + (i+1) + " \n" +list[i] + "\n";
        }
        myList += "Total cost " + getTotalCost() + "$";
        return myList;
    }

}
