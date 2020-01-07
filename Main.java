import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keybaord = new Scanner(System.in);
        System.out.println("this program will find the right position of numbers and sum them");
        System.out.println("you have only 3 chances to get most of it");
        System.out.println("enter a secred 5 digit code");
        String secredCode = "53840";
        String guessingCode;
        int counter = 0;
        double sum = 0;
        for(int i = 1; i<= 3; i++)
        {
            System.out.println("chance: "+ i);
            System.out.println("Enter a guessing code");
            guessingCode = keybaord.nextLine();
            for(int a = 0; a< 5; a++)
            {
                if(secredCode.charAt(a) == guessingCode.charAt(a))
                {
                    System.out.println("matched found at position:" + (a));
                    int secret = Character.getNumericValue(secredCode.charAt(a));
                    int guess = Character.getNumericValue(guessingCode.charAt(a));
                    sum = sum +guess;
                    counter++;

                }

            }
            System.out.println(secredCode +" and " + guessingCode + " have " + counter + " and "+ (int)sum );
            counter = 0;
            sum = 0;
        }
    }
}
