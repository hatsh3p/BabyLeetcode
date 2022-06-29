public class LinearSearch {
    public static boolean linearSearch(int[] array, int value) {
        if (array == null || array.length == 0) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //int[] nums = {58, 19, 2, 3, 39};
        int[] nums = null;
        int value = 1;
        boolean found = linearSearch(nums, value);
        System.out.println(found);
    }
}
