package AfterTheory;
public class VowelsConsonant {
    public void countVowelsConsonant(String stringToCheck) {
        int vowelsCount = 0;
        int consonantCount = 0;
        String lowerCaseStringToCheck = stringToCheck.toLowerCase();
        for (int i = 0; i < stringToCheck.length(); i++) {
            if (lowerCaseStringToCheck.charAt(i) == 'a' || lowerCaseStringToCheck.charAt(i) == 'e' || lowerCaseStringToCheck.charAt(i) == 'i' || lowerCaseStringToCheck.charAt(i) == 'o' || lowerCaseStringToCheck.charAt(i) == 'u') {
                vowelsCount++;
            } else if (lowerCaseStringToCheck.charAt(i) != ' ' && lowerCaseStringToCheck.charAt(i) > 96 && lowerCaseStringToCheck.charAt(i) < 123) {
                consonantCount++;
            }
        }

        System.out.println("Vowels: " + vowelsCount + " Consonant: " + consonantCount);
    }

    public static void main(String[] args) {
        VowelsConsonant obj = new VowelsConsonant();
        obj.countVowelsConsonant("");
    }
}
