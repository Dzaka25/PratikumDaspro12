package kuis1;

import java.util.Scanner;

public class PeternakanTelur12 {

    public static void main(String[] args) {
        Scanner dzaka = new Scanner(System.in);

        int hasilrataratatelur;
        int traytelur;
        int ratarataberat;
        int totaltelur;
        int jumlahtray;
        int telureceran;
        double berattotal;
        int blokkandang;

        System.out.println("Masukkan hasil rata-rata telur:");
        hasilrataratatelur = dzaka.nextInt();

        System.out.println("Masukkan rata-rata berat telur (gram):");
        ratarataberat = dzaka.nextInt();

        System.out.println("Masukkan jumlah tray telur:");
        traytelur = dzaka.nextInt();

        System.out.println("Masukkan jumlah blok kandang:");
        blokkandang = dzaka.nextInt();

        totaltelur = hasilrataratatelur * blokkandang;
        jumlahtray = totaltelur / traytelur;
        telureceran = totaltelur % traytelur;
        berattotal = (double) totaltelur * ratarataberat / 1000;

        System.out.println("Total telur: " + totaltelur);
        System.out.println("Jumlah tray: " + jumlahtray);
        System.out.println("Telur eceran: " + telureceran);
        System.out.println("Berat total (kg): " + berattotal);

        dzaka.close();
    }
}
