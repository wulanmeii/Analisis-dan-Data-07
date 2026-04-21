import java.util.ArrayList;
import java.util.List;

public class Pesanan {
    private final Integer idPesanan;
    private final String tanggalPemesanan;
    private final List<ItemPesanan> daftarItem; 

    public Pesanan(Integer idPesanan, String tanggalPemesanan) {
        this.idPesanan = idPesanan;
        this.tanggalPemesanan = tanggalPemesanan;
        this.daftarItem = new ArrayList<>();
    }

    public void tambahItem(ItemPesanan item) {
        daftarItem.add(item);
    }

    public Double hitungTotalHarga() {
        Double total = 0.0;
        for (ItemPesanan item : daftarItem) {
            total += item.hitungSubTotal();
        }
        return total;
    }

    public void tampilkanSemuaItem() {
        System.out.println("ID Pesanan: " + idPesanan + " | Tanggal: " + tanggalPemesanan);
        for (ItemPesanan item : daftarItem) {
            System.out.println("- " + item.getProduk().getNama() + " (" + item.hitungSubTotal() + ")");
        }
    }

    public String getTanggalPemesanan() { return tanggalPemesanan; }
    public Integer getIdPesanan() { return idPesanan; }
}
