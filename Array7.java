package CollectionPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Array7 {
    public static void main(String[] args) {
        List<String> obj=new ArrayList<>();
        obj.add("oklk");
        obj.add("Rohan");
        obj.add("Sanket");
        obj.add("Rohansa");

       // obj.sort(Comparator.<String>
        //);
        obj.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });


        obj.sort((name1, name2) -> name1.compareTo(name2));


        obj.sort(Comparator.naturalOrder());

        System.out.println("Sorted Names : " + obj);
    }

    }



