public class AddBinary {
    public static String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }


    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String result = addBinary(a, b);
        System.out.printf("%s + %s = %s\n", a, b, result);
    }
}
