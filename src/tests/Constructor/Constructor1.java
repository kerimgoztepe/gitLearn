package tests.Constructor;

public class Constructor1 {
    private int x;

    private Constructor1() {
        System.out.println("constructor is called here...");
        x=5;
    }

    public static void main(String[] args) {
        Constructor1 obj1 = new Constructor1();
        System.out.println("value of obj1 ="+obj1.x);
    }
}
