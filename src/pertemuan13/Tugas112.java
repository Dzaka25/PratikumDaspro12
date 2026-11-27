package pertemuan13;

import java.util.Scanner;

public class Tugas112 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[10][6];
        double totalSemua = 0;

        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("  Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                survei[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== Rata-rata per Responden ===");
        for (int i = 0; i < survei.length; i++) {
            double totalResp = 0;
            for (int j = 0; j < survei[i].length; j++) {
                totalResp += survei[i][j];
            }
            totalSemua += totalResp;
            double rataResp = totalResp / 6.0;
            System.out.printf("Responden ke-%d: %.2f%n", (i + 1), rataResp);
        }

        System.out.println("\n=== Rata-rata per Pertanyaan ===");
        for (int j = 0; j < 6; j++) {
            double totalTanya = 0;
            for (int i = 0; i < 10; i++) {
                totalTanya += survei[i][j];
            }
            double rataTanya = totalTanya / 10.0;
            System.out.printf("Pertanyaan ke-%d: %.2f%n", (j + 1), rataTanya);
        }

        double rataSemua = totalSemua / 60.0;
        System.out.printf("\n=== Rata-rata Keseluruhan: %.2f ===%n", rataSemua);
        
    }
}
