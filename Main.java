/*
Mini Project 1
Group #7: Dillon Pearon, ZiYan Cui, Anisha Mainali, Jyoji Maruishi, and Wenhan Zhu
Date: 
*/
import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the guessing game!\nPlease enter any positive whole number:");

    Scanner s = new Scanner(System.in);
    Random r = new Random();
    int num = s.nextInt();
    int randomNum = r.nextInt(num);

    System.out.println("A random number to be guessed has been generated");
    
    playGame (num, randomNum);
  }

 public static void playGame(int userInput, int toGuess) {
   System.out.println("Please guess a number between 0 and " + userInput);
   Scanner s = new Scanner(System.in);
   int userGuess = s.nextInt();
   int numTries = 1;

   while (userGuess != toGuess){
     numTries++;
     
     if (userGuess > toGuess){
       System.out.println("Guess lower!");
     }

     else {
       System.out.println("Guess higher!");
     }

     System.out.println("Enter your new guess:");
    
      userGuess = s.nextInt(); 
    }

    System.out.println("Great, you win! It took you " + numTries + " tries.");
 } 
}