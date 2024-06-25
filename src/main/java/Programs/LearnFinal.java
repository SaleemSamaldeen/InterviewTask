package Programs;

public class LearnFinal {

    public static final int a = 5;
    public static final String NAME = "saleem";
    private int size = 5;

    // System.out.println("Addition of final integer: "+ a++); //throws compilation error that final integer can't be modified
    // name = "samaldeen";  //throws compilation error that final String can't be modified

    public final void myBody(String name) {   //Overload possible for final method

    }

    public final void myBody(String name, String fName) {

    }

    public void shirt(int size) {
        this.size = size;
        System.out.println("Size of Shirt: " + size);
    }

    /**
     * public static void shirt(int size){
     * this.size = size;  //this cannot be referenced from static context
     * System.out.println("Size of Shirt: "+size);
     * }
     **/

    public class ChildCLass extends LearnFinal {
        /** public final void myBody(String name){   //Overridden of final method is not possible

         } **/
    }

    public static void main(String params[]) {
        LearnFinal cons = new LearnFinal();
        cons.shirt(5);
    }
}
