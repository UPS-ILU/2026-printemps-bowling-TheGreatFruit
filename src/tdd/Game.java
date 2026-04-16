package tdd;

public class Game {
	
	private int turn = 1;
	private int score = 0;
	private int last_throw = 0;
	private int multiplier = 1;
	private int multiplier_turn = 0;
	
	public void roll(int nbQuilles) {
		
		score = score + (nbQuilles * multiplier);	// Update score
		
		if (turn%2 == 0 && (last_throw + nbQuilles  == 10)) {	// Spare
			multiplier_turn +=1;
			multiplier = 2;
		}
		
		last_throw = nbQuilles;
		
		if(multiplier_turn>0)					// Update bonus
			multiplier_turn -=1;
		else {
			multiplier = 1;
		}
		turn +=1;							//Update turn
	}

	public int score() {
		return score;
	}

}
