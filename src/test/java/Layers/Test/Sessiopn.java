package Layers.Test;

import java.util.ArrayList;
import java.util.List;

public class Sessiopn {


    public void getAscending() {
        Integer[] arr = {1, 5, 7, 6, 2, 3, 8, 9};
        List<Integer> sorted = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int value = arr[0];
            if (sorted.contains(value)) {

            }
            sorted.add(value);
        }
    }

    public static void getPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0)
                    System.out.print(i * i + " ");
                else System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String parms[]) {
        getPattern();
    }


}
