import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        displayParticipants();

    }
        public static void displayParticipants() throws FileNotFoundException {

            Participant p = new Participant("Teymur",18,"babapiroteymur@gmail.com");


            File file = new File("participant.txt");
            FileReader fileReader = new FileReader(file);

            String string = p.toString();
            System.out.println(string);






    }
}