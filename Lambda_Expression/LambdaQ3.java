package Lambda_Expression;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class LambdaQ3
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("My");
        list.add("Name");
        list.add("Naresh");
        list.add("what's");
        list.add("Your");
        list.add("Name");
        System.out.println(list);
        List<String> Obj = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(Obj);
        List<String> obj1 = list.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println(obj1);


    }
}
