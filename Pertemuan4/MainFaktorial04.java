package Pertemuan4;

import java.util.Scanner;
public class MainFaktorial04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------"); 
        System.out.println("Masukkan Jumlah Elemen: ");
        int iJml = sc.nextInt();

        Faktorial04[] fk = new Faktorial04[iJml];
        for (int i = 0; i < iJml; i++) {
            fk[i] =  new Faktorial04();
            System.out.println("Masukkan nilai data ke-" +(i+1)+ ":");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
