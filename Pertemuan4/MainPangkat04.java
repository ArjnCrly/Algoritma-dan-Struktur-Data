package Pertemuan4;

import java.util.Scanner;

public class MainPangkat04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.print("Masukkan Jumlah Elemen Yang Dihitung: ");
        int elemen = sc.nextInt();

        Pangkat04[] png = new Pangkat04[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Nilai Yang Hendak Dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan Nilai Pemangkat: ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat04(nilai, pangkat);
        }

        System.out.println("Silahkan Pilih Metode Pangkat");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;

            default:
                break;
        }
    }
}
