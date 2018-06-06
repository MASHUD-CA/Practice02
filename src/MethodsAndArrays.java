import java.util.Scanner;

public class MethodsAndArrays {

	public static void main(String[] args) {
		
		//Instantiates our game object
		Game game = new Game();
		
		Scanner input = new Scanner (System.in);
		int numDice;
		int numSides;
		try {
			System.out.println("Enter the number of dice: ");
			numDice = input.nextInt();
			
			System.out.println("Enter the number of sides");
			numSides = input.nextInt();
			
			System.out.printf("you rolled %d%n ", game.rollDice(numDice, numSides));
			
		}
		catch (Exception e) {
			System.out.println("You entered invalid data");
		}
		
	}

}
