package Programs;

public class LearnArray {

    /* package codechef; // don't place package name! */
    public static void main(String[] args) throws java.lang.Exception {
        Integer[][] numbers1 = new Integer[4][4];
        Integer[][] numbers2 = new Integer[4][4];
        Integer[][] numbers3 = new Integer[4][4];

        if (numbers1 == numbers2) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    numbers3[i][j] = numbers1[i][j] + numbers2[i][j];
                }
            }
        }
        System.out.println(numbers3);

    }


}
