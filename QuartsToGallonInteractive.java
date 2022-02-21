import java.util.Scanner;
public class QuartsToGallonInteractive
{	
   public static void main(String args[])
	{
        final int NumberOfQuarts = 4;
        int paintingQuarts;
        
        Scanner inputDevice = new Scanner(System.in);
        
        System.out.print("How many quarts of paint do you need for the paint job? ");
        paintingQuarts = inputDevice.nextInt();
        
        int gallons = paintingQuarts / NumberOfQuarts;
        int quarts = paintingQuarts % NumberOfQuarts;
        
        System.out.println("A painting job that needs " + paintingQuarts + " Quarts Required "
         + gallons + " Gallons and " + quarts + " Quarts of Paint.");
	}
}