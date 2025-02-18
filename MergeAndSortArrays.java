import java.util.Arrays;

import java.util.stream.Stream;

public class MergeAndSortArrays {

    public static void main(String[] args) {


        Integer[] array1 = {5, 3, 9, 1};

        Integer[] array2 = {3, 7, 1, 8};

        Integer[] result = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))

                                  .distinct()

                                  .sorted()

                                  .toArray(Integer[]::new);

        System.out.println("Merged and sorted distinct elements: " + Arrays.toString(result));

    }

}