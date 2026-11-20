//Percobaan 4 Bagian B (uji wajib tambahan) 
//elemen dasar array (B) 
//20 + (12 mod 60)= 32
//{B, B+15, B−8, B+30, B−20, B+5} 
// {32, 32+15, 32−8, 32+30, 32−20, 32+5}= 32,47,24,62,12,37

package pertemuan12;

import java.util.Arrays;

public class SortNilai12 {
   public static void main(String[] args) {
        int[] nilai = {78, 65, 90, 55, 88, 72};

        System.out.println("Sebelum diurutkan:");
        System.out.println(Arrays.toString(nilai));

        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {

                if (nilai[j] < nilai[j + 1]) {

                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.println("Setelah diurutkan:");
        System.out.println(Arrays.toString(nilai));
    }
}
