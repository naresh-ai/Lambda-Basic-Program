package Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class StreamQ17 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("list is => \n"+ nums);

        int max = nums.stream()
                .max(Integer::compare)
                .orElse(null);

        int min = nums.stream()
                .min(Integer::compare)
                .orElse(null);

        System.out.println("max num => "+max+"\nmin is => "+min);


    }
}
