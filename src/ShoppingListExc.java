import java.util.ArrayList;

public class ShoppingListExc {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Apples");
        shoppingList.add("Bread");
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Rice");

        System.out.println("Shopping list:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }

        shoppingList.remove("Milk");

        System.out.println("\nUpdated shopping list:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }
    }
}