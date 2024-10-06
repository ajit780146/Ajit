package array;

import java.util.*;

public class Inheritence {
    int a = 20;
    int b = 30;

    void display() {
        a = 40;
        b = 20;
    }
}

class B extends Inheritence {
    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int c = sc.nextInt();
        int d = a + b + c;
        System.out.println("The sum of values is=" + d);
    }

    void print() {
        System.out.println("Single inheritence is implemented");
    }

    public static void main(String[] args) {
        B ob = new B();
        ob.print();
        ob.display();
    }
}
