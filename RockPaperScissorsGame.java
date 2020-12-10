import java.util.Scanner;
import java.lang.Math;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String userPlayChoice;
		//a do while loop to see if it should keep running, if you type no
		//it exits the loop and if you type yes it reruns
		do {
			System.out.println("lets play rock paper, scissors!!");
			String userChoiceGame = getUserDecision();
			String computerChoiceGame = getComputerDecision();
			switch(userChoiceGame) {
			case "rock":
				if(computerChoiceGame.equals("paper")) {
					System.out.println("Computer Wins");
				}
				else if(computerChoiceGame.equals("scissors")) {
					System.out.println("Player Wins");
				}
				else {
					System.out.println("It's a Tie");
				}
				break;
			case "paper":
				if(computerChoiceGame.equals("scissors")) {
					System.out.println("Computer Wins");
				}
				else if(computerChoiceGame.equals("rock")) {
					System.out.println("Player Wins");
				}
				else {
					System.out.println("It's a Tie");
				}
				break;
			case "scissors":
				if(computerChoiceGame.equals("rock")) {
					System.out.println("Computer Wins");
				}
				else if(computerChoiceGame.equals("paper")) {
					System.out.println("Player Wins");
				}
				else {
					System.out.println("It's a Tie");
				}
				break;
			default:
				System.out.println("There was an error");
				break;
			}
			System.out.println("Want to play one more? Enter yes or no");
			userPlayChoice=scan.nextLine().trim().toLowerCase();
		}while(userPlayChoice.equals("yes"));
	}
	//Chooses random. rock, paper or scissors. 33% chance for each weapon.
	private static String getComputerDecision() {
		double randomNumber = Math.random();
		if(randomNumber <.33) {
			return "rock";
		}
		else if(randomNumber <.66) {
			return "paper";
		}
		else{
			return "scissors";
		}
	}
	//Gets Users choice of weapon!
	private static String getUserDecision() {
		Scanner userInputScanner = new Scanner(System.in);
		System.out.println("Enter rock, paper or scissors: ");
		//trim to remove whitespace from both sides. toLowerCase to make all letters Lowercase
		String userChoice = userInputScanner.nextLine().trim().toLowerCase();
		if(userChoice.equals("rock") || (userChoice.equals("paper") || (userChoice.equals("scissors")))){
			return userChoice;
		}
		else {
			System.out.println("not valid input, we'll pick rock for u instead");
			return "rock";
		}
	}
}
