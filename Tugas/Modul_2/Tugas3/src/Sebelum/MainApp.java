package Sebelum;

public class MainApp {
    public static void main(String[] args) {
        Item product = new Item(101, "Mouse Gaming", 250000.0, 35);

        product.dispDetails();

        product.stk += 10;
        System.out.println("\nStok diperbarui secara manual: " + product.stk);
        product.dispDetails();
    }
}
