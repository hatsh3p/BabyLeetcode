import java.util.Arrays;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int currentSum = numbers[low] + numbers[high];
            if (currentSum == target) {
                return new int[]{low + 1, high + 1};
            } else if (currentSum > target) {
                --high;
            } else {
                ++low;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(arr1, target1);
        System.out.println(Arrays.toString(result1));

        int[] arr2 = {2, 3, 4};
        int target2 = 6;
        int[] result2 = twoSum(arr2, target2);
        System.out.println(Arrays.toString(result2));

        int[] arr3 = {-1, 0};
        int target3 = -1;
        int[] result3 = twoSum(arr3, target3);
        System.out.println(Arrays.toString(result3));
    }
}
