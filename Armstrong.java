import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number =");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp1, temp2, c = 0;
        temp1 = n;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        System.out.println("Total no of digit is =" + c);
        int sum = 0;
        temp2 = temp1;
        while (temp1 > 0) {
            int l = temp1 % 10;
            sum += (Math.pow(l, c));
            temp1 = temp1 / 10;
        }
        if (temp2 == sum) {
            System.out.println("The number is armstrong =" + sum);
        } else {
            System.out.println("The number is not armstrong =" + sum);
        }
    }

}
