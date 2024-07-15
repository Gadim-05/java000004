import java.awt.font.FontRenderContext;

public class Homework {
    public static void main(String[] args) {
        char[][] matrix = {
                {'A','B','C'},
                {'D','E','F'},
                {'G','H','L'}
        };
        System.out.println("Principal diagonal: ");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3 ; j++) {
                if (i==j){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println(" ");
        System.out.println("Secondary diagonal: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >=0 ; j--) {
                if (i+j==2){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
