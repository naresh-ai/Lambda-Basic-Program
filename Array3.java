package CollectionPrograms;

import java.util.ArrayList;

// operations
public class Array3 {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("facebook");
        obj.add("Apple");
        obj.add("Telegram");
        obj.add("Samsung");
        obj.set(1, "Method");
        System.out.println("Top Companys " + obj.isEmpty());
        System.out.println("Top compancys " + obj.size());
        System.out.println(obj.set(2, "Namo"));
        System.out.println(obj.clone());
    }
}
