package StreamApi;

import java.util.stream.Stream;

public class StreamThree {
    public static void main(String[] args) {
        Stream<Object> ss = Stream.empty();
        String names[] = {"NANA,kjk,HDFC"};
        Stream<String> Stream1 = Stream.of(names);
        Stream1.forEach(e -> {
            System.out.println(e);
        });
    }
}