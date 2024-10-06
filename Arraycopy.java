import java.util.*;

public class Arraycopy {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Enter the array");
        int a[] = new int[length];
        int b[] = new int[length];
        int i;
        for (i = 0; i < length; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        for (i = 0; i < length; i++) {
            System.out.println("arrays are=" + b[i]);
        }
    }
}
