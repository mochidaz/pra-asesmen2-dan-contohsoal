// Pakai modulus buat keadaan lampu. Modulusnya 4

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        int[] array = new int[N];

        for (int i = 0; i<N; i++) {
            array[i] = s.nextInt();
        }

        for (int i = 0; i<N; i++) {
            int keadaanLampu = array[i] % 4;

            switch(keadaanLampu) {
                case 0:
                    System.out.println("MATI MATI");
                    break;
                case 1:
                    System.out.println("HIDUP MATI");
                    break;
                case 2:
                    System.out.println("HIDUP HIDUP");
                    break;
                case 3:
                    System.out.println("MATI HIDUP");
                    break;
            }
        }
    }
}