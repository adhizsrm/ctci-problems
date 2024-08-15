import java.util.Arrays;

/**
 * Problem 1.2: Check Permutation:
 * Given two strings, write a method to decide if one is a permutation of the other.
 */
public class MainOne2 {
    public static boolean isPermutation(String str, String str2) {
        char[] strArray = str.toCharArray();
        Arrays.sort(strArray);
        String sortedArray = new String(strArray);
        strArray = str2.toCharArray();
        Arrays.sort(strArray);
        String sortedArrayTwo = new String(strArray);
        if (sortedArray.equals(sortedArrayTwo)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPermutationTwo(String str, String str2) {
        int[] radixxOne = new int[255];
        int[] radixxTwo = new int[255];
        for (int i = 0; i < str.length(); i++) {
            radixxOne[str.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            radixxTwo[str2.charAt(i)]++;
        }
        for (int i = 0; i < 255; i++) {
            if (radixxOne[i] != radixxTwo[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //System.out.println(isPermutation("GOD","ODG"));
        System.out.println(isPermutationTwo("GOD", "ODGsa"));
    }
}
