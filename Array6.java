package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array6 {
    public static void main(String[] args) {
        List<Integer>obj=new ArrayList<>();
        obj.add(67);
        obj.add(999);
        obj.add(78);
        obj.add(34);
        obj.add(21);
        Collections.sort(obj);
        System.out.println("Sorted of collection "+obj);
    }
}
