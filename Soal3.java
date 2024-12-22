import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int amsyong = s.nextInt();

        int[] array = new int[n];

        for (int i = 0; i<n; i++) {
            array[i] = s.nextInt();
        }

        boolean selesai = false;

        for (int i = 0; i<array.length; i++) {
            selesai = false;
            for (int j = 0; j<array.length; j++) {
                if (array[i] == array[j]) {
                    continue;
                }

                if (array[i] + array[j] == amsyong) {
                    System.out.println((i + 1) + " " + (j + 1));
                    selesai = true;
                    break;
                }
            }

            if (selesai) {
                break;
            }
        }
    }
}
