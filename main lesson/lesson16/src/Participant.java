import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Participant {
    String name;
    int age;
    String email;

    public Participant(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
