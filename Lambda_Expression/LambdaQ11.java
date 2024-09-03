package Lambda_Expression;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaQ11
{
    public static void main(String[] args)
    {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(99);
        numbers.add(8970);
        numbers.add(23330);
        numbers.add(440);
        numbers.add(54330);
        numbers.add(440);
        System.out.println(numbers);
        numbers.stream().filter(num -> num > 25).forEach(System.out::println);
        List <Integer> OBJ= (List<Integer>) numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(OBJ);
    }
}

