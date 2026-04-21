import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Buat beberapa Produk
        Produk p1 = new Produk("P001", "Laptop Gaming", 15000000.0);
        Produk p2 = new Produk("P002", "Mouse Wireless", 300000.0);
        Produk p3 = new Produk("P003", "Keyboard Mekanik", 800000.0);

        // 2. Buat Pesanan pertama
        Pesanan pesanan1 = new Pesanan(101, "2023-10-27");
        pesanan1.tambahItem(new ItemPesanan(p1, 1));
        pesanan1.tambahItem(new ItemPesanan(p2, 2));

        // 3. Buat Pesanan kedua
        Pesanan pesanan2 = new Pesanan(102, "2023-10-28");
        pesanan2.tambahItem(new ItemPesanan(p3, 1));

        // 4. Masukkan ke DaftarPesanan (Map)
        DaftarPesanan daftar = new DaftarPesanan();
        daftar.tambahPesanan(pesanan1);
        daftar.tambahPesanan(pesanan2);

        // 5. Tampilkan Semua Pesanan
        System.out.println("=== SEMUA DAFTAR PESANAN ===");
        daftar.tampilkanDaftar();

        // 6. Test Fitur Cari berdasarkan ID (Poin 6)
        System.out.println("\n=== CARI PESANAN ID 101 ===");
        Pesanan hasilCariId = daftar.cariPesanan(101);
        if (hasilCariId != null) {
            System.out.println("Ditemukan: Pesanan tanggal " + hasilCariId.getTanggalPemesanan());
        }

        // 7. Test Fitur Generic Method: Cari berdasarkan Tanggal (Poin 7)
        System.out.println("\n=== CARI PESANAN TANGGAL 2023-10-27 ===");
        List<Pesanan> semuaPesanan = new ArrayList<>(Arrays.asList(pesanan1, pesanan2));
        List<Pesanan> hasilCariTgl = daftar.cariBerdasarkanTanggal(semuaPesanan, "2023-10-27");
        
        for (Pesanan p : hasilCariTgl) {
            System.out.println("Ditemukan Pesanan ID: " + p.getIdPesanan());
        }
    }
}

