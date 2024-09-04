package StreamApi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamNine {
    //serach max number used filter
    public static void main(String[] args) {

        // double v = 9.9;
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        sc.nextInt();
        if (34>=0){
            System.out.println("Great");

        }else*/
        System.out.println("Best");
        List<Integer> obj = Arrays.asList(0, 20, 30, 6556, 78, 43, 56);
        List<Integer> max = obj.stream().filter(i -> i > 35).collect(Collectors.toList());
        System.out.println(obj);
        System.out.println(max);

        List<Integer> MaxNumber = obj.stream().filter(i -> i < 35).map(k -> k + 5).collect(Collectors.toList());
        System.out.println(MaxNumber);
    }
}
