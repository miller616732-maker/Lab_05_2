import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yourAge = 0;
        int ageRequirement = 21;
        System.out.println("How old are you?");
        if (scan.hasNextInt()) {
            yourAge = scan.nextInt();
        }
        if (yourAge == ageRequirement) {
            System.out.println("You get a paper wristband");
        } else if (yourAge > ageRequirement) {
            System.out.println("You get a paper wristband");
        } else if (yourAge < ageRequirement) {
            System.exit(0);
        } else {
            System.out.println("Your number is invalid");
        }
    }
}
