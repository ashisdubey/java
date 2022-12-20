//import java.util.Math;
import java.util.Scanner;
class Guesser 
{
	//Automatically getting a number between 0 to 1000
	public int giveTheNumber(){
		System.out.println("\nGuesser is guessing the number...\n");
		int guessedNumber = (int) (Math.random()*10);
		System.out.println("Guesser has guessed the number and told it secretly to the umpire...\n");
		
		return guessedNumber;
	}
}

//Class for players
class Player
{
	static int playerCount =1;
	int playerNumber;
	public Player(){
		playerNumber = playerCount++;
	}

	public int guessTheNumber(){
		System.out.println("\nPlayer "+ playerNumber +", please Guess a number");
		Scanner scanner = new Scanner(System.in);
		int guessedNumber = scanner.nextInt();

		return guessedNumber;
	}
}
class Umpire
{
	//Obtain the Guesser's guessed number
	int numberToCheck;
	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();
	int player1Guess;
	int player2Guess;
	int player3Guess;

	public void obtainTheAnswer(){
		Guesser g = new Guesser();
		numberToCheck = g.giveTheNumber();
	}

	public void obtainGuesses(){
		
		
		
		
		player1Guess = p1.guessTheNumber();
		player2Guess = p2.guessTheNumber();
		player3Guess = p3.guessTheNumber();
		
		System.out.println("\n\nAll players have guessed the numbers... Now it's time to announce the winners...\n\n");
	}

	public void announceTheWinners(){
		int[] results = new int[3];
		int totalCorrectGuesses =0;
		
		if(numberToCheck == player1Guess){
			System.out.print("Player " +this.p1.playerNumber);
			totalCorrectGuesses++;
		}
		if(numberToCheck == player2Guess){
			if(totalCorrectGuesses>0)
				System.out.print(", ");
			
			System.out.print("Player " +p2.playerNumber);
			totalCorrectGuesses++;
		}
		if(numberToCheck == player3Guess){
			if(totalCorrectGuesses>0)
				System.out.print(", ");
			
			System.out.print("Player " +p3.playerNumber);
			totalCorrectGuesses++;
		}
		
		
		if(totalCorrectGuesses ==0)
			System.out.println("Correct Answer is = "+numberToCheck + "\n\n OOPS !! No one has guessed the correct number... Please try again\n\n");
		else
			System.out.print(" guessed it correctly. Congratulations !!!\n\n");
	}
}

public class GuessLauncher
{
	public static void main(String[] args){
		System.out.println("Welcome to the Guesser game");

		Umpire umpire = new Umpire();
		Scanner sc = new Scanner(System.in);
		int option = 1;
		do{
			
			umpire.obtainTheAnswer();
			umpire.obtainGuesses();
			umpire.announceTheWinners();

			System.out.println("\n\nWhat next?\n\nPress\nAny +ve number to play again or 0 to exit");
			option = sc.nextInt();
		}
		while(option!=0);
		System.out.println("\nThank you. Please visit us again...\n");
	}
}