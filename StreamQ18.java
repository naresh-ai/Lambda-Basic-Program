package Lambda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamQ18 {
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("original List ->"+ nums);
        Optional<Integer> SecondSmallest = nums.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();

        System.out.println("second smallest num s => "+SecondSmallest.get());

        Integer secondLargest = nums.stream().distinct()

                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("second Largest is "+secondLargest);
    }
}
