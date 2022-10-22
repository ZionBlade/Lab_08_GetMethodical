import java.util.Scanner;
public class BirthDateTime
{
    {
        Scanner console = new Scanner(System.in);

        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(console, "enter your birth year", 1950, 2010);
        birthMonth = SafeInput.getRangedInt(console, "enter your birth month", 1, 12);

        switch(birthMonth)
        {
            case (2): //for 29 days
            {
                birthDay = SafeInput.getRangedInt(console, "enter your birth day", 1, 29);
                break;
            }
            case (4 |6 |9 | 11): //for 30 days
            {
                birthDay = SafeInput.getRangedInt(console, "enter your birth day", 1, 30);
                break;
            }
            default: //for 31 days
            {
                birthDay = SafeInput.getRangedInt(console, "enter your birth day", 1, 31);
                break;
            }


        }



    }
}
