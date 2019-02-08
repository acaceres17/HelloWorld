//This program simulates the grocery item which will be
// part of a grocery list. Grocery item will have
// name, quantity and priceperunit
package CH8Classes;

public class AntonioCaceresGroceryItemOrder {
    //state fields
    private String name;
    private int quantity;
    private double ppu;

    //constructors
     public AntonioCaceresGroceryItemOrder(String name, int quantity, double ppu) {
         this.name =name;
         this.quantity = quantity;
         this.ppu = ppu;
     }
     //behaviors
    public double getCost() {
         return quantity * ppu;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString() {
         return "Name: " + name + "\nQuantity: " + quantity +
                 "\nPrice Per Unit: " + ppu + "\nCost of item: " + getCost() + "$" + "\n";
    }
}
