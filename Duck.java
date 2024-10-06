import java.util.*;

public class Duck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            n = n / 10;
        }
        System.out.println("first digit=" + n);
        if (n == 0) {
            System.out.println("The number is not duck");
        } else {
            System.out.println("The number is  duck");
        }
    }
}
