package Pertemuan4;

/**
 * Faktorial04
 */
public class Faktorial04 {
    public int nilai;

    int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while (fakto <= n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }
    int faktorialDC(int n) { 
        if (n==1) {
            return 1;
        }
        else{
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}