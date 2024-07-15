public class Aquatic extends Animal{
    private String swimmingDepth;

    public Aquatic(String name, int age, String sound, String swimmingDepth) {
        super(name, age, sound);
        this.swimmingDepth = swimmingDepth;
    }

    public String getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(String swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    public void swim(){
        System.out.println("Fish is swimming");
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Swimming Depth:" + swimmingDepth);
    }
}
