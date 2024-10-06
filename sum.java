package array;

import java.util.*;

public class sum {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int a[] = new int[length];
        System.out.println("Enter the element of array");
        int i;
        for (i = 0; i <= length - 1; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i <= length - 1; i++) {
            System.out.println("The arrays are=" + a[i]);
        }
        int sum = 0;
        for (i = 0; i <= length - 1; i++) {
            sum = sum + a[i];
        }
        System.out.println("The sum of array elements are=" + sum);
    }
}
