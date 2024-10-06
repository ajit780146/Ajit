package array;

import java.util.*;

public class Secondsmallest {

    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int a[] = new int[length];
        System.out.println("Enter the array element");
        int i, j, temp;
        for (i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < length; i++) {
            System.out.println("the arrays are=" + a[i]);
        }
        for (i = 0; i < length; i++) {
            for (j = i + 1; j < length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println("sorted number is=" + a[i]);
        }
        System.out.println("2rd smallest number is=" + a[1]);
        System.out.println("smallest number is=" + a[length - length]);

    }
}
