import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        String[] pecah = input.split(" ");

        String kodeEnkripsi = pecah[pecah.length - 1];

        String hasilEnkripsi = "";

        for (int i = 0; i<pecah.length - 1; i++) {
            if (i % 2 != 0) {
                String pembalikan = "";
                for (int j = pecah[i].length() - 1; j>=0; j--) {
                    pembalikan += pecah[i].charAt(j);
                }
                
                hasilEnkripsi += pembalikan + kodeEnkripsi + " ";
            } else {
                hasilEnkripsi += pecah[i] + kodeEnkripsi + " ";
            }
        }

        System.out.println(hasilEnkripsi);
    }
}
