package array;

import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Enter the array");
        int arr[] = new int[length];
        int i, j;
        for (i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; i < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("this number is duplicate=" + arr[j]);
                }
            }
        }
    }
}
