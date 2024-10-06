public class Fibonic {
    public static void main(String[] args) {
        int i = 0, i2 = 1, i3, c = 20;
        for (i = 0; i < 20; i++) {
            i3 = i + i2;
            System.out.println("sum=" + i3);
            i = i2;
            i2 = i3;
        }

    }
}
