import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka Positif: ");
        try {
            int number = sc.nextInt();

            if (number <= 0) {
                throw new InvalidNumberException("Angka harus positif!");
            }
            System.out.println("Angka valid: " + number);
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Input harus angka!");
        }
    }
}