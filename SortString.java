import java.util.stream.Collectors;

public class SortString {
    public static void main(String[] args) {
        String input = "zebra";
        String sortedString = input.chars() 
            .mapToObj(c -> (char) c) 
            .sorted() 
            .map(String::valueOf) 
            .collect(Collectors.joining()); 

        System.out.println("Original: " + input);
        System.out.println("Sorted: " + sortedString);
    }
}
