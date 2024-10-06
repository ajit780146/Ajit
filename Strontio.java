import java.util.*;

public class Strontio {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b;
        a = 2 * n;
        System.out.println("The number is" + a);
        a = (a % 1000) / 10;
        System.out.println("The number of a is" + a);
        if (a % 10 == a / 10) {
            System.out.println("The number is stronitio");
        } else {
            System.out.println("The number is notstronitio");
        }
    }
}
