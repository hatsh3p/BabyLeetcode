import java.util.*;

public class FindAllNumbersDisappearedInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNums = new ArrayList<>();
        HashMap<Integer, Boolean> statusNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            statusNums.put(nums[i], true);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!statusNums.containsKey(i)) {
                disappearedNums.add(i);
            }
        }
        return disappearedNums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
