import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class CharacterFrequency {
      public static void main(String[] args) {
        String input = "aaabbccc";
        Map<Character, Long> frequencyMap = 
         input.chars()
           .mapToObj(c -> (char) c)
           .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        frequencyMap.forEach((character, frequency) -> System.out.println(character + "=" + frequency));
    }
}
