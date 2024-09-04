package StreamApi;

import java.util.Arrays;
import java.util.List;

public class Stream11 {
    // used count
    public static void main(String[] args) {
        List <Integer>obj= Arrays.asList(1,2,3,3,455,677,54,32,12,34,678);
        System.out.println(obj);
        long countnuber=obj.stream().filter(i-> i>60).count();
        System.out.println(countnuber);

    }
}
