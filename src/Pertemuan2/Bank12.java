import java.util.Scanner;

public class Bank12 {
    public static void main(String[] args) {
      Scanner dzaka = new Scanner(System.in);


      int jml_tabungan_awal, lama_menabung;
      double prosentase_bungan = 0.02, bunga, jml_tabungan_akhir;


      System.out.println("masukan jumlah tabungan awal anda");
      jml_tabungan_awal = dzaka.nextInt();
      System.out.println("masukkan lama menabung anda");
      lama_menabung= dzaka.nextInt();


      bunga= lama_menabung*prosentase_bungan*jml_tabungan_awal;
      jml_tabungan_akhir=bunga+jml_tabungan_awal;


      System.out.println("Bunga adalah " +bunga);
      System.out.println("jumlah tabungan akhir anda adalah " +jml_tabungan_akhir);
    }
    
}