//Tugas 1 (uji wajib) 
//jumlah nilai mahasiswa 
//5 + (12 mod 11)=6
//Tugas 1 (uji wajib) 
//salah satu nilai yang diinput 
//12 mod 100=12

package pertemuan12;

import java.util.Scanner;

public class Tugas112 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = input.nextInt();

        int[] nilaiMahasiswa = new int[jumlah];
        int total = 0;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
            total += nilaiMahasiswa[i];
        }
        
        int tertinggi = nilaiMahasiswa[0];
        int terendah = nilaiMahasiswa[0];
        for (int i = 1; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i] > tertinggi) {
                tertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < terendah) {
                terendah = nilaiMahasiswa[i];
            }
        }

        double rataRata = (double) total / nilaiMahasiswa.length;

        System.out.println("\n=== REKAP NILAI MAHASISWA ===");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            String status = (nilaiMahasiswa[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i] + " (" + status + ")");
        }

        System.out.println("-----------------------------");
        System.out.println("Rata-rata nilai : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
    }
}
