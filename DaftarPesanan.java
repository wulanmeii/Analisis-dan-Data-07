import java.util.*;

public class DaftarPesanan {
    private final Map<Integer, Pesanan> mapPesanan = new HashMap<>();

    public void tambahPesanan(Pesanan p) {
        mapPesanan.put(p.getIdPesanan(), p);
    }

    public Pesanan cariPesanan(Integer id) {
        return mapPesanan.get(id);
    }

    public void tampilkanDaftar() {
        for (Pesanan p : mapPesanan.values()) {
            p.tampilkanSemuaItem();
            System.out.println("Total Bayar: " + p.hitungTotalHarga());
            System.out.println("----------------------------");
        }
    }

    public <T extends Pesanan> List<T> cariBerdasarkanTanggal(List<T> listInput, String tgl) {
        List<T> hasilCari = new ArrayList<>();
        for (T item : listInput) {
            if (item.getTanggalPemesanan().equals(tgl)) {
                hasilCari.add(item);
            }
        }
        return hasilCari;
    }
}
