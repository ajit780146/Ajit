import java.util.*;

public class Buzz {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp, digit = 0;
        temp = n;
        while (n > 10) {
            n = n % 10;
            digit++;
        }
        System.out.println("Last number=" + n);
        if (temp % 7 == 0 || n == 7) {
            System.out.println("The no is buzz");
        } else {
            System.out.println("The no not is buzz");
        }
    }
}
