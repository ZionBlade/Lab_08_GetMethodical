import java.util.Scanner;
public class FavNumbers {

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(console, "enter your favorite integer");
        favDouble = SafeInput.getDouble(console, "enter your favorite double");

        System.out.println("you said your favorite int was " + favInt + " and you said your favorite double was " + favDouble);
    }
}
