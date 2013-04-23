import java.util.Scanner;
public class Dice {
  private int DiceNumber;
  public Dice(int numberofDice)
  {
  	DiceNumber = numberofDice;
  }
  public String GuessHighLow()
  {
  	Scanner input = new Scanner (System.in );
  	String guess;
  	System.out.print("Guess high or low:");
  	guess = input.next();
  	return guess;
  }
  public int GetARandomNumber()
  {
  	int computerNum;
  	computerNum = 1 + (int)(Math.random()*6*DiceNumber);
  	return computerNum;
  }
  public String GetResult(int computerNum)
  {
  	String result = "";
  	if ((computerNum == 1) || (computerNum == 2)|| (computerNum == 3))
  	{
  		 result = "low";
  	}
  	else if ((computerNum == 4) || (computerNum == 5)|| (computerNum == 6))
  	{
  		 result = "high";
  	}
  	return result;
  }
  public String GetResult2(int computerNum)
  {
  	String result = "";
  	if ((computerNum == 1) || (computerNum == 2)|| (computerNum == 3)
  		||((computerNum == 4) || (computerNum == 5)|| (computerNum == 6)))
  	{
  		 result = "low";
  	}
  	else if ((computerNum == 7) || (computerNum == 8)|| (computerNum == 9)
  		||((computerNum == 10) || (computerNum == 11)|| (computerNum ==12)))
  	{
  		 result = "high";
  	}
  	return result;
  }
  public void Comparison(String guess, String result)
  {
  	if ((guess.equalsIgnoreCase(result)))
  		System.out.println("YOU win\n");
  	else 
  		System.out.println("YOU lost\n");
  }
  public void display(String guess, String result, int computerNum)
  {
  	System.out.printf("Your Guess is %s\n", guess );
  	System.out.printf("Computer Number is %d\n", computerNum);
  	System.out.printf("Computer Result is %s\n\n\n", result);
  }
}
