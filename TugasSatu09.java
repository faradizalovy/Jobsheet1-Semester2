import java.util.Scanner;

public class TugasSatu09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]kode = {"A","B","D","E","F","G","H","L","N","T"};
        String[]kota = { "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL" };

        System.out.println("Program Kode Plat dan Kota");
        System.out.println("==============================");
        System.out.print("Masukkan kode plat: ");
        String input = sc.next();

        boolean ketemu = false;
        for (int i = 0; i < kode.length; i++) {
            if (input.equalsIgnoreCase(kode[i])) {
                System.out.println("Kota: " + kota[i]);
                ketemu = true;
            }
        }
        if (ketemu == false) {
            System.out.println("Kode plat tidak ditemukan.");
        }
        sc.close();
    }
}
