import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] nama = {"Adi", "Budi", "Cahyo", "Diana", "Eva"};
        ArrayList<String> namaTerpanjang = cariNamaTerpanjang(nama);
        System.out.println("Nama Terpanjang Adalah: " + namaTerpanjang);
    }
    public static ArrayList<String> cariNamaTerpanjang(String[] array_nama){
        ArrayList<String> hasil = new ArrayList<>();
        int namaMax = 0;

        for (String nama : array_nama){
            if (nama.length()>namaMax){
                hasil.clear();
                hasil.add(nama);
                namaMax= nama.length();
            } else if (nama.length() == namaMax) {
                hasil.add(nama);
            }
        }return hasil;
    }
}