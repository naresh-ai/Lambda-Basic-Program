package Lambda_Expression;


import java.util.Arrays;
import java.util.List;

public class StreamQ14 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        double number = nums.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println(STR."avg of List is :- \{number}");
    }

}