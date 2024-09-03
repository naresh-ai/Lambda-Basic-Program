package Lambda_Expression;

import java.util.ArrayList;
import java.util.List;

public class LambdaQ8
{

    public static void main(String[] args)
    {


        List<String> list = new ArrayList<String>();
        list.add("Akola");
        list.add("Pune");
        list.add("Nagar");
        list.add("Manapa");

        list.forEach((n) -> System.out.println(n));
    }
}

