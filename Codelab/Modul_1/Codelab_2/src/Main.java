import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukkan Usia Anda: ");
            int usia = sc.nextInt();

            if (usia <= 0 || usia >= 120) {
                throw new InvalidAgeException("Usia yang bener lah kocak");
            }

            System.out.println("Usia anda adalah: " + usia);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input harus angka!");
        }
    }
}