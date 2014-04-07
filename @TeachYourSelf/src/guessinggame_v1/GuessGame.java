package guessinggame_v1;

public class GuessGame {
	int count = 0;
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Target number is " + targetNumber + "\n");
		
		while (true) {
		
		count++;
		
		p1.guess();
		p2.guess();
		p3.guess();
		
		System.out.println("Player one guessed " + p1.guessNumber);
		System.out.println("Player two guessed " + p2.guessNumber);
		System.out.println("Player three guessed " + p3.guessNumber + "\n");
		
		if (p1.guessNumber == targetNumber) {
			System.out.println("Player one wins !" + "\n");
			break;
		}
		else {
			if (p2.guessNumber == targetNumber) {
				System.out.println("Player two wins !" + "\n");
				break;
			}
			else {
				if (p3.guessNumber == targetNumber) {
					System.out.println("Player three wins !" + "\n");
					break;
				}
				else {
					System.out.println("Players have to guess again" + "\n");
				}
			}	
		}
		}
		System.out.println("Each Player has guessed " + count + " times");
	}
}
