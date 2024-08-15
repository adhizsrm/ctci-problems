/**
 * Problem 1.3: URLify.
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: If implementing in Java, please use a character array so that you can perform this operation in place).
 * EXAMPLE
 * Input: "Mr John Smith    ",13
 * Output: "Mr%20John%20Smith".
 */
public class MainOne3 {
    /* Approach 1 */
    public static String stringManipulator(String str, int originalLength) {
        int whiteSpaceCounter = 0;
        /* Original String */
        char[] charArray = str.toCharArray();
        /* First Scan */
        for (int i = 0; i < originalLength; i++) {
            if (charArray[i] == 32) {
                whiteSpaceCounter++;
            }
        }
        /*   iteration 1
             * M r % 2 0 J o h n % 2  0 S   m  i   t   h
             * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
             ji
        */

        /* Second Scan */
        int i = charArray.length - 1;
        for (int j = originalLength - 1; j >= 0; j--, i--) {
            if (whiteSpaceCounter == 0) {
                break;
            }
            if (charArray[j] == 32) {
                charArray[i] = '0';
                charArray[i - 1] = '2';
                charArray[i - 2] = '%';
                i = i - 2;
                whiteSpaceCounter--;
            } else {
                charArray[i] = charArray[j];
            }
        }
        return new String(charArray);
    }

    /* Simple Approach */
    public static String urlIfy(String str, int trueLength) {
        int whitespaceCounter = 0;
        for (int i = 0; i < trueLength; i++) {
            char temp = str.charAt(i);
            if (temp == ' ') {
                whitespaceCounter++;
            }
        }
        int j = trueLength + whitespaceCounter * 2 - 1;
        char[] strArray = str.toCharArray();
        for (int i = trueLength - 1; i >= 0; i--) {
            if (strArray[i] == ' ') {
                strArray[j] = '0';
                strArray[j - 1] = '2';
                strArray[j - 2] = '%';
                j = j - 3;
                continue;
            }
            strArray[j] = strArray[i];
            j--;
        }
        return new String(strArray);
    }

    public static void main(String[] args) {
        System.out.println(urlIfy("Mr Adhishesh Madhusudhan    ", 24));
        //System.out.println(stringManipulator("Mr Adhishesh Madhusudhan",24));
        System.out.println(urlIfy("Mr John Smith    ",13));
        //System.out.println(stringManipulator("Mr John Smith    ",13));
    }
}
