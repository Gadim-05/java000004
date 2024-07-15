import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class movieCasting {

    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("John Doe", 25, 8));
        actors.add(new Actor("Jane Smith", 30, 9));
        actors.add(new Actor("Sam Brown", 22, 7));
        actors.add(new Actor("Lucy Green", 35, 10));


        List<Role> roles = new ArrayList<>();
        roles.add(new Role("Hero", 20, 30));
        roles.add(new Role("Villain", 30, 40));
        roles.add(new Role("Sidekick", 20, 25));
        roles.add(new Role("Extra", 18, 35));

        Collections.sort(actors, new Comparator<Actor>() {
            @Override
            public int compare(Actor o1, Actor o2) {
                return o1.getActingSkill() - o2.getActingSkill();
            }
        });

        Collections.sort(roles, new Comparator<Role>() {
            @Override
            public int compare(Role o1, Role o2) {
                return o1.getMinAge() - o2.getMinAge();
            }
        });

        for (Actor a: actors){
            for (Role r: roles){
                if (a.getAge()>=r.getMinAge()&&a.getAge()<=r.getMaxAge()){
                    System.out.println(a.getName() + " is cast as " + r.getName() + " (" + a.getAge() + ")");
                }
            }
        }
    }
}
