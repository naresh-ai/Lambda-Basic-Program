package Lambda_Expression;
interface  Car
{
    void Gear();


    default void Bike(String str)
    {
        System.out.println("Car started");

    }
}
public class LambdaQ6
{
    public static void main(String[] args)
    {

        Car Gear =()-> {
            System.out.println("Automatic Car");
        };


    }



}
