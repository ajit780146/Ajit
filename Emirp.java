import java.util.*;

public class Emirp {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp;
        temp = n;
        int c = 0;
        int rev = 0;
        while (n > 0) {
            int l = n % 10;
            rev = rev * 10 + l;
            n = n / 10;
        }
        System.out.println("The reverse of number is=" + rev);

        for (int i = 1; i <= rev; i++) {
            if (rev % i == 0) {
                c++;
            }
        }

        if (c == 2) {
            System.out.println("The number is prime=" + rev);
        } else {
            System.out.println("The number is not prime=" + rev);
        }

    }
}
