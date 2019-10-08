import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
  public static void main(String[] args) {

    Random randGen = new Random();
    Scanner scnr = new Scanner (System.in);
    int a = randGen.nextInt(101) + 10;


    System.out.println("Enter your best guess number (10-100): ");
    int userNum = scnr.nextInt();

while (!(a == userNum))
{
    System.out.print("INCORRECT GUESS!!  ");

    if (a > userNum)
    {
      System.out.println("Your guess was too low");
    }
    else
    {
      System.out.println("Your guess was to high");
    }

    System.out.print("Try again!   ");
    System.out.print("Enter your best guess number: ");
    userNum = scnr.nextInt();
}

  System.out.println("You guessed it right!");
  System.out.println("The number was: " + a);

  }
}
