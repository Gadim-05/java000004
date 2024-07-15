import java.util.Scanner;

public class Task1 {

        public static void main(String[] args) {
            Scanner scanner =  new Scanner(System.in);
            System.out.print("Enter the number: ");
            int a = scanner.nextInt();
            if(a>10){
                a = -a;
                System.out.println(a);
            }
            else{
                System.out.println(a);
            }
        }
    }

