import java.util.Arrays;

public class RemoveElement {
    /* Removes ALL occurrences of the value. */
    // NEED TO USE SWAPPING INSTEAD OF SHIFTING THE ARRAY
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                swap(nums, i, j);
                --j;
            } else {
                ++count;
                ++i;
            }
        }
        return count;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        System.out.println(Arrays.toString(nums1));
        int val1 = 3;
        int result1 = removeElement(nums1, val1);
        System.out.println(Arrays.toString(nums1));
        System.out.printf("result1: %d\n", result1);

        int[] nums2 = {0,1,2,2,3,0,4,2};
        System.out.println(Arrays.toString(nums2));
        int val2 = 2;
        int result2 = removeElement(nums2, val2);
        System.out.println(Arrays.toString(nums2));
        System.out.printf("result2: %d\n", result2);

        int[] nums3 = {1, 1};
        System.out.println(Arrays.toString(nums3));
        int val3 = 3;
        int result3 = removeElement(nums3, val3);
        System.out.println(Arrays.toString(nums3));
        System.out.printf("result3: %d\n", result3);

        int[] nums4 = {3, 1};
        System.out.println(Arrays.toString(nums4));
        int val4 = 3;
        int result4 = removeElement(nums4, val4);
        System.out.println(Arrays.toString(nums4));
        System.out.printf("result4: %d\n", result4);

        int[] nums5 = {0,4,4,0,4,4,4,0,2};
        System.out.println(Arrays.toString(nums5));
        int val5 = 4;
        int result5= removeElement(nums5, val5);
        System.out.println(Arrays.toString(nums5));
        System.out.printf("result4: %d\n", result5);
    }
}
