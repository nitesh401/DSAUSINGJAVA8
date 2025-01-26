import java.util.*;
import java.util.stream.Collectors;

public class wordLengthMap {
    public static void main(String[] args) {
 List<String> words = Arrays.asList("one", "two", "three");
        Map<String, Integer> wordLengthMap = words.stream()
            .collect(Collectors.toMap(word -> word, String::length));
        String output = wordLengthMap.entrySet()
            .stream()
            .map(entry -> entry.getKey() + ":" + entry.getValue())
            .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(output);
    }
}