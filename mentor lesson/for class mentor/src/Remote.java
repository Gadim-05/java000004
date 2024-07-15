public class Remote {
    String brand ;
    String calor ;
    int buttonCount;
    int volume;
    boolean ispower;
    public void onof(boolean ispower){
        if(ispower){
            System.out.println("Turn of Tv");
        }
        else {
            System.out.println("Turn on tv");
        }
    }
}
