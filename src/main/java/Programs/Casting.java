package Programs;

public class Casting {

    public static void main(String[] args) {

        //Type casting is a method or process that converts a data type into another data type

        int x = 100;
        double d = x;   //Implicit typecasting
        System.out.println("Double value: " + d);

        double num = 100.50;
        int value = (int) num; //Narrowing typecasting  //byte-short-char-int-long-float-double (lower to higher data type)
        System.out.println("Double value: " + num);
        System.out.println("Integer value: " + value);

    }
}
