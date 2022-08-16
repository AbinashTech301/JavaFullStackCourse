import java.util.Scanner;

/*
 * Capabilities:
 * Three modes available: 0 -> Easy, 1 -> Medium, 2 -> Hard
 * If any other input given for mode, then the mode is hard by default.
 * 
 * Any number of player can be accommodated.
 * 
 * Exception handling at some checkpoints
 * 
 * The program demonstrates use of:
 * class, object, methods, method overloading, Switch case, if else, for loop, exception handling
 * 
 * */

class Guesser
{
	int guessNum;
	public int guessNumber()
	{
		Scanner scan = new Scanner(System.in);		
		System.out.println("Guest: Guess the number");
		guessNum = scan.nextInt();
		return guessNum;
	}
	public int guessNumber(int gameLevel) 
	{			
		Scanner scan = new Scanner(System.in);		
		System.out.println("Guest: Guess the number");
		guessNum = scan.nextInt();
		if (gameLevel == 0) 
		{
			System.out.println("Guess number between " + (guessNum - 5) + " to " + (guessNum + 5));
		}
		else if (gameLevel == 1)
		{
			System.out.println("Guess number between " + (guessNum - 100) + " to " + (guessNum + 100));
		}
		else if (gameLevel == 2)
		{
			System.out.println("Guess number between -inf to +inf");
		}
		return guessNum;
	}
}

class Player
{
	int pguessNum;
	
	public int guessNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player Kindly guess the number");
		pguessNum = scan.nextInt();
		return pguessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numOfPlayers;
	int numFromPlayer[];
//	int numFromPlayer1;
//	int numFromPlayer2;
//	int numFromPlayer3;
	
	public void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
	}
	
	public void collectNumFromGuesser(int gameLevel)
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber(gameLevel);
	}
	
//	public void collectNumFromPlayer() {
//		Player p1 = new Player();
//		Player p2 = new Player();
//		Player p3 = new Player();
//		
//		numFromPlayer1 = p1.guessNumber();
//		numFromPlayer2 = p2.guessNumber();
//		numFromPlayer3 = p3.guessNumber();
//	}
	
	public void getNumFromPlayers(int numOfPlayers) 
	{
		this.numOfPlayers = numOfPlayers;
		numFromPlayer =  new int[numOfPlayers];
		
		Player p[] = new Player[numOfPlayers];
		
		for (int i=0; i < numOfPlayers; i++) 
		{
			p[i] = new Player();
			numFromPlayer[i] = p[i].guessNumber();
		}
		
	}
	
	void compare(){
		int WinnerTracker[];
		int WinnerCount=0;
		int j=0;
		
		for (int i=0; i < numOfPlayers; i++)
		{
			if (numFromPlayer[i] == numFromGuesser) 
			{
				WinnerCount++;
			}
		}
		
		WinnerTracker = new int[WinnerCount];
		
		for (int i =0; i < numOfPlayers; i++) 
		{
			if (numFromPlayer[i] == numFromGuesser) 
			{
				WinnerTracker[j] = i;
				j++;
			}
		}
		
		//Print the result
		if (WinnerTracker.length > 0)
		{
			for (int i =0; i < WinnerTracker.length; i++) 
			{
				System.out.println("Player ---> " + (WinnerTracker[i] + 1) + "   won!!!");
			}
		}
		else 
		{
			System.out.println("Nobody wins :-( \n Please try again!");
		}
	}
	
//	void compare() 
//	{
//		
//		if (numFromGuesser == numFromPlayer1)
//		{
//			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
//			{
//				System.out.println("All the Players won!!!");
//			}
//			else if (numFromGuesser == numFromPlayer2)
//			{
//				System.out.println("Player 1 and Player 2 won!!!");
//			}
//			else if (numFromGuesser == numFromPlayer3) 
//			{
//				System.out.println("Player 1 and Player 3 won!!!");
//			}
//			else
//			{
//				System.out.println("Player 1 won!!!");
//			}
//		}
//		else if(numFromGuesser == numFromPlayer2) 
//		{
//			if (numFromGuesser == numFromPlayer3)
//			{
//				System.out.println("Player 2 and Player 3 won!!!");
//			}
//			else
//			{
//				System.out.println("Player 1 won!!!");
//			}
//		}
//		else if(numFromGuesser == numFromPlayer3) 
//		{
//			System.out.println("Player 3 won!!!");
//		}
//		else
//		{
//			System.out.println("No Winners :-(,  \n Please try again!!!");
//		}
//	}
}

public class LaunchGame {
	public static void main(String[] args) 
	{
		//mode: easy, medium, hard
		String mode[] = new String[3];
		mode[0] = "Easy";
		mode[1] = "Medium";
		mode[2] = "Hard";
		
		int gameLevel = 0;
		
		//Select mode
		System.out.println("Select Mode (Type int)::: \n 0 -> Easy \n 1 -> Medium \n 2 -> Hard");
		
		Scanner scan = new Scanner(System.in);
		try {
			gameLevel = scan.nextInt();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		//get number of Players
		System.out.println("Enter the number of Players!!!");
		int numOfPlayers = scan.nextInt();
				
		Umpire ump = new Umpire();
		//Get the number from Guesser
		switch (gameLevel) 
		{
		case 0:
			ump.collectNumFromGuesser(gameLevel);
			break;
		case 1:
			ump.collectNumFromGuesser(gameLevel);
			break;
		case 2:
			ump.collectNumFromGuesser(gameLevel);
			break;
		default:
			ump.collectNumFromGuesser();
		}
		
		
		
		//Get the number from Players
		ump.getNumFromPlayers(numOfPlayers);
		
		//compare the numbers and give the result
		ump.compare();
		
	}
}