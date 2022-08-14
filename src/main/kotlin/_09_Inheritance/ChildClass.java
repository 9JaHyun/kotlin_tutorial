package _09_Inheritance;

public class ChildClass extends JavaChildFieldValue {

    public static void main(String[] args) {
        new ChildClass(5);
    }

    public ChildClass(int number) {
        super(number);
        System.out.println("=== Child ===");
        System.out.println(number);
        System.out.println("==============");
    }
}
