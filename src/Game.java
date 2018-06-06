import java.security.SecureRandom;

public class Game {

//Constructor ----------------------
	public Game() {
		
	}

//PUBLIC METHODS
public int rollDice(int numDice, int numSides) {
	//Forces minimum of one die
	if(numDice < 1) {
		numDice = 1;
	}
	
	//Forces minimum of 4 sides
	if(numSides < 4) {
		numSides = 4;
	}
	System.out.printf("You selected %d dice with %d sides %n", numDice, numSides);
	
	SecureRandom generateRandom = new SecureRandom();
	int result = 0;
	

	for (int index = 0; index < numDice; index++) {
		result += generateRandom.nextInt(numSides) + 1;
		
	}
	
	return result;
	}
}
