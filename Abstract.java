package array;

abstract class Abstract {
    abstract void display();

    abstract void display2();

    void bark() {
        System.out.println("hii");
    }
}

class D extends Abstract {
    void display() {
        System.out.println("Abstraction is implemented");
    }

    void display2() {
        System.out.println("Abstraction");
    }

    void print1() {
        System.out.println("abstract class is implemented");
    }

    public static void main(String[] args) {
        D ob = new D();
        ob.display();
        ob.print1();
        ob.bark();
        ob.display2();
    }
}
