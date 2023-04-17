import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Structure: do { instruction } while (condition);
        // Structure: while (condition) { instruction }
        int response;
        do {
            System.out.println("Select an option: ");
            System.out.println("1. Movies \n 2. Series \n 3. Exit");

            // Get user response
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            // Option validation
            switch (response) {
                case 3:
                    System.out.println("See you later!");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Please, select a valid option");
            }
        } while (response != 0); // In this case, the loop has at least one interaction
    }
}
