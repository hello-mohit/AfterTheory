package AfterTheory;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Ocurrence {
    public void checkOccurrence(String occurrenceCheckString) {
        String modifiedOccurrenceCheckString = occurrenceCheckString.toUpperCase().replaceAll(" ", "");
        HashMap<Character, Integer> occurrence = new HashMap<Character, Integer>();
        for (int i = 0; i < modifiedOccurrenceCheckString.length(); i++) {
            if (occurrence.get(modifiedOccurrenceCheckString.charAt(i)) == null) {
                occurrence.put(modifiedOccurrenceCheckString.charAt(i), 1);
            } else {
                occurrence.put(modifiedOccurrenceCheckString.charAt(i), occurrence.get(modifiedOccurrenceCheckString.charAt(i)) + 1);
            }
        }
        System.out.println(occurrence);
    }

    public static void main(String[] args) {
        Ocurrence obj = new Ocurrence();
        obj.checkOccurrence("Oddles Technologies 123");

    }
}
class MyComprator implements Comparator<Character>{


    @Override
    public int compare(Character o1, Character o2) {
        if(o1>o2){
            return -1;
        }if(o1<o2){
            return 1;
        }else
            return 0;
    }
}