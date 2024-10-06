import java.util.*;

public class Smith {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l, temp, temp1, sum = 0;
        temp = n;
        while (n > 0) {
            l = n % 10;
            sum = sum + l;
            n = n / 10;
        }
        temp1 = temp;
        int i, a, sum1 = 0;
        System.out.println("The sum of digits is=" + sum);
        for (i = 2; i < temp; i++) {
            if (temp % i == 0) {
                System.out.println("factor of number=" + i);
            }
        }
        while (i > 0) {
            a = i % 10;
            sum1 = sum1 + a;
            i = i / 10;
        }
        System.out.println("The sum of factor digit is=" + sum1);
        if (sum == sum1) {
            System.out.println("The number is smith");
        } else {
            System.out.println("The number is not smith");
        }
    }
}
