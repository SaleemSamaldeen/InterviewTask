package StaticBlock;

public class Employee {

    static {
        System.out.println("This is static block without method name, also called as initializer block");
    }

    public static void records() {
        System.out.println("This is static block with method name");
    }
}
