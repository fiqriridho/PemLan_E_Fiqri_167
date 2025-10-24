package Sesudah;

public class MainApp {
    public static void main(String[] args) {
        Item product = new Item(101, "Mouse Gaming", 250000.0, 35);

        // Memanggil method yang sudah di Rename
        product.displayDetails();

        // Mengakses field menggunakan setter dan getter karena sudah melakukan Encapsulate Field
        product.setStok(product.getStok() + 10);

        System.out.println("\nStok diperbarui menggunakan setter. Stok baru: " + product.getStok());
        product.displayDetails();
    }
}