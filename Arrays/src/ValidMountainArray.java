public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }

        boolean increasing = arr[1] > arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return false;
            }
            if (increasing) {
                if (arr[i] < arr[i - 1]) {
                    increasing = false;
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    return false;
                }
            }
        }

        return !increasing;
    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 1};
        boolean isMountainArray = validMountainArray(arr);
        System.out.println(isMountainArray);
    }
}
