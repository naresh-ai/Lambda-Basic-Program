package Lambda_Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaQ4
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(666);
        list.add(15);
        list.add(12);
        list.add(22);
        list.add(35);
        list.add(38);
        list.add(90);
        list.add(78);
        System.out.println(list);
        List<Integer> EvenNumber = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        List<Integer> OddNumber = list.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());
        System.out.println("even elements = " + OddNumber);
        System.out.println("even elements = " + EvenNumber);
    }
}
