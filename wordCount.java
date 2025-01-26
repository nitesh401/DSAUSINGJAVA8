import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
public class wordCount {
    public static void main(String[] args) {
            String text = "this is string this is";
        Map<String, Long> wordCount = Arrays.stream(text.trim().split("\\s+"))
                                            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        wordCount.forEach((word, count) -> System.out.println(word + " - " + count));
    }
}
