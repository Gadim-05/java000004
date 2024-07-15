public class ItemMain {

    public static void main(String[] args) {
        // Create items
        Item item1 = new Item("Milk", 2.50);
        Item item2 = new Item("Bread", 1.75);
        Item item3 = new Item("Eggs", 3.00);


        ShoppingList shoppingList = new ShoppingList(2);


        shoppingList.addItem(item1);
        shoppingList.addItem(item2);
        shoppingList.addItem(item3);


        System.out.println(shoppingList);
    }
}
