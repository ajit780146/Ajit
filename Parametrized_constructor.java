package array;

public class Parametrized_constructor {
    Parametrized_constructor(int a, int b) {
        int c = a + b;
        System.out.println("The sum of two number is=" + c);
    }

    public static void main(String[] args) {
        Parametrized_constructor ob = new Parametrized_constructor(10, 20);
    }
}
