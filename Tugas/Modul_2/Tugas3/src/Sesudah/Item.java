package Sesudah;

// Mengimplementasikan interface
public class Item implements Dijual {

    //Encapsulate Field (3)
    private int id;
    private String nama; // Rename Variable (1)
    private double harga;
    private int stok;

    // Konstanta baru (2)
    public static final double DISCOUNT_RATE = 0.1;
    public static final int MINIMUM_STOK = 50;


    public Item(int id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Akibat Encapsulate Field
    public int getId()
    {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }


    // Extract Method (4) & Implementasi Interface
    @Override
    public double hitungHargaFinal() {
        // Inline Variable: Variabel 'finalharga' dihapus, langsung return (5)
        return getHarga() - (getHarga() * DISCOUNT_RATE);
    }

    // Extract Method (4): Logika pengecekan stok
    public void checkStockStatus() {
        if (getStok() < MINIMUM_STOK) {
            System.out.println("PERINGATAN: Stok item ini rendah!");
        } else {
            System.out.println("Status Stok: AMAN.");
        }
    }

    // Rename Method (1) & Method utama
    public void displayDetails() {
        double value = getStok() * getHarga();

        System.out.println("--- Detail Item (Kode Sesudah Refactor) ---");
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Harga: Rp. " + getHarga());
        System.out.println("Stok: " + getStok());
        System.out.println("Total Nilai Stok: Rp. " + value);

        System.out.println("Harga Jual Final: Rp. " + hitungHargaFinal());

        checkStockStatus();
    }
}