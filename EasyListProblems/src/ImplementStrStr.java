public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) {
                    return i;
                }
                if (i + j == haystack.length()) {
                    return -1;
                }
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String haystack1 = "hello";
        String needle1 = "ll";
        int index1 = strStr(haystack1, needle1);
        System.out.printf("The needle string was found at index: %d", index1);
    }
}
