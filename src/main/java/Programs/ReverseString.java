package Programs;

public class ReverseString {

    public static void main(String args[]) {
        String name = "saleemsamaldeen";
        String output = "", output1 = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            output = output + name.charAt(i);
        }
        System.out.println("Reverse String: " + output);

        //Another way using StringBuffer

        StringBuffer buffer = new StringBuffer(name).reverse();
        output1 = buffer.toString();
        System.out.println("Reverse String: " + output1);
    }


}
