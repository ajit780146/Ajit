package array;

import java.util.*;

public class Oddposition {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int a[] = new int[length];
        System.out.println("Enter the array element");
        int i;
        for (i = 0; i <= length - 1; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i <= length - 1; i++) {
            System.out.println("the arrays are=" + a[i]);
        }
        for (i = 0; i <= length - 1; i++) {
            if (i % 2 != 0) {
                System.out.println("the arrays at odd position are=" + i + " " + a[i]);
            }
        }
    }
}
