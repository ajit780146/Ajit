package array;

import java.util.*;

public class Smallestnumber {
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
            System.out.println("The elements of arrays are=" + a[i]);
        }
        int max = a[0];
        for (i = 1; i < length; i++) {
            if (a[i] < max) {
                max = a[i];
            }
        }
        System.out.println("The smallest element is=" + max);
    }
}
