import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactBook {
    static Scanner sc = new Scanner(System.in);
   static Map<String,String> contacts = new HashMap<>();


    public static void addContact(){
        System.out.print("Enter contact name: ");
        String name = sc.next();
        System.out.print("Enter Contact number: ");
        String number = sc.next();
        contacts.put(name,number);
    }

    public static void removeContact(){
        System.out.print("Enter name for remove: ");
        String name = sc.next();

        contacts.remove(name);

    }

    public static void searchContact(){
        System.out.print("Enter contact name: ");
        String name = sc.next();
        if (contacts.containsKey(name)){
            System.out.println(name + "-" + contacts.get(name));
        }else {
            System.out.println("Contact not found");
        }

    }
    public static void displayAllContacts(){
        for(Map.Entry<String, String> entry : contacts.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


    public static void main(String[] args) {

        while (true) {
            System.out.println("Contact Book Menu: ");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");

            System.out.print("Choose One Option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;

                case 3:
                    searchContact();
                    break;

                case 4:
                    displayAllContacts();
                    break;

                case 5:
                    System.out.println("System closing....");
                    System.exit(0);
                    break;

                default:
                    System.err.println("Invalid Option. Please Choose Correct Option...");
            }

        }



    }
}
