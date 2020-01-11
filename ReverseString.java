package AfterTheory;
public class ReverseString {
    public void reverse(String stringToReverse) {
        String[] splittedStringToReverse = stringToReverse.split(" ");
        char[] splittedStringreversedCharacter = new char[stringToReverse.length() + 1];
        int splittedStringreversedCharacterIndex = 0;
        for (int i = 0; i < splittedStringToReverse.length; i++) {
            for (int j = splittedStringToReverse[i].length() - 1; j >= 0; j--) {
                splittedStringreversedCharacter[splittedStringreversedCharacterIndex] = splittedStringToReverse[i].charAt(j);
                splittedStringreversedCharacterIndex++;
            }
            splittedStringreversedCharacter[splittedStringreversedCharacterIndex] = ' ';
            splittedStringreversedCharacterIndex++;
        }
        String reversedString = new String(splittedStringreversedCharacter);
        System.out.println(reversedString.trim());
    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.reverse("Rev the String");
    }
}
