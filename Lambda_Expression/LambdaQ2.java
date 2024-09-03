package Lambda_Expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
public class LambdaQ2
{

    //Sort Str Collection && min and Max
    public static void main(String[] args)
    {

        List<String> names = Arrays.asList("Rana", "Washim", "Pune", "Rajgad");


        Collections.sort(names, (String a, String b) -> a.length() - b.length());

        System.out.println(names);

        ArrayList<Integer>List =new ArrayList<>();
        List.add(167);
        List.add(2);
        List.add(39);
        List.add(4);
        List.add(509);
        System.out.println(List);

        Integer m=List.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("Minium Number "+m);
        Integer M=List.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("Maximum Number"+M);


    }
}


