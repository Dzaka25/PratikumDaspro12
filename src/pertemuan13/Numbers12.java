package pertemuan13;

import java.util.Arrays;

public class Numbers12 {
 public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        System.out.println(Arrays.deepToString(myNumbers));

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }

        myNumbers[0] = new int[7];
        System.out.println(myNumbers.length);
        System.out.println(myNumbers[0].length);
    }
}
