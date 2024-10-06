import java.util.*;

class Evenodd {

    public static void main(String[] args) {
        System.out.println("Enter the number =");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the number is=" + n);
        if (n % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }
    }

}
