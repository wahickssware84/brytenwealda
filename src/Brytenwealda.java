import java.util.Scanner;

/**
 * @param
 * @return
 */
public class Brytenwealda {

    public static void main(String[] args) {
        // Create Scanner object
        Scanner in = new Scanner(System.in);
        // Introduction.
        System.out.println("\nWelcome to Brytenwealda!\n");
        displayWindow();
        System.out.println("\n\tSelect your faction:\n");
        displayWindow();

    }

    public static void displayWindow() {
        char x = '*';
        int y = 40;
        for (int i = 0; i < y; ++i) {
            System.out.println(x);
        }
    }

}
