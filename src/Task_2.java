import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yourMonth=0;
        System.out.println("Please enter your birth month.");
        if (scan.hasNextInt()) {
            yourMonth = scan.nextInt();
        } else {
            System.out.println("Your number was invalid.");
            System.exit(0);
        }
        if (1 < yourMonth && yourMonth < 12) {
            System.out.println("Your birth month is " + yourMonth);
        } else {
            System.out.println("You entered " + yourMonth + ", please enter a number from 1-12");
        }
    }
}
