package guessinggame_v1;

public class Player {
	int guessNumber;
	
	void guess() {
		guessNumber = (int) (Math.random() * 10);
	}
}
