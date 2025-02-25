import java.util.regex.*;
import java.util.*;


public class NumbersStartingWith1 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("123", "456", "1789", "102", "567", "1", "19", "99", "1001");
        
        for (String num : numbers) {
            if (num.startsWith("1")) {
                System.out.println("Number Found: " + num);
            }
        }
    }
}

