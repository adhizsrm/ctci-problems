/**
 * String Rotation: Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one call to isSubstring
 * (e.g., "waterbottle"is a rotation of"erbottlewat").
 */
public class MainOne9 {
    public static void main(String[] args) {
        String givenString = "waterbottle";
        String rotatedString = "bottlewater";
        rotatedString = rotatedString.concat(rotatedString);
        if (rotatedString.contains(givenString)) {
            System.out.println("is a substring");
        } else {
            System.out.println("Not a substring");
        }
    }
}
