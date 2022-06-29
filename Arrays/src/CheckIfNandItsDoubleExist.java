public class CheckIfNandItsDoubleExist {
    public static boolean checkIfExist(int[] arr) {
        if (arr == null | arr.length == 0) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i])) {
                    System.out.printf("arr[i]: %d, arr[j]: %d\n", arr[i], arr[j]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        boolean exists = checkIfExist(arr);
        System.out.println(exists);
    }
}
