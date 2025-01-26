import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class findFirstNonRepeatingCharacter {
     public static void main(String[] args) {
        String input = "iindia";
        Optional<Character> result = firstNonRepeatativeCharacter(input);
        result.ifPresentOrElse(
            c -> System.out.println("First non-repeating character: " + c),
            () -> System.out.println("No non-repeating character found")
        );
    }
     public static Optional<Character> firstNonRepeatativeCharacter(String s) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        s.chars().mapToObj(c -> (char) c)
            .forEach(c -> 
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1)
            );
        return charCountMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst();
    }
}
