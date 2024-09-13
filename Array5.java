package CollectionPrograms;

import java.util.ArrayList;

public class Array5 {
    private String name;
    private int id;

    public Array5(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class  run{
    public static void main(String[] args) {
        ArrayList<Array5>obj=new ArrayList<>();
        obj.add(new Array5("naa",1));
        obj.add(new Array5("ok",2));
        obj.add(new Array5("raja",3));
        obj.add(new Array5("tatya",4));
        obj.forEach(user -> {
            System.out.println("Name : " + user.getName() + ", Age : " + user.getId());
        });
    }

}
