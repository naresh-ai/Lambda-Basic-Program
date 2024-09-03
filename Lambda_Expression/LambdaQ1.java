package Lambda_Expression;
interface  Add
{
    int Addition (int a, int b, int c);
}
public class LambdaQ1
{
    public static void main(String[] args) {
        Add sc=(a,b,c)->a+b+c;
         int result = sc.Addition(80,88,78);
        System.out.println(result);
    }

}

