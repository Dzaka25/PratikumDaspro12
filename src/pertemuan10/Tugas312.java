package pertemuan10;

import java.util.Scanner;

public class Tugas312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        int totalBarangSeluruhToko = 0;
        int tokoTerbanyak = 0;
        int maxBarangToko = -1;

        String ringkasan = "";

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("\n--- Toko " + i + " ---");
            System.out.print("Masukkan jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalBarangToko = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("  Jumlah barang dibeli pelanggan " + j + ": ");
                int barang = sc.nextInt();
                totalBarangToko += barang;
            }

            ringkasan += "Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko + "\n";
            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > maxBarangToko) {
                maxBarangToko = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("\nRingkasan:");
        System.out.print(ringkasan);
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}
