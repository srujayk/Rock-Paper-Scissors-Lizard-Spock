//Rock, Paper, Scissors, Lizard, Spock
//By Srujay Korlakunta

import java.util.Scanner;

public class RPSLS
{

		String userChoice;
		String compChoice;
		String numGamesWord;
		String compChoiceUpper;
		int numGames;
		int numGamesTwo;
		int playedGames;
		int toWin;
		int userWins = 0;
		int compWins = 0;
		double random;
		boolean numGamesOkay;
		boolean choiceOkay;
		boolean numOkay;
		boolean choiceNum;

		Scanner keyboard = new Scanner(System.in);

	public static void main(String [] args){

	}


	public RPSLS(){

		System.out.println("Time to play Rock, Paper, Scissors, Lizard, Spock!");
		System.out.print("\nHow many games would you like to play? \nEnter an odd integer number between 1 and 9 :: ");
		numGamesWord = keyboard.nextLine();

		numGames = 0;
		numGamesOkay = isNumeric(numGamesWord);

		if(numGamesOkay == false){

			numOkay = true;
		}else{
			numGames = Integer.parseInt(numGamesWord);
		}

		switch(numGames){
			case 1 : numOkay = false; break;
			case 3 : numOkay = false; break;
			case 5 : numOkay = false; break;
			case 7 : numOkay = false; break;
			case 9 : numOkay = false; break;
			default: numOkay = true; break;
		}

		while (numOkay == true){
				switch(numGames){
					case 1 : numOkay = false; break;
					case 3 : numOkay = false; break;
					case 5 : numOkay = false; break;
					case 7 : numOkay = false; break;
					case 9 : numOkay = false; break;
					default: System.out.print("Enter an odd integer number between 1 and 9 :: ");
							 numGamesWord = keyboard.nextLine();
							 numGamesOkay = isNumeric(numGamesWord);
							 if(numGamesOkay == false){
								numOkay = true;
							 }else{
								numGames = Integer.parseInt(numGamesWord);
							 }
							 break;
				}
		}


		if( numGames % 2 == 0){
			toWin = (numGames/2) + 1;
		}else{
			toWin = ((numGames - 1)/2)+1;
		}

		System.out.println("\nYou need " + toWin + " games to win!");
		System.out.println("\nThe rules? \"It's very simple. \nScissors cuts paper, \npaper covers rock, \nrock crushes lizard, \nlizard poisons Spock, \nSpock smashes scissors, \nscissors decapitates lizard, \nlizard eats paper, \npaper disproves Spock, \nSpock vaporizes rock, \nand, as it always has, \nrock crushes scissors.\" \n -Sheldon Cooper, Ph.D \n\nIf you and the computer both select the same weapon, \nthen that particular game will be canceled and another game will be played.\n\nYour weapon choices are:: Rock, Paper, Scissors, Lizard, and... Spock!");
		System.out.print("\nWhat do you choose as your weapon? Enter your choice :: ");



		choiceOkay = false;
		playedGames = 0;
		System.out.print("\n\nGame " + (playedGames + 1) + " :: ");

		userChoice = keyboard.nextLine();
		userChoice = userChoice.toLowerCase();



		while(playedGames < numGames){

		switch(userChoice){
			case "rock" : choiceOkay = false; break;
			case "paper" : choiceOkay = false; break;
			case "scissors" : choiceOkay = false; break;
			case "lizard" : choiceOkay = false; break;
			case "spock" : choiceOkay = false; break;
			default: choiceOkay = true; break;
				}
		while (choiceOkay == true){
				switch(userChoice){
					case "rock" : choiceOkay = false; break;
					case "paper" : choiceOkay = false; break;
					case "scissors" : choiceOkay = false; break;
					case "lizard" : choiceOkay = false; break;
					case "spock" : choiceOkay = false; break;
					default:
							System.out.println("Your choice was not rock, paper, scissors, lizard, or spock! Try again!");
							userChoice = keyboard.nextLine();
						break;
				}
		}

		random = Math.random();

		if(random<0.2){
			compChoice = "rock";
		}else if(0.2 < random && random < 0.4){
			compChoice = "paper";
		}else if(0.4 < random && random < 0.6){
			compChoice = "scissors";
		}else if(0.6 < random && random < 0.8){
			compChoice = "lizard";
		}else{
			compChoice = "spock";
		}

		compChoiceUpper = compChoice.substring(0, 1).toUpperCase() + compChoice.substring(1);
		if(userChoice.equals(compChoice)){
				System.out.println("The computer chose " + compChoiceUpper + ". Wait! You chose that too! You tied with the computer!");
			}

			if(userChoice.equals("rock")){

				if(compChoice.equals("paper")){
					System.out.println("The computer chose Paper! Paper covers Rock! You lose!");
					playedGames = playedGames + 1;
					compWins = compWins + 1;
				}

				if(compChoice.equals("scissors")){
					System.out.println("The computer chose Scissors! Rock crushes Scissors! You WIN! :)");
					playedGames = playedGames + 1;
					userWins = userWins + 1;
				}
				if(compChoice.equals("spock")){
					System.out.println("The computer chose Spock! Spock vaporizes Rock! You lose!  ");
					playedGames = playedGames + 1;
					compWins = compWins + 1;
				}
				if(compChoice.equals("lizard")){
					System.out.println("The computer chose Lizard! Rock crushes Lizard! You WIN! :) ");
					playedGames = playedGames + 1;
					userWins = userWins + 1;
				}


			}

			if(userChoice.equals("paper")){

				if(compChoice.equals("rock")){
					System.out.println("The computer chose Rock! Paper covers Rock! You WIN! :)");
					playedGames = playedGames + 1;
					userWins = userWins + 1;
				}

				if(compChoice.equals("scissors")){
					System.out.println("The computer chose Scissors! Scissors cuts Paper! You lose!");
					playedGames = playedGames + 1;
					compWins = compWins + 1;
				}
				if(compChoice.equals("spock")){
					System.out.println("The computer chose Spock! Paper disproves Spock! You WIN! :) ");
					playedGames = playedGames + 1;
					userWins = userWins + 1;
				}
				if(compChoice.equals("lizard")){
					System.out.println("The computer chose Lizard! Lizard eats Paper! You lose! ");
					playedGames = playedGames + 1;
					compWins = compWins + 1;
				}


			}

			if(userChoice.equals("scissors")){

				if(compChoice.equals("rock")){
					System.out.println("The computer chose Rock! Rock crushes Scissors! You lose!");
					playedGames = playedGames + 1;
					compWins = compWins + 1;
				}

				if(compChoice.equals("paper")){
					System.out.println("The computer chose Paper! Scissors cuts Paper! You WIN! :)");
					playedGames = playedGames + 1;
					userWins = userWins + 1;
				}
				if(compChoice.equals("spock")){
					System.out.println("The computer chose Spock! Spock smashes Scissors! You lose! ");
					playedGames = playedGames + 1;
					compWins = compWins + 1;
				}
				if(compChoice.equals("lizard")){
					System.out.println("The computer chose Lizard! Scissors decapitates Lizard! You WIN! :)");
					playedGames = playedGames + 1;
					userWins = userWins + 1;
				}


			}

			if(userChoice.equals("lizard")){

				if(compChoice.equals("rock")){
					System.out.println("The computer chose Rock! Rock crushes Lizard! You lose!");
					playedGames = playedGames + 1;
					compWins = compWins + 1;
				}

				if(compChoice.equals("paper")){
					System.out.println("The computer chose Paper! Lizard eats Paper! You WIN! :)");
					playedGames = playedGames + 1;
					userWins = userWins + 1;
				}
				if(compChoice.equals("spock")){
					System.out.println("The computer chose Spock! Lizard poisons Spock! You WIN! :) ");
					playedGames = playedGames + 1;
					userWins = userWins + 1;
				}
				if(compChoice.equals("scissors")){
					System.out.println("The computer chose Scissors! Scissors decapitates Lizard! You lose!");
					playedGames = playedGames + 1;
					compWins = compWins + 1;
				}


			}

			if(userChoice.equals("spock")){

				if(compChoice.equals("rock")){
					System.out.println("The computer chose Rock! Spock vaporizes Rock! You WIN! :)");
					playedGames = playedGames + 1;
					userWins = userWins + 1;
				}

				if(compChoice.equals("paper")){
					System.out.println("The computer chose Paper! Paper disproves Spock! You lose!");
					playedGames = playedGames + 1;
					compWins = compWins + 1;
				}
				if(compChoice.equals("lizard")){
					System.out.println("The computer chose Lizard! Lizard poisons Spock! You lose!");
					playedGames = playedGames + 1;
					compWins = compWins + 1;
				}
				if(compChoice.equals("scissors")){
					System.out.println("The computer chose Scissors! Spock smashes Scissors! You WIN! :)");
					playedGames = playedGames + 1;
					userWins = userWins + 1;
				}


			}


		if(playedGames <= numGames && playedGames != numGames){
			System.out.print("Game " + (playedGames + 1) + " :: ");
			userChoice = keyboard.nextLine();
			userChoice = userChoice.toLowerCase();
			}
		}

		System.out.println("\n\nThe computer won " + compWins + " games.");
		System.out.println("You won " + userWins + " games.");

		if(userWins > compWins){
			System.out.println("\nYay! You beat the computer!!!");
		}else{
			System.out.println("\nOh man! The computer beat you! Good luck next time!");
		}

	}
	public static boolean isNumeric(String input) {
  		try {
    		Integer.parseInt(input);
    		return true;
  		} catch (NumberFormatException e) {
    		// s is not numeric
    		return false;
  		}
	}


}
