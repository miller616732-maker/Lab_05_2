import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your party affiliation.");
        String yourParty;
        String upperYourParty;
        yourParty = scan.nextLine();
        upperYourParty = yourParty.toUpperCase();
        switch (upperYourParty) {
            case "R":
                System.out.println("You are a Republican Elephant");
                break;
            case "D":
                System.out.println("You are a Democratic Donkey");
                break;
            case "I":
                System.out.println("You are an Independent Person");
                break;
            default:
                System.out.println(yourParty + " is not a valid party");
                System.exit(0);
                break;
        }
    }
}
