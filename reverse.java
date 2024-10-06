
import java.util.*;

class Reverse {
    public static void main(String args[]) {
        System.out.println("Enter the number =");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println("The no is=" + n);
        int temp = 0;
        while (n > 0) {
            int last = n % 10;
            temp = temp * 10 + last;
            n = n / 10;
        }
        System.out.println(temp);
    }
}