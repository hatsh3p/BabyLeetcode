public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }

        boolean isIncreasing;
        boolean reachedPeak = false;

        if (arr[0] < arr[1]) {
            isIncreasing = true;
        } else {
            return false;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1] || isIncreasing && reachedPeak) {
                return false;
            }
            if (isIncreasing && !reachedPeak) {
                if (arr[i] < arr[i - 1]) {
                    isIncreasing = false;
                    reachedPeak = true;
                }
            }
            if (!isIncreasing) {
                if (arr[i] > arr[i - 1]) {
                    isIncreasing = true;
                }
            }
        }
        return !isIncreasing;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean isMountainArray = validMountainArray(arr);
        System.out.println(isMountainArray);
    }
}
