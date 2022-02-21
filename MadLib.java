import java.util.Scanner;
public class MadLib
{
   public static void main(String[] args)
   {
      String color, food, superPow, animal, vehicle;
      Scanner inputDevice = new Scanner(System.in);
      
      System.out.print("Enter a color: ");
      color = inputDevice.nextLine();
      System.out.print("Enter a food: ");
      food = inputDevice.nextLine();
      System.out.print("Enter a Super Power: ");
      superPow = inputDevice.nextLine();
      System.out.print("Enter an animal: ");
      animal = inputDevice.nextLine();
      System.out.print("Enter a vehicle: ");
      vehicle = inputDevice.nextLine();
      
      System.out.println("In the " + color + " treehouse there lives a sloth that loves to eat " + food 
      + ", by the handful. Eating all that " + food + " gives him the power to " + superPow + 
      " which he uses to steal bananas for all the " + animal + " to help build the best banana " + vehicle);
    }
}