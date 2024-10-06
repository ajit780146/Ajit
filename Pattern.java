package array;

import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows=");
        int r = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("Another pattern");
        for (int i = 0; i < r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("Another pattern");
        for (int i = r; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("Praymid pattern");
        for (int i = 0; i < r; i++) {
            for (int j = r - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("number pattern");
        for (int i = 0; i < r; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(" ");
        }
        System.out.println("counting pattern");

        for (int i = 0; i <= r; i++) {
            int number = 1;
            for (int j = 0; j < i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(" ");
        }
        System.out.println("another pattern");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
        System.out.println("another pattern");
        for (int i = r; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        System.out.println("another pattern");
        for (int i = r; i >= 1; i--) {
            for (int j = r; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        System.out.println("another pattern");
        for (int i = 1; i <= r; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        System.out.println("another pattern");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println(" ");
        }
        System.out.println("Abc pattern");
        int ab = 65;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ab + j) + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Abc pattern");
        int ac = 65;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ac) + " ");
                ac++;
            }
            System.out.println(" ");
        }
    }
}