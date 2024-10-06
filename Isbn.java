import java.util.*;

public class Isbn {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp, c = 0;
        temp = n;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        System.out.println("Total no of digits" + c);
        int l, sum = 0, i = 1;
        while (temp > 0) {
            l = temp % 10;
            sum = sum + (l * i);
            temp = temp / 10;
            i++;
        }
        System.out.println("The sum is=" + sum);
    }
}
