package Lambda_Expression;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.List;

public class StreamQ16 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,9,8,9,8,6,5,4,7,2,1,6,5,4,3,2,1,8,9,8,7,6,5);
        System.out.println("original List -> \n"+ nums);
        List<Integer> unq = nums.stream().distinct().toList();
        System.out.println("after removng Duplicate ->\n"+unq);
        System.out.println("after sorted -> \n"+unq.stream().sorted().toList());
    }
}
