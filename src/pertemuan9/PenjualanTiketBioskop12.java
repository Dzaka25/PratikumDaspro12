//Harga tiket = 40000 + (12 mod 6) × 2000   → gantikan Rp50.000 pada soal 
//Syarat diskon pertama = lebih dari (3 + (12 mod 3)) tiket, dengan diskon (8 + (12 mod 5))%   → 
//gantikan "lebih dari 4 tiket, diskon 10%"
//Syarat diskon kedua = lebih dari (8 + (12 mod 4)) tiket, dengan diskon (15 + (12 mod 4))%   → 
//gantikan "lebih dari 10 tiket, diskon 15%"
package pertemuan9;

import java.util.Scanner;

public class PenjualanTiketBioskop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 40000;
        int totalTiketTerjual = 0;
        int jumlahTiket;
        double totalPenjualanUang = 0;
    
        while (true) {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk selesai/keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid");
                System.out.println("Silakan input ulang");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 8) {
                diskon = 0.15;
            } else if (jumlahTiket > 3) {
                diskon = 0.10;
            }

            double hargaKotor = jumlahTiket * hargaTiket;
            double totalBayarPelanggan = hargaKotor - (hargaKotor * diskon);

            totalTiketTerjual += jumlahTiket;
            totalPenjualanUang += totalBayarPelanggan;

            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total harga transaksi: Rp " + totalBayarPelanggan);
            System.out.println("================");
        }
        
        System.out.println("\n=== REKAP PENJUALAN HARI INI ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan: Rp " + totalPenjualanUang);

    }
}
