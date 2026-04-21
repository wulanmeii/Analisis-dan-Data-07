public class Produk {
    private final String idProduk;
    private final String nama;
    private final Double harga;

    public Produk(String idProduk, String nama, Double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() { return nama; }
    public Double getHarga() { return harga; }
    public String getIdProduk() { return idProduk; }
}