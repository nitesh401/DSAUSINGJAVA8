import java.util.List;
import java.util.stream.Collectors;
public class SpecialCharactersFinder {
        public static void main(String[] args) {
        String input = "Hello, World! 123 #Java$Stream";
        List<Character> specialCharacters = input.chars()
            .mapToObj(c -> (char) c)
            .filter(c -> !Character.isLetterOrDigit(c))
            .collect(Collectors.toList());
        System.out.println("Special characters: " + specialCharacters);
    }
}