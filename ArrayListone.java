package CollectionPrograms;

import java.util.ArrayList;

public class ArrayListone {
    public static void main(String[] args) {
        ArrayList <Integer>obj=new ArrayList<>();
        obj.add(78);
        obj.add(45);
        obj.add(56);
        obj.add(4);
        obj.add(4);
        obj.add(333);

        System.out.println(obj);

        //add element method
        obj.add(3,89);
        System.out.println(obj);

    }
}
