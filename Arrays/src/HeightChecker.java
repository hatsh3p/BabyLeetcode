import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        if (heights == null) {
            return 0;
        }

        int mismatch = 0;
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                ++mismatch;
            }
        }

        return mismatch;
    }

    public static void main(String[] args) {
        int[] heights = {5, 1, 2, 3, 4};
        int mismatch = heightChecker(heights);
        System.out.println(mismatch);
    }
}
