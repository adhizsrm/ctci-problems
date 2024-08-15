/**
 * One Away: There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
 * Example:
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
public class MainOne5 {
    public static boolean isOneEdit(String originalString, String comparisionString) {
        int characterCount = 0;
        /* 3rd case */
        if (originalString.length() == comparisionString.length()) {
            char[] originalCharArray = originalString.toCharArray();
            char[] comparisionCharArray = comparisionString.toCharArray();
            for (int i = 0; i < originalCharArray.length; i++) {
                if (originalCharArray[i] == comparisionCharArray[i]) {
                    characterCount++;
                }
            }
            if (characterCount == originalCharArray.length - 1 || characterCount == originalCharArray.length) {
                return true;
            } else {
                return false;
            }
        }

        if (originalString.length() > comparisionString.length()) {
            return (calculateStringDifference(originalString, comparisionString) == 1);
        } else {
            return (calculateStringDifference(comparisionString, originalString) == 1);
        }
    }

    public static int calculateStringDifference(String str1, String str2) {
        int characterCountDiff = 0;

        // Maintain character count of first string.
        int[] radixx = new int[255];

        for (char c : str1.toCharArray()) {
            radixx[c]++;
        }

        // Subtract the second string from the first string.
        for (char c : str2.toCharArray()) {
            radixx[c]--;
        }

        // Add the characters
        for (int i = 0; i < 255; i++) {
            if (radixx[i] == 1) {
                characterCountDiff++;
            }
        }

        return characterCountDiff;
    }

    public static void main(String[] args) {
        boolean result = isOneEdit("pal", "pale");
        System.out.println(result);
    }
}
