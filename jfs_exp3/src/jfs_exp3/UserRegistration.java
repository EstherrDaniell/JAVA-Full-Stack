package jfs_exp3;
import java.util.Scanner;

public class UserRegistration {
    public void registerUser(String username, String userCountry)
            throws InvalidCountryException {
        if (!userCountry.equals("India")) {
            throw new InvalidCountryException(
                "User Outside India cannot be registered"
            );
        } else {
            System.out.println("User registration done successfully");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = sc.nextLine();
        System.out.println("Enter country:");
        String userCountry = sc.nextLine();
        UserRegistration obj = new UserRegistration();
        try {
            obj.registerUser(username, userCountry);
        } catch (InvalidCountryException e) {
            System.out.println("InvalidCountryException");
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

