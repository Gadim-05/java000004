public class ShoppingList {

    Item[] items;
    int count;

    public ShoppingList(int capacity) {
        items = new Item[capacity];
        count = 0;
    }

    double calculateTotalCost(){
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].getPrice();
        }
        return total;
    }
    public void addItem(Item newItem) {
        if (count < items.length) {
            items[count] = newItem;
            count++;
        } else {
            System.out.println("Shopping list is full, cannot add more items.");
        }



    }



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Shopping list: ");
        for (int i = 0; i <count ; i++) {
            System.out.println(items[i] + "\n");
        }
        System.out.println("Total cost: " + calculateTotalCost());

        return stringBuilder.toString();
    }
}
