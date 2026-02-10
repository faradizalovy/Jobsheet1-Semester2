import java.util.Scanner;

public class perulangan09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan 2 digit terakhir NIM: ");
        int n = sc.nextInt();

        if (n < 10) {
            n = n + 10;
        }
        System.out.println("\nOutput: ");
        
        for (int i = 1; i <= n; i++) {      
            if (i != 10 && i != 15) {
                if (i % 3 == 0) {
                    System.out.print("# ");
                } else if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }
        sc.close();

    }
}
