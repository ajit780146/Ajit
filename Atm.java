import java.util.*;

public class Atm {
    public static void main(String[] args) {
        System.out.println("Enter the total balance=");
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        System.out.println("Enter the choice=");
        int choice = sc.nextInt();
        int pin = 1234;
        switch (choice) {
            case 1:
                System.out.println("Enter the amout u want to take out=");
                int amount = sc.nextInt();
                if (balance > amount) {
                    int remaining_balance = balance - amount;
                    System.out.println("The remaining balance is=" + remaining_balance);
                } else {
                    System.out.println("insufficent balance");
                }
                break;
            case 2:
                System.out.println("Enter the amout u want to deposit=");
                int deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Total balance=" + balance);
                break;
            case 3:
                System.out.println("Please enter the pin");
                pin = sc.nextInt();
                if (pin == 1234) {
                    System.out.println("The balance is=" + balance);
                } else {
                    System.out.println("Incorrect pin");
                }
                break;
            case 4:

                System.out.println("log out successfully");
                System.exit(0);
        }
    }
}
