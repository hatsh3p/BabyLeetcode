import java.util.Arrays;

/* This question is a subpart of the MergeSort Algorithm, merge, where two sorted array are merged. */
/* Resource: https://www.programiz.com/dsa/merge-sort */
public class MergeSortedArray {

    public static void shift_right(int[] nums, int index) {
        for (int i = nums.length - 1; i > index; i--) {
            nums[i] = nums[i - 1];
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 0 || nums2.length == 0 || n == 0) {
            return;
        }

        int i = 0, j = 0, k = 0;
        while (i < nums1.length && k < nums2.length) {
            if (nums1[j] < nums2[k] && m > 0) {
                j++;
                m--;
            } else if (nums1[j] == nums2[k]) {
                shift_right(nums1, j);
                nums1[j] = nums2[k];
                j++;
                k++;
            } else {
                if (m > 0) {
                    shift_right(nums1, j);
                }
                nums1[j] = nums2[k];
                j++;
                k++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 0 , 0, 0};
        int arr2[] = {2, 5, 6};

        System.out.println(Arrays.toString(arr1));

        merge(arr1, 3, arr2, 3);

        System.out.println(Arrays.toString(arr1));
    }
}
