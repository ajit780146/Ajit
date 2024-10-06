import java.util.*;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter the number =");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.println("The number is prime" + i);
            } else {
                System.out.println("The number is not prime" + i);

            }
        }
    }

}
