package array;

import java.util.*;

public class Desending {
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
        int temp, j;
        for (i = 0; i < length; i++) {
            for (j = i + 1; j < length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (i = 0; i < length; i++) {
            System.out.println("the array descending order are=" + a[i]);
        }
    }
}
