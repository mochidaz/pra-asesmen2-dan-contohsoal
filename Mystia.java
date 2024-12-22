
// Mystia ingin menjual belut bakarnya. Ia ingin membuat tabel menu yang ngesort dari harga termurah ke tertinggi. 
//Kemudian harus ada fitur searching

// Menu:
// Belut bakar sambel: 13.000
// Belut goreng: 15.000
// Belut kukus: 16.000
// Belut mentah: 5.000


public class Mystia {
    public static void main(String[] args) {
        String[] arr1 = new String[] {
            "Belut bakar sambel",
            "Belut kukus",
            "Belut goreng",
            "Belut mentah"
        };

        int[] arr2 = new int[] {
            13000,
            16000,
            15000,
            5000
        };

        bubbleSort(arr1, arr2);

        for (int i = 0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    private static void bubbleSort(String arr1[], int arr2[]) {
        boolean tukar;
        int temp;
        String temp2;

        for (int i = 0; i<arr2.length; i++) {
            tukar = false;
            for (int j = 0; j<arr2.length - i - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {

                    temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;

                    temp2 = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp2;

                    tukar = true;
                }
            }

            if (tukar == false) {
                break;
            }
        }
    }
}
