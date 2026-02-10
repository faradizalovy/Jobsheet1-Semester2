import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[]mk = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double[]nilaiAngka = new double[mk.length];
        String[]nilaiHuruf = new String[mk.length];
        double[]bobotNilai = new double[mk.length];

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < mk.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
            bobotNilai[i] = konversiBobot(nilaiAngka[i]);
        }

        double totalBobot = 0;
        for (int i = 0; i < mk.length; i++) {
            totalBobot = totalBobot + bobotNilai[i];
        }
        double ip = totalBobot / mk.length;

        System.out.println("==============================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("==============================");

        for (int i = 0; i < mk.length; i++) {
        System.out.println("MK          : " + mk[i]);
        System.out.println("Nilai Angka : " + nilaiAngka[i]);
        System.out.println("Nilai Huruf : " + nilaiHuruf[i]);
        System.out.println("Bobot Nilai : " + bobotNilai[i]);
        System.out.println("--------------------------------");
        }

        System.out.println("==============================");
        System.out.println("IP : " + ip);

        sc.close();
    }

    static String konversiNilaiHuruf(double nilai) {
        if (nilai > 80 && nilai <= 100) {
            return "A";
        } else if (nilai > 73 && nilai <= 80) {
            return "B+";
        } else if (nilai > 65 && nilai <= 73) {
            return "B";
        } else if (nilai > 60 && nilai <= 65) {
            return "C+";
        } else if (nilai > 50 && nilai <= 60) {
            return "C";
        } else if (nilai > 39 && nilai <= 50) {
            return "D";
        } else {
            return "E";
        }
    }


    static double konversiBobot(double nilai) {
        if (nilai > 80 && nilai <= 100) {
            return 4.0;
        } else if (nilai > 73 && nilai <= 80) {
            return 3.5;
        } else if (nilai > 65 && nilai <= 73) {
            return 3.0;
        } else if (nilai > 60 && nilai <= 65) {
            return 2.5;
        } else if (nilai > 50 && nilai <= 60) {
            return 2.0;
        } else if (nilai > 39 && nilai <= 50) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}