public class Menu {
    Kabab kabab;
    Meze meze;
    Ichki ichki;

    double calculateTotalPrice(){
        double total = kabab.getPrice() + meze.getPrice() + ichki.getPrice();
        return total;
    }

    public Menu(Kabab kabab, Meze meze, Ichki ichki) {
        this.kabab = kabab;
        this.meze = meze;
        this.ichki = ichki;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        System.out.println("Menu: \n" +
                "Kabab: " + kabab + "\n" +
                "Meze: " + meze + "\n" +
                "Ichki: " + ichki);
        System.out.println("Total price: " + calculateTotalPrice());
        return sb.toString();
    }
}
