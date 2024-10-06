import java.util.*;

public class Palidrome {
    public static void main(String[] args) {
        int temp1, rev = 0;
        System.out.println("Enter the number =");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        temp1 = n;
        while (n > 0) {
            int l = n % 10;
            rev = rev * 10 + l;
            n = n / 10;
        }
        if (rev == temp1) {
            System.out.println("The number is palidrome=" + rev);
        } else {
            System.out.println("The number is not palidrome=" + rev);
        }
    }
}
