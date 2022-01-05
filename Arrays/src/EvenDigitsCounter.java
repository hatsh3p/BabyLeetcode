public class EvenDigitsCounter {
    public static int counter(int[] nums) {
        int evenCount = 0;
        for (int n : nums) {
            int result = n;
            int digits = 0;
            while (result > 0) {
                result = result / 10;
                ++digits;
            }
            if (digits % 2 == 0) {
                ++evenCount;
            }
        }
        return evenCount;
    }
    public static void main(String[] args) {
        int[] arr1 = {12, 345, 2, 6, 7896};
        int count1 = counter(arr1);
        System.out.println(count1);

        int[] arr2 = {555, 901, 482, 1771};
        int count2 = counter(arr2);
        System.out.println(count2);
    }
}
