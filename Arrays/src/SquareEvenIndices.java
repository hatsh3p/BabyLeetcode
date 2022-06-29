import java.util.Arrays;

public class SquareEvenIndices {
    public static int[] squareEven(int[] array, int length) {
        if (array == null) {
            return array;
        }

        for (int i = 0; i < length; i = i + 2) {
            array[i] = (int) Math.pow(array[i], 2.0);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        array = squareEven(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}
