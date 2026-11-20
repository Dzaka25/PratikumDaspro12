//Percobaan 2 (uji wajib tambahan) 
//salah satu nilai yang diinput 
//60 + (12 mod 41)= 72

package pertemuan12;

import java.util.Scanner;

public class ArrayNilai12 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
                jmlLulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (TIDAK LULUS)");
                jmlTidakLulus++;
            }
        }

        System.out.println("Jumlah mahasiswa lulus: " + jmlLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jmlTidakLulus);
    }
}

