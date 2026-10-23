//• hargaKopi = 10000 + (12 mod 5) × 1000 → gantikan Rp12.000 pada soal
//• hargaTeh = 5000 + (12 mod 4) × 1000 → gantikan Rp7.000 pada soal
//• hargaRoti = 15000 + (12 mod 6) × 1000 → gantikan Rp20.000 pada soal
//- hargaKopi = 12000
//- hargaTeh = 5000
//- hargaRoti = 15000
package pertemuan9;

import java.util.Scanner;
public class KafeDoWhile12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000;
        int hargaTeh = 5000;
        int hargaRoti = 15000;
        int totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}