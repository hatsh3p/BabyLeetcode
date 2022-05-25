import java.util.Arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        if (nums == null) {
            return null;
        }

        int right = 0;
        int left = nums.length - 1;

        while (right < left) {
            if (isEven(nums[right])) {
                ++right;
            }
            if (!isEven(nums[left])) {
                --left;
            } else if (!isEven(nums[right]) && isEven(nums[left])) {
                swap(nums, right++, left--);
            }
        }
        return nums;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 6, 8, 9, 1, 2, 0, 0, 0};
        nums = sortArrayByParity(nums);
        System.out.println(Arrays.toString(nums));
    }
}
