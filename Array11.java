package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array11 {
    public static void main(String[] args) {
        List<String>Synchronized= Collections.synchronizedList(new ArrayList<>());
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                Synchronized.add("ok");
                Synchronized.add("Mohan");
                Synchronized.add("Rohlan");
                Synchronized.add("Roya");
            }
        });
            Thread thread1=new Thread();



    }
}
