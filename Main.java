import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, quantity;
        double price = 0, total;

        System.out.println("================================");
        System.out.println("   FOOD DELIVERY SIMULATOR");
        System.out.println("================================");

        System.out.println("Menu");
        System.out.println("1. Pizza      - Rs.250");
        System.out.println("2. Burger     - Rs.150");
        System.out.println("3. Sandwich   - Rs.120");
        System.out.println("4. French Fries - Rs.100");
        System.out.println("5. Soft Drink - Rs.50");

        System.out.print("\nEnter your choice: ");
        choice = sc.nextInt();

        switch(choice) {
            case 1:
                price = 250;
                break;
            case 2:
                price = 150;
                break;
            case 3:
                price = 120;
                break;
            case 4:
                price = 100;
                break;
            case 5:
                price = 50;
                break;
            default:
                System.out.println("Invalid Choice!");
                return;
        }

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("\nSelect Payment Method");
        System.out.println("1. Cash on Delivery");
        System.out.println("2. Online Payment");

        System.out.print("Enter Option: ");
        int payment = sc.nextInt();

        if(payment == 1) {
            System.out.println("Payment Method: Cash on Delivery");
        }
        else if(payment == 2) {
            System.out.println("Payment Successful");
        }
        else {
            System.out.println("Invalid Payment Option");
            return;
        }

        System.out.println("\n========== RECEIPT ==========");
        System.out.println("Quantity      : " + quantity);
        System.out.println("Total Amount  : Rs." + total);
        System.out.println("Order Status  : Confirmed");
        System.out.println("Delivery Time : 30 Minutes");
        System.out.println("Thank You for Ordering!");
    }
}