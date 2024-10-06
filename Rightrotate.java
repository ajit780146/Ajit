package array;

import java.util.*;

public class Rightrotate {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the array element");
        int i;
        for (i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < length; i++) {
            System.out.println("Array is=" + arr[i]);
        }
        for (i = length; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        for (i = 0; i <= length; i++) {
            System.out.println("Array after rotate is=" + arr[i + i]);
        }
    }
}
