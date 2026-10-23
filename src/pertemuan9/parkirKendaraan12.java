//Tarif parkir mobil = 2500 + (12 mod 6) × 250 per jam   → gantikan Rp3.000 pada soal 
//Tarif parkir motor = 1500 + (12 mod 6) × 250 per jam (gunakan nilai (P mod 6) yang SAMA dengan tarif mobil)   → gantikan Rp2.000 pada soal
package pertemuan9;

import java.util.Scanner;

public class parkirKendaraan12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;
        final int TARIF_MOBIL = 2500;
        final int TARIF_MOTOR = 1500;

        do {
            System.out.print("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi * TARIF_MOBIL;
                } else {
                    total += durasi * TARIF_MOTOR;
                }
            }
        
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);
 
    }
}

    
