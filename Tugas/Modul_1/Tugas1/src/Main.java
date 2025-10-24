import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah angka harus lebih besar dari 0!");
            return; // hentikan program
        }

        int[] angka = new int[n];
        System.out.println("Masukkan angka-angka:");

        for (int i = 0; i < n; i++) {
            angka[i] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {   // diubah dari i=1 menjadi i=0
            total += angka[i];
        }

        double rataRata = (double) total / n;
        System.out.println("Rata-rata adalah: " + rataRata);

        scanner.close();
    }
}
