package LearnAbstraction;


public class UnderstandStatic {

    /**
     * public static class UnderstandStatic {
     * <p>
     * //A top level Static class is not possible in java. Only nested static class possible in java.
     * <p>
     * }
     **/

    public static void myMethod(String searchText) {  //Overload possible in static method
        System.out.println("Static method with single parameter");
    }

    public static void myMethod() { //Overload possible in static method
        System.out.println("Static method without parameter");
    }

}


class Child extends UnderstandStatic {

    public static void myMethod(String search) {   //Override not possible in static method
        System.out.println("Static method overridden in child class");
    }

    public void normalMethod(String fname) {

    }
}

class HowStaticWork {
    public static void main(String params[]) {
        Child ch = new Child();
        ch.myMethod("saleem");
    }
}