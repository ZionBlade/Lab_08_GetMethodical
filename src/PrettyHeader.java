import java.util.Scanner;
public class PrettyHeader
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner (System.in);
        String msg = SafeInput.prettyHeader(console, "Enter your message");
    }
}
