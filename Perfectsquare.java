import java.util.*;

public class Perfectsquare {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i = 2; i < n; i++) {
            if (n / i == i) {
                System.out.println("The number is perfect square of=" + i);
            }
        }
    }
}
