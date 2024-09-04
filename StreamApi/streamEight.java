package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamEight {
    // Map program to use tranfrom elements of stream & return new stream


    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(10,20,30,40,50,60,400,450);
        List<Integer>f=list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(f);
        List<Integer>list1=list
                .stream()
                .map(i->i*2).toList();
        System.out.println(list1);

    }
}
