package array;

import java.util.*;

public class Addmatrix {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int d[][] = new int[r][c];
        System.out.println("Enter the array element");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                d[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The addition  of two matrix is=");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
