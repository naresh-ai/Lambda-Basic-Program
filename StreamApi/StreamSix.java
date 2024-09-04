package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSix {
    public static void main(String[] args) {
        List<String> aa=new ArrayList<>();
        aa.add("Ok");
        aa.add("Nagpur");
        aa.add("Nahagaon");
        aa.add("Omkareshwar");
        aa.add("ok");
        System.out.println("\n"+aa);
        aa.stream().distinct().forEach(System.out::println);
        aa.stream().skip(2).distinct().forEach(System.out::println);
        System.out.println(aa);
    }
}
