import java.util.Random;
import java.util.Scanner;

public class guessing{

  public void guessGame(int numOfTries, int randNum, Scanner input){

    int guess;

    boolean win = false;

    while(win == false) {

      System.out.println("Guess a number between 1 and 100.");

      guess = input.nextInt();
      numOfTries++;

      if (guess == randNum) {
        win = true;
      } else if (guess > randNum) {
        System.out.println("Guess is too high.");
      } else if (guess < randNum) {
        System.out.println("Guess is too low.");
      }
    }
    System.out.println("You did it!");
    System.out.println("You guessed " + randNum);
    System.out.println("It took you " + numOfTries + " tries to find the answer.");
  }

  public static void main(String[] args){

    guessing a = new guessing();

    Random num = new Random();
    int randNum = num.nextInt(100);
    int numOfTries = 0;
    Scanner input = new Scanner(System.in);

    a.guessGame(numOfTries, randNum, input);


  }
}

