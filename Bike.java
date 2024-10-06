package array;

interface Bike {
    void run();

    void go();
}

class Ab implements Bike {
    public void run() {
        System.out.println("Interface is implemented");
    }

    public void go() {
        System.out.println("interface");
    }

    void say() {
        System.out.println("hii");
    }

    public static void main(String[] args) {
        
        Ab ob = new Ab();
        ob.run();
        ob.go();
        ob.say();
    }
}
