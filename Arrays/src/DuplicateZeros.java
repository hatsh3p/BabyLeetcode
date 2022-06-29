import java.util.Arrays;

public class DuplicateZeros {
    // This feels like an inelegant solution but it works ¯\_(ツ)_/¯
    // Looked at solution and it seemed way more complicated than it needed to be
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1 ; j > i + 1; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                ++i;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3};
        duplicateZeros(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
