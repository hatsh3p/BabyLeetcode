import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        if (arr == null) {
            return null;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int max_right = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max_right) {
                    max_right = arr[j];
                }
            }
            arr[i] = max_right;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        arr = replaceElements(arr);
        System.out.println(Arrays.toString(arr)); // Expected result: [18, 6, 6, 6, 1, -1]
    }
}
