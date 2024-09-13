package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayTwo {
    public static void main(String[] args) {
        List<Integer>obj=new ArrayList<>();
        obj.add(34);
        obj.add(56);
        obj.add(76);
        obj.add(54);
        obj.add(334);
        obj.add(556);
        obj.add(56);
        obj.add(356);

            // create on arraylst to another collection
        List<Integer>obj1=new ArrayList<>(obj);

        List<Integer>obj2=new ArrayList<>();
        obj2.add(3);
        obj2.add(4);
        obj2.add(5);
        obj2.add(6);
        obj2.add(0);
        obj2.add(7);
        obj.addAll(obj2);
        System.out.println(obj);


    }
}
