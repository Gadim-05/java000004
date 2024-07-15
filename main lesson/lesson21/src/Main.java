import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<String,Integer> studentSystem = new HashMap<>();

        studentSystem.put("Qedim", 96);
        studentSystem.put("Teymur", 90);
        studentSystem.put("Tebriz", 86);
        studentSystem.put("Huseyn", 93);

        for (Map.Entry<String, Integer> entry : studentSystem.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
        System.out.println("Qedimin ortalamasi: " + studentSystem.get("Qedim"));

        System.out.println();
        int timaOrtalama = studentSystem.get("Teymur");
        System.out.println("Teymurun ortalamasi: " + timaOrtalama);

        System.out.println();
        if (studentSystem.containsKey("Tebriz")){
            System.out.println("Tebriz var");
        }
        System.out.println();
        studentSystem.remove("Tebriz");
        System.out.println("Tebriz silindi");

        System.out.println();
        if (studentSystem.containsKey("Tebriz")){
            System.out.println("Tebriz var");
        }else {
            System.out.println("Tebriz yoxdur");
        }
        System.out.println();

        System.out.println("MAp uzunlugu: " + studentSystem.size());

        for (Map.Entry<String, Integer> entry : studentSystem.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}