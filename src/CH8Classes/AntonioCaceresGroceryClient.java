package CH8Classes;

public class AntonioCaceresGroceryClient {
    public static void main (String[] args) {
        AntonioCaceresGroceryList List1 = new AntonioCaceresGroceryList();
        List1.addItems(new AntonioCaceresGroceryItemOrder("Pancake Mix", 2, 11.00));
        List1.addItems(new AntonioCaceresGroceryItemOrder("Chocolate", 10, 1.50));
        System.out.println(List1);
    }
}
