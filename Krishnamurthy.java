import java.util.*;

public class Krishnamurthy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp, l, fact = 0, i = 1;
        temp = n;
        while (n > 0) {
            l = n % 10;
            fact += fact * i;
            n = n / 10;
            i++;
        }
        System.out.println("The no is " + fact);
        if (fact == temp) {
            System.out.println("The no is strong");
        } else {
            System.out.println("The no is not strong");
        }
    }
}
