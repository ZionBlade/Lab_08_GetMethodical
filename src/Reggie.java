import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        String ssn = "";
        String ucM = "";
        String menu = "";

        ssn = SafeInput.getRegExString(console, "Enter your SSN ###-##-####", "\\d{3}-\\d{2}-\\d{4}");

        System.out.println("Your SSN is: " + ssn);

        ucM = SafeInput.getRegExString(console, "Enter your UC M number M#####", "(M|m)\\d{5}");

        System.out.println("Your UC M number is: " + ucM);

        menu = SafeInput.getRegExString(console, "Choose: Open Save View or Quit (O,S,V,Q)", "[OoSsVvQq]");

        System.out.println("You chose: " + menu);
    }
}
