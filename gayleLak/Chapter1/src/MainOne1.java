import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Problem 1.1: Is Unique.
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structure.
 */
public class MainOne1 {
    public static boolean isUnique(String str) {
        char[] charArray = str.toCharArray();
        /* To keep track if that character has */
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /* O(nlogn) */
    public static boolean isUniqueTwo(String str) {
        SortedSet<String> ts = new TreeSet<String>();
        for (int i = 0; i < str.length(); i++) {
            if (ts.add(String.valueOf(str.charAt(i)))) {
                continue;
            }
            return false;
        }
        return true;
    }

    /* O(n) --- O(1) operations N times */
    public static boolean isUniqueThree(String str) {
        HashSet<String> ts = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (ts.add(String.valueOf(str.charAt(i)))) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static boolean isUniqueFour(String str) {
        int[] radixx = new int[255];
        for (int i = 0; i < str.length(); i++) {
            radixx[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (radixx[str.charAt(i)] > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean print = isUniqueFour("ABXDE");
        boolean print2 = isUniqueFour("ABADS");
        System.out.println(print + "\n" + print2);
    }
}