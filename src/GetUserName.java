import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        String firstName = "";
        String lastName = "";

        firstName = SafeInput.getNonZeroLenString(console, "Enter your First Name");
        lastName = SafeInput.getNonZeroLenString(console, "enter your last name");

        System.out.println("You said your full name was " + firstName + " " + lastName);
    }
}
