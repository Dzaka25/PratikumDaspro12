package matdas;

public class kombinatorial {
     public static void main(String[] args) {
        String kata = "AABBCC";
        int n = kata.length();

        long pembilang = 1;
        for (int i = 1; i <= n; i++) {
            pembilang = pembilang * i;
        }

        long penyebut = 1;
        boolean[] sudahDihitung = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (sudahDihitung[i] == false) {
                int jumlah = 1;
                for (int j = i + 1; j < n; j++) {
                    if (kata.charAt(j) == kata.charAt(i)) {
                        jumlah++;
                        sudahDihitung[j] = true;
                    }
                }
               
                for (int k = 1; k <= jumlah; k++) {
                    penyebut = penyebut * k;
                }
            }
        }

        long hasil = pembilang / penyebut;

        System.out.println("String               : " + kata);
        System.out.println("Jumlah string berbeda: " + hasil);
    }
}