package Pertemuan6;

/**
 * Mahasiswa04
 */
public class Mahasiswa04 {

    public String nama;
    public int thnMasuk, umur;
    public double ipk;
    
    public Mahasiswa04(String n, int t, int u, double i)
    {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    public void tampil()
    {
        System.out.println("Nama: "+ nama);
        System.out.println("Tahun Masuk: "+ thnMasuk);
        System.out.println("Umur: "+ umur);
        System.out.println("IPK: "+ ipk);
    }
    
}