package Lambda_Expression;
//Stream Api
// operation  perfrom process data-->sort,group,max,min,avg,filter

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// jdk ver-1.8
// java.util perfrom -->operation
// java.util perfrom operation --> files
// stream provided methods ->filter,map,flatmap,skip,disnit,limit
public class StreamQ13 {
    public static void main(String[] args) {


        List<String> obj = Arrays.asList("ram","nana","Naresh","sanket","Dev","Sam","ram","ola");

        obj.forEach(n-> System.out.print(STR."\{n} "));

        System.out.println();
        obj.stream().distinct().forEach(n-> System.out.print(STR."\{n} "));
    }
}