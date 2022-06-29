import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        if (nums == null) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num: nums) {
            numSet.add(num);
        }

        Object[] numsNoDuplicates = new Object[numSet.size()];
        System.arraycopy(numSet.toArray(), 0, numsNoDuplicates, 0, numSet.size());
        Arrays.sort(numsNoDuplicates);

        int index;
        if (numsNoDuplicates.length > 2) {
            index = numsNoDuplicates.length - 3;
        } else {
            index = numsNoDuplicates.length - 1;
        }
        return (int) numsNoDuplicates[index];
    }

    public static void main(String[] args) {
        int[] arr = {Integer.MIN_VALUE, 1, 2};
        System.out.println(thirdMax(arr));
    }
}
