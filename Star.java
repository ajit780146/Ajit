package array;

import java.util.*;

public class Star {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        r = sc.nextInt();
        for (int i = r; i > 0; i--) {
            for (int k = r; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
