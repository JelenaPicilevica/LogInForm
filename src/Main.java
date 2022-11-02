import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String username = "Jelena";
        String password = "JavaIsMyPassion";


        Scanner scan = new Scanner(System.in);

        System.out.println("\nWelcome to Javagram! Sign in below:\n");
        System.out.print(" Username: ");
        String usernameInput = scan.nextLine();
        System.out.print(" Password: ");
        String passwordInput = scan.nextLine();

        while (!usernameInput.equals(username) || !passwordInput.equals(password)){
            System.out.println("\n Incorrect, please try again!\n");
            System.out.print(" Username: ");
            usernameInput = scan.nextLine();
            System.out.print(" Password: ");
            passwordInput = scan.nextLine();
        }

        System.out.println("\nSign in successful. Welcome!");

        scan.close();


    }
}
