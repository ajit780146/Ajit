import java.util.*;

public class Autobiographical {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp, c = 0, temp2, sum = 0;
        temp = n;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        System.out.println("Total number of digits =" + c);
        temp2 = temp;
        while (temp > 0) {
            int l = temp % 10;
            sum = sum + l;
            temp = temp / 10;
        }
        System.out.println("Total sum is=" + sum);
        if (sum == c) {
            System.out.println("The number is autobiographical=" + temp2);
        } else {
            System.out.println("The number is not autobiographical=" + temp2);
        }
    }
}
