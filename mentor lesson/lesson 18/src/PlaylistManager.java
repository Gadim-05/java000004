import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlaylistManager {
    public static void main(String[] args) {
        ArrayList<String> playlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Gadify");
            System.out.println("1. Add a song");
            System.out.println("2. Remove a song");
            System.out.println("3. Display playlist");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter song name for adding: ");
                    String sName = scanner.nextLine();
                    playlist.add(sName);
                    System.out.println(sName + " added to your playlist");
                    break;
                case 2:
                    System.out.print("Enter song name for removing: ");
                    String rName = scanner.nextLine();
                    if (playlist.remove(rName)) {
                        System.out.println(rName + " removed from your playlist.");
                    } else {
                        System.out.println("Song not found");
                    }
                    break;
                case 3:
                    System.out.println("Your Playlist:");
                    if (playlist.isEmpty()) {
                        System.out.println("The playlist is empty.");
                    } else {
                        for (String song : playlist) {
                            System.out.println("--> " + song + "<--");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Program closing....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose correctly");
            }
        }
    }
}