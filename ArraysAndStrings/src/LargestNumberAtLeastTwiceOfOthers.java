public class LargestNumberAtLeastTwiceOfOthers {
    public static int dominantIndex(int[] nums) {
        if (nums == null) {
            return -1;
        }
        int max = 0;
        int second_max = 0;
        int max_index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second_max = max;
                max = nums[i];
                max_index = i;
            } else if (nums[i] < max && nums[i] > second_max) {
                second_max = nums[i];
            }
        }

        return (max >= 2 * second_max) ? max_index : -1;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(dominantIndex(nums));
    }
}
