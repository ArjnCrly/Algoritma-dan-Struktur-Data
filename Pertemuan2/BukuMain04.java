package Pertemuan2;

    public class BukuMain04 {

        public static void main(String[] args) {
            // Buku04 bk1 = new Buku04();
            // bk1.judul = "Today Ends Tomorrow Comes";
            // bk1.pengarang = "Denandra Pratiwi";
            // bk1.halaman = 198;
            // bk1.stok = 13;
            // bk1.harga = 71000;

            // bk1.tampilInformasi();
            // bk1.terjual(5);
            // bk1.gantiHarga(60000);
            // bk1.tampilInformasi();

            Buku04 bk2 = new Buku04("Self Reward", "Maheera Ayesha", 160, 29, 59000, 2);
            bk2.terjual(11);
            bk2.tampilInformasi();
            
            Buku04 bukuArjuna = new Buku04("Atomic Habits", "James clear", 340, 10, 11000000, 3);
            bukuArjuna.terjual(1);
            bukuArjuna.tampilInformasi();
        }
    }

