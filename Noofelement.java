package array;

import java.util.*;

public class Noofelement {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int a[] = new int[length];
        System.out.println("Enter the element of array");
        int i, c = 0;
        for (i = 0; i <= length - 1; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i <= length - 1; i++) {
            System.out.println("The elements of arrays are=" + a[i]);
            c++;
        }
        System.out.println("The total number of elements of arrays are=" + c);
    }
}
