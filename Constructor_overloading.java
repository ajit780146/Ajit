package array;

public class Constructor_overloading {
    Constructor_overloading(int a, int b) {
        int c = a + b;
        System.out.println("The sum of two number is=" + c);
    }

    Constructor_overloading(int a, int b, int d) {
        int c = a + b + d;
        System.out.println("The sum of two number is=" + c);
    }

    public static void main(String[] args) {
        Constructor_overloading ob = new Constructor_overloading(10, 20);
        Constructor_overloading ab = new Constructor_overloading(10, 20, 39);
    }
}
