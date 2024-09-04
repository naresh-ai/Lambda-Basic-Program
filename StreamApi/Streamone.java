package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streamone {

    public static void main(String[] args) {
      List<Integer>list= Arrays.asList(90,34,344,34,34,3);
        List<Integer> list1 = new ArrayList<>();
        /*list1.add(90);
        list1.add(78);
        list1.add(880);*/

        for (Integer i : list1) {
            if (i % 2 == 0) {
                list1.add(i);
            }
        }
        System.out.println(list);
        System.out.println(list1);
    }


}
