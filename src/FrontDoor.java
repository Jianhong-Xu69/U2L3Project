import java.util.Scanner;
public class FrontDoor {
    public static void main(String[] args) { // code goes here
        Scanner input = new Scanner(System.in);
        ChatBot jamie = new ChatBot();
        jamie.greeting();
        System.out.println("What would you like to do (w for weather, i for info, d for distance, n for favorite number, c for converting feet to meters)");
        String choice = input.nextLine();
        if (choice.equals("w")) {
            jamie.weather();
        } else if (choice.equals("i"))
        {
            jamie.help();
        } else if (choice.equals("d"))
        {
            jamie.distanceInfo();
        } else if (choice.equals("n")) {
            System.out.println("What is your favorite number?");
            jamie.favoriteNumber(input.nextInt());
        } else if (choice.equals("c"))
        {
            System.out.println("What much are you converting?");
            jamie.feetToMeters(input.nextDouble());
        }else
        {
            System.out.println("That's not a valid input");
        }
        jamie.goodbye();
    }
}
