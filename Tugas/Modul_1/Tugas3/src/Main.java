import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan nilai ujian akhir: ");
        int nilai = scanner.nextInt();

        String status;
        if (nilai >= 60) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }
        System.out.println("\n---Hasil Ujian---");
        System.out.println("Nama: " + nama);
        System.out.println("Status: " + status);

    }
}
