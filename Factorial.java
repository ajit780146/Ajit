import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int i, fact = 1;
        System.out.println("Enter the number =");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial is=" + fact);
    }
}
