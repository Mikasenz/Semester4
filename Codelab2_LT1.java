import java.util.ArrayList;

public class Codelab2_LT1 {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();

        daftarNama.add("mamat");
        daftarNama.add("arka");
        daftarNama.add("eka");
        daftarNama.add("iman");

        System.out.println("Daftar Nama: ");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }

        System.out.println("Elemen pada indeks 2:" + daftarNama.get(2));

        daftarNama.set(1,"ucup");

        System.out.println("Daftar Nama setelah perubahan:");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }

        daftarNama.remove(0);

        System.out.println("Daftar Nama setelah penghapusan: ");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }

        System.out.println("jumlah elemen dalam ArrayList: " + daftarNama.size());
        System.out.println("Apakah ArrayList kosong? " + daftarNama.isEmpty());


    }
}
