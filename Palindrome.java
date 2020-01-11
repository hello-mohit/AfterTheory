package AfterTheory;

import javax.crypto.spec.PSource;

public class Palindrome {
    public void isPalindrome(String stringToCheck) {
        StringBuffer reversedString = new StringBuffer();
        for (int i = stringToCheck.length() - 1; i >= 0; i--) {
            reversedString = reversedString.append(stringToCheck.charAt(i));
        }
        System.out.println(reversedString);
        if (stringToCheck.equals(reversedString.toString()))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not Palindrome");
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.isPalindrome("MadaM NursesruN MadaM");
    }
}
