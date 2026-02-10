public class Fungsi09 {
    public static void main(String[] args) {
        int[][] stok = { {10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9} };
        int[] harga = {75000, 50000, 60000, 10000};
        System.out.println("=== Pendapatan Setiap Cabang RoyalGarden ===\n");

        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatanCabang(stok[i], harga);
            String[] status = new String[1];

            tentukanStatus(pendapatan, status);
            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp" + pendapatan);
            System.out.println("Status     : " + status[0]);
            System.out.println();
        }
    }
    static int hitungPendapatanCabang(int[] stokCabang, int[] harga) {
        int total = 0;
        for (int i = 0; i < stokCabang.length; i++) {
        total = total + (stokCabang[i] * harga[i]);
        }
        return total;
    }
    static void tentukanStatus(int pendapatan, String[]status) {
        if (pendapatan > 1500000) {
            status[0] = "Sangat Baik";
        } else {
            status[0] = "Perlu Evaluasi";
        }
    }
}
