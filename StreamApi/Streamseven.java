package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// data Filter Program
public class Streamseven {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,67,67,655,4334,90909);
        List<Integer>Filter=list.stream().filter(i->i%2==0).toList();
        System.out.println(Filter);
    }
}
