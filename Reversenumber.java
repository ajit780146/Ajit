package array;

import java.util.*;

public class Reversenumber {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int a[] = new int[length];
        System.out.println("Enter the element of array");
        int i;
        for (i = 0; i < length - 1; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < length - 1; i++) {
            System.out.println("The arrays are=" + a[i]);
        }
        for (i = length - 2; i >= 0; i--) {
            System.out.println("The arrays after reverse are=" + a[i]);
        }
    }
}
