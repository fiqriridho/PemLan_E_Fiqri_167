public class coba {
    public static void main(String[] args) {
        String[] array = {"Adi", "Budi", "Cahyo", "Diana", "Eva"};
        int namaMax = 0;
        for (String nama : array) {
            if (nama.length() > namaMax) {
                namaMax = nama.length();
            }
        }
        System.out.println("Nama Terpanjang: ");
        for (String nama : array) {
            if (nama.length() == namaMax) {
                System.out.println("- "+nama);
            }
        }
    }
}