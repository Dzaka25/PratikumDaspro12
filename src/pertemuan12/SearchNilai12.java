//Percobaan 4 Bagian A (uji wajib tambahan) 
//key 
//50 + (12 mod 50)= 62 

package pertemuan12;

public class SearchNilai12 {
    public static void main(String[] args) {
        int[] nilai = {78, 65, 90, 55, 88, 72};
        int key = 62;
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}