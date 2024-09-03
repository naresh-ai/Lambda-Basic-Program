package Lambda_Expression;

interface Name
{
    void display(String name);
}
public class LambdaQ5 {
    public static void main(String[] args)
    {


        Name a = (name) -> System.out.println("my name is " + name);
        a.display("Yogesh");
        }
    }



