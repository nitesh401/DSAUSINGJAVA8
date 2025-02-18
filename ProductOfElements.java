import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductOfElements {
      public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        // Calculate the product of all elements using Collectors.reducing

        int product = numbers.stream()

                             .collect(Collectors.reducing(1, (a, b) -> a * b));


        System.out.println("Product of all elements: " + product);

    }
}
