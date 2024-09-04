package Lambda_Expression;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class StreamQ15 {
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("List"+nums);

        System.out.println("Even nums => ");

        nums.stream().filter(n-> n%2==0).forEach(n-> System.out.print(STR."\{n} "));
        System.out.println();

        System.out.println("Odd nums => ");

        nums.stream().filter(n-> n%2!=0).forEach(n-> System.out.print(STR."\{n} "));
    }
}
