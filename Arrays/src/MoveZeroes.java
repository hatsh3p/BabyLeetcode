import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }

        int count = 0;
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == 0) {
                ++count;
            } else if (count > 0) {
                swap(nums, i, i - count);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,4,0,0,3,0,5,1,0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums)); // Expected: [1, 3, 12, 0, 0]
    }
}
