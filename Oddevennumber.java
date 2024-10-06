package array;

import java.util.*;

public class Oddevennumber {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int a[] = new int[length];
        System.out.println("Enter the array element");
        int i;
        for (i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < length; i++) {
            System.out.println("the arrays are=" + a[i]);
        }
        for (i = 0; i < length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("The number is even=" + a[i]);
            } else {
                System.out.println("The number is odd=" + a[i]);
            }
        }
    }
}
