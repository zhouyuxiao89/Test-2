
public class DiceMain {
  public static void main(String[] args)
  {
  String guess;
  String result;
  int computerNum;
  Dice myDice1 = new Dice(1);
  guess = myDice1.GuessHighLow();
  computerNum = myDice1.GetARandomNumber();
  result =myDice1.GetResult(computerNum);
  myDice1.Comparison(guess, result);
  myDice1.display(guess, result, computerNum);
  //-------------------------------------------
  Dice myDice2 = new Dice(2);
  guess = myDice2.GuessHighLow();
  computerNum = myDice2.GetARandomNumber();
  result =myDice2.GetResult2(computerNum);
  myDice2.Comparison(guess, result);
  myDice2.display(guess, result, computerNum);
  //--------------------------------------------
  
  }
}
