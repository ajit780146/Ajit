import java.util.*;

public class Positiveornegative {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println("The number is positive=" + n);
        } else {
            System.out.println("The number is  negative=" + n);
        }
    }
}
