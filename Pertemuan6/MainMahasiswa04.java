package Pertemuan6;
public class MainMahasiswa04 {

    public static void main(String[] args) {
        
        DaftarMahasiswaBerprestasi04 list = new DaftarMahasiswaBerprestasi04();
        Mahasiswa04 m1 = new Mahasiswa04("Nusa", 2017, 25, 3);
        Mahasiswa04 m2 = new Mahasiswa04("Rara", 2012, 19, 4);
        Mahasiswa04 m3 = new Mahasiswa04("Dompu", 2018, 19, 3.5);
        Mahasiswa04 m4 = new Mahasiswa04("Abdul", 2017, 23, 2);
        Mahasiswa04 m5 = new Mahasiswa04("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting desc Berdasarkan IPK: ");
        //list.bubbleSort();
        //list.selectionSort();
        list.insertionSort();
        list.tampil();

    }
    
}