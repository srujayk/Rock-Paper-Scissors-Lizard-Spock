//Rock, Paper, Scissors, Lizard, Spock
//By Srujay Korlakunta

import java.util.Scanner;

public class RPSLSRunner{
	public static void main(String [] args){

		Scanner keyboardTwo = new Scanner(System.in);

		String name;
		System.out.print("Hiya! Enter your name :: ");
		name = keyboardTwo.nextLine();

		RPSLS game = new RPSLS();

		System.out.println("\nThanks for playing " + name + "!");


	}


}
