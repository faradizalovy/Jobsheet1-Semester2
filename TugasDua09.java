import java.util.Scanner;

public class TugasDua09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PROGRAM JADWAL KULIAH");
        System.out.println("==============================");
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][]jadwal = new String[n][4];
        System.out.println("\nINPUT DATA JADWAL");
        System.out.println("==============================");

        for (int i = 0; i < n; i++) {
            System.out.println("Data jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah: ");
            jadwal[i][3] = sc.nextLine();
            System.out.println();
        }
        System.out.println("======================================");
        System.out.println("SELURUH JADWAL KULIAH");
        System.out.println("======================================");
        tampilkanSemuaJadwal(jadwal);
        System.out.println("\n======================================");
        System.out.println("CARI JADWAL BERDASARKAN HARI");
        System.out.println("======================================");
        System.out.print("Masukkan hari yang ingin dicari: ");
        String cariHari = sc.nextLine();
        tampilkanJadwalBerdasarkanHari(jadwal, cariHari);
        System.out.println("\n======================================");
        System.out.println("CARI JADWAL BERDASARKAN NAMA MK");
        System.out.println("======================================");
        System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
        String cariMK = sc.nextLine();
        tampilkanJadwalBerdasarkanMK(jadwal, cariMK);
        sc.close();
    }
    static void tampilkanSemuaJadwal(String[][]jadwal) {
        System.out.println("No | Mata Kuliah | Ruang | Hari | Jam");
        System.out.println("------------------------------------------");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.println((i + 1) + "  | " + jadwal[i][0] + " | " + jadwal[i][1] + " | " + jadwal[i][2] + " | " + jadwal[i][3]);
        }
    }
    static void tampilkanJadwalBerdasarkanHari(String[][]jadwal, String hari) {
        boolean ada = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println("Mata Kuliah: " + jadwal[i][0]);
                System.out.println("Ruang      : " + jadwal[i][1]);
                System.out.println("Hari       : " + jadwal[i][2]);
                System.out.println("Jam        : " + jadwal[i][3]);
                System.out.println("----------------------------");
                ada = true;
            }
        }

        if (ada == false) {
            System.out.println("Jadwal pada hari " + hari + " tidak ditemukan.");
        }
    }
    static void tampilkanJadwalBerdasarkanMK(String[][] jadwal, String mk) {
        boolean ada = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("Mata Kuliah: " + jadwal[i][0]);
                System.out.println("Ruang      : " + jadwal[i][1]);
                System.out.println("Hari       : " + jadwal[i][2]);
                System.out.println("Jam        : " + jadwal[i][3]);
                ada = true;
            }
        }

        if (ada == false) {
            System.out.println("Mata kuliah " + mk + " tidak ditemukan.");
        }
    }
}
