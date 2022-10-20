import java.util.Scanner;

public class SafeInput
{
    /**
     * get an arbitrary string of at least one character in length
     *
     * @param pipe scanner to use for input
     * @param prompt prompt msg that tells user what to input
     * @return a string response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }while(retString.length()==0);

        return retString;
    }

    /**
     * use scanner to get an int from the console with no constraints
     *
     * @param pipe scanner to use for console input
     * @param prompt string prompt that tells the user what to input
     * @return an integer value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else {
                trash = pipe.nextLine();
                System.out.println("you entered: " + trash + ". You must enter a valid val!");
            }
        }while(!done);

        return retVal;
    }

    /**
     * use scanner to get a double from the console with no constraints
     *
     * @param pipe scanner to use for console input
     * @param prompt string prompt that tells the user what to input
     * @return a double value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double not " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     * Get an integer value within a specified range of low - high
     *
     * @param pipe scanner to use for console input
     * @param prompt string that tells the user what to input
     * @param low low value for a range low - high
     * @param high high value for a range low - high
     * @return an int value within the low - high range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) //returns an int
    {
        int retVal = low - 1;
        String trash = "";

        boolean done = false;
        do {
            System.out.print(prompt + "[" + low + " - " + high +"] : ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                } else {
                    System.out.println("You said the val is " + retVal + " but that is out of range [" + low + " - " + high + "]");
                }
            } else
            {
                trash = pipe.nextLine();
                System.out.println("you entered: " + trash + ". You must enter a valid val!");
            }
        }while(!done);

        return retVal;
    }


}