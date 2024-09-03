package Lambda_Expression;

import java.util.function.BiFunction;

public class LambdaQ9
{

        public static void main(String[] args)
        {

            BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + str2;

            String obj1= "Naresh";
            String  obj2= "Petkar";
            System.out.println(obj1 + "," +obj2);
            String result = concatenate.apply(obj1, obj2);

            System.out.println(result);
        }
    }

