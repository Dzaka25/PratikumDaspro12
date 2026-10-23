package latihanjk;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, lama;
        int biaya = 0;
        String kendaraan = "";

        System.out.println("=== PROGRAM BIAYA PARKIR ===");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.println("3. Bus");
        System.out.print("Pilih jenis kendaraan (1-3): ");
        jenis = input.nextInt();

        System.out.print("Lama parkir (jam): ");
        lama = input.nextInt();

        switch (jenis) {
            case 1:
                kendaraan = "Motor";
                if (lama <= 2) {
                    biaya = 3000;
                } else {
                    biaya = 5000;
                }
                break;

            case 2:
                kendaraan = "Mobil";
                if (lama <= 2) {
                    biaya = 5000;
                } else {
                    biaya = 10000;
                }
                break;

            case 3:
                kendaraan = "Bus";
                if (lama <= 2) {
                    biaya = 10000;
                } else {
                    biaya = 20000;
                }
                break;

            default:
                System.out.println("Jenis kendaraan tidak tersedia");
                input.close();
                return;
        }

        System.out.println("\n=== HASIL PARKIR ===");
        System.out.println("Jenis kendaraan: " + kendaraan);
        System.out.println("Biaya parkir: Rp" + biaya);public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
    }
}
    }


