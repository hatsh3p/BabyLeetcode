import java.util.Arrays;

public class ReverseStuff {
    public static void reverseInt(int[] arr, int length) {
        int i = 0;
        int j = length - 1;

        while (i < j) {
            swapInt(arr, i, j);
            ++i;
            --j;
        }
    }

    public static void swapInt(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseString(char[] s, int length) {
        int i = 0;
        int j = length - 1;

        while (i < j) {
            swapChar(s, i++, j--);
        }
    }

    public static void swapChar(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,4, 5, 6, 7, 8, 9};
        reverseInt(arr, arr.length);
        System.out.println(Arrays.toString(arr));

        String string = "Howdy folks!";
        char[] arr2 = string.toCharArray();
        reverseString(arr2, arr2.length);
        System.out.println(Arrays.toString(arr2));
    }
}
