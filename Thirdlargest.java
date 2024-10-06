package array;

import java.util.*;

public class Thirdlargest {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int a[] = new int[length];
        System.out.println("Enter the array element");
        int i, j, temp;
        for (i = 0; i <= length - 1; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i <= length - 1; i++) {
            System.out.println("the arrays are=" + a[i]);
        }
        for (i = 0; i <= length - 1; i++) {
            for (j = i + 1; j <= length - 1; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("3rd largest number is=" + a[length - 3]);
        System.out.println("largest number is=" + a[length - 1]);
        System.out.println("smallest number is=" + a[length - length]);
    }

}
