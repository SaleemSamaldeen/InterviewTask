package Programs;

public class AddNumbers {

    static int a = 10;
    static int b = 20;
    static int c = 0;
     /*  It's called a "static initialisation block".

    It runs when the class is first loaded; only once.    */

    /*  For example, a constructor will run each time the class is instantiated */

    static {
        b = a * 4;
    }

    static {
        c = a * 4;
    }


    public static void main(String[] args)
    {
        System.out.println("Value of a : " + ++a);
        System.out.println("Value of b : " + b);
        System.out.println("Value of c : " + c);
    }

}
