//Percobaan 1 (uji wajibtambahan)
//bil[0], bil[1], bil[2], bil[3] 
// 12 12+8 ; −(12+(12 mod 7)) ; 20+(12 mod 15) = 12,20,-6,32

package pertemuan12;

import java.util.Arrays;

public class ArrayBilangan12 {
    public static void main(String[] args) {
        
        int[] bil = {12, 20, -6, 32};

        for (int i = 0; i <= 4; i++) {
            System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
        
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }
        
        System.out.println(Arrays.toString(bil));
    }
    
}
