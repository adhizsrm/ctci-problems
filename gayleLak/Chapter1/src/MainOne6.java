public class MainOne6 {
    public static void main(String[] args) {
        String result2 = compress("aabbaacc");
        System.out.println(result2.equals("aabbaacc") ? "Test case 2 PASS" : "Test case 2 FAIL");

        String result3 = compress("aabacccccccccc");
        System.out.println(result3.equals("a2b1a1c10") ? "Test case 3 PASS" : "Test case 3 FAIL");
    }

    public static String compress(String inputStr) {
        int count = 1;
        String str = "";
        char[] charArray = inputStr.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i == charArray.length - 1) {
                str += charArray[i - 1] + "" + count;
                break;
            }
            if (charArray[i] == charArray[i + 1]) {
                count++;
            } else {
                str += charArray[i] + "" + count;
                count = 1;
            }
        }
        if (str.length() < inputStr.length()) {
            return str;
        } else {
            return inputStr;
        }

    }
}
