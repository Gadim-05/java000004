public class Actor {
    private String name;
    private Integer age;
    private Integer actingSkill;

    public Actor(String name, Integer age, Integer actingSkill) {
        this.name = name;
        this.age = age;
        this.actingSkill = actingSkill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getActingSkill() {
        return actingSkill;
    }

    public void setActingSkill(Integer actingSkill) {
        this.actingSkill = actingSkill;
    }
}
