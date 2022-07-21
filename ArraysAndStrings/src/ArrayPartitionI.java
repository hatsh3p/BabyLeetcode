import java.util.Arrays;

public class ArrayPartitionI {
    public static int arrayPairSum(int[] nums) {
        // check if nums is empty or not even or null
        if (nums.length == 0 || nums.length % 2 != 0 || nums == null) {
            return 0;
        }

        int sum = 0;

        Arrays.sort(nums);

        int i = 0;
        int j = 1;

        while (j < nums.length) {
            sum += Math.min(nums[i], nums[j]);
            System.out.println(sum);
            i += 2;
            j += 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 8, 7};
        int max = arrayPairSum(arr);
        System.out.println(max);
    }
}
