package Pertemuan3;

/**
 * PersegiPanjang
 */
import java.util.Scanner;
public class PersegiPanjang {
    public int panjang;
    public int lebar;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan Panjang Array: ");
    int ppArray = sc.nextInt();
    PersegiPanjang[] array = new PersegiPanjang[ppArray];

    for (int i = 0; i < ppArray; i++) {
        array[i] = new PersegiPanjang();
        System.out.println("Persegi Panjang ke- " + i);
        System.out.print("Masukkan Panjang: ");
        array[i].panjang = sc.nextInt();
        System.out.print("Masukkan Lebar: ");
        array[i].lebar = sc.nextInt();
    }
    for (int i = 0; i < 3; i++) {
        System.out.println("Persegi Panjang ke- " + i);
        System.out.println("Panjang: " + array[i].panjang + ", Lebar: " + array[i].lebar);
    }
}
}