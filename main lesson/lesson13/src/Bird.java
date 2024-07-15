public class Bird extends Animal{
    private String wingSpan;

    public Bird(String name, int age, String sound, String wingSpan) {
        super(name, age, sound);
        this.wingSpan = wingSpan;
    }

    public String getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(String wingSpan) {
        this.wingSpan = wingSpan;
    }
    public void fly(){
        System.out.println("Bird is flying");
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Wing Span: " + wingSpan);
    }
}
