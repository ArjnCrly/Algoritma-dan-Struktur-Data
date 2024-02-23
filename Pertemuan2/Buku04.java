package Pertemuan2;
/**
 * Buku04
 */

public class Buku04 {

    Buku04() {
        
    }
    Buku04(String jud, String pg, int hal, int stok, int har,int jml) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
        jumlah = jml;

    }
    String judul, pengarang;
    int halaman, stok, harga, jumlah, hargaTotal, diskon;

    void tampilInformasi() {
        System.out.println("-----------------------------");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Harga Total: Rp " + hitungHargaTotal());
        System.out.println("Diskon: Rp " + hitungDiskon());
        System.out.println("Jumlah yang dibeli: " + jumlah);
        System.out.println("Harga yang dibayar: Rp " + hitungHargaBayar());
    }
    void terjual (int jml) {
        if (stok > 0) {
            stok -= jml;
        } 
    }
    void restock (int jml) {
        stok += jml;
    }
    void gantiHarga (int hrg) {
        harga = hrg;
    }
    int hitungHargaTotal () {
        return harga * jumlah;
    }
    int hitungDiskon () {
        if (hitungHargaTotal() > 150000) {
            diskon = (int)(0.12 * hitungHargaTotal());
        } else if (hitungHargaTotal()>75000) {
            diskon = (int)(0.05 * hitungHargaTotal());
        } else {
            diskon = 0;
        } 
        return diskon;
    }
    int hitungHargaBayar () {
        return harga * jumlah - hitungDiskon();
    }
}    