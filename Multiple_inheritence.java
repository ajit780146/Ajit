package array;

/**
 * InnerMultiple_inheritence
 */
interface Displayable {

    void display();
}

interface Printable {

    void print();
}

class Multiple_inheritence implements Displayable, Printable {
    public void display() {
        System.out.println("multilpe inheritence is implemented");
    }

    public void print() {
        System.out.println("multilpe inheritence through inheritence");
    }

    public static void main(String[] args) {
        Multiple_inheritence ob = new Multiple_inheritence();
        ob.display();
        ob.print();
    }
}
