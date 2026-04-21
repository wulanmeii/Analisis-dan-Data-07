public class ItemPesanan {
    private final Produk produk;
    private final Integer jumlah;

    public ItemPesanan(Produk produk, Integer jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public Produk getProduk() { return produk; }
    public Double hitungSubTotal() {
        return produk.getHarga() * jumlah;
    }
}
