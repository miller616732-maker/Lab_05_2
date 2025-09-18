import java.util.Scanner;
public class Lab_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double shoppingPrice = 0;
        double taxRate = 0.02;
        double shoppingTax;
        double totalPrice;
        System.out.println("Please enter your shopping price");
        if (scan.hasNextDouble()) {
            shoppingPrice = scan.nextDouble();
        } else {
            System.out.println("You entered an invalid price");
            System.exit(0);
        }
        if (shoppingPrice >= 100) {
            System.out.println("Your total cost is " + shoppingPrice);
        } else {
            shoppingTax = shoppingPrice * taxRate;
            totalPrice = shoppingPrice + shoppingTax;
            System.out.println("Your total cost with shipping is " + totalPrice);
        }
        }
    }