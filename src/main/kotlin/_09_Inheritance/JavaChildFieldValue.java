package _09_Inheritance;

public abstract class JavaChildFieldValue {

    public int number;

    public JavaChildFieldValue(int number) {
        this.number = number;
        System.out.println("=== Parent ===");
        System.out.println(number);
        System.out.println("==============");
    }
}

