package Pertemuan3;

public class Segitiga {
    public int alas;
    public int tinggi;
    public int sisiMiring;

    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
        sisiMiring = (int) Math.sqrt(alas*alas + tinggi*tinggi);
    }

    public int hitungLuas() {
        return (alas * tinggi) / 2;
    }
    
    public int hitungKeliling() {       
        return alas + tinggi + sisiMiring;  
    }

    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("Luas Segitiga ke " + i + ": " + sgArray[i].hitungLuas());
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Keliling Segitiga ke " + i + ": " + sgArray[i].hitungKeliling());
        }
    }
}
