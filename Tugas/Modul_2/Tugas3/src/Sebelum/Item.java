package Sebelum;

public class Item {
    public int id;
    public String nm;
    public double hrg;
    public int stk;

    public Item(int id, String nm, double hrg, int stk) {
        this.id = id;
        this.nm = nm;
        this.hrg = hrg;
        this.stk = stk;
    }

    public void dispDetails() {
        double value = stk * hrg;
        double discount = 0.1;

        double finalPrc = hrg - (hrg * discount);

        System.out.println("--- Detail Sebelum.Item (Kode Awal) ---");
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nm);
        System.out.println("Harga: $" + hrg);
        System.out.println("Stok: " + stk);
        System.out.println("Total Nilai Stok: $" + value);
        System.out.println("Harga Jual Final: $" + finalPrc);

        if (stk < 50) {
            System.out.println("PERINGATAN: Stok item ini rendah!");
        } else {
            System.out.println("Status Stok: AMAN.");
        }
    }
}