import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Player aPlayer = new Player();
		Deck gameDeck = new Deck();
		gameDeck.deckIndex = 0;

    aPlayer.reset();
      aPlayer.hit(gameDeck.dealACard());
		// deals 2 cards
		aPlayer.hit(gameDeck.dealACard());
		// shows the 2 cards that I dealt
		aPlayer.showHand();

		// game loop
		while (true) {

			// Asking the user if they want to hit or stay
			Scanner hitStay = new Scanner(System.in);
			System.out.println("Do you want to hit or stay?");
			String hitStayScanner = hitStay.nextLine();
			if (hitStayScanner.equals("hit") || hitStayScanner.equals("Hit") || hitStayScanner.equals("H") || hitStayScanner.equals("h")) {
				// adds a new card
				aPlayer.hit(gameDeck.dealACard());
				// shows all the new cards
				System.out.println("You choose to hit here is your new hand:");
				aPlayer.showHand();
				System.out.printf("Your total is %d \n", aPlayer.handTotal());
				// check to see if busted

				if (aPlayer.handTotal() > 21) {
					System.out.println("You busted");
					if (!wantEndGame()) {
						return;
					}
          else {
            main(args);
          }
				}

			} else {
				System.out.println("Ok, you decided to stay here is your current hand!");
				System.out.printf("Your total was %d, here are your cards: \n", aPlayer.handTotal());
				aPlayer.showHand();
				if (!wantEndGame()) {
					return;
				} else {
          System.out.printf("Your total was %d, here are your cards: \n", aPlayer.handTotal());
					main(args);

				}
			}
		}
	}

	public static boolean wantEndGame() {
		Scanner input = new Scanner(System.in);
		System.out.println("Do u want to play again? Y / N");
		String endGameScanner = input.nextLine();
		if (endGameScanner.equals("Y") || endGameScanner.equals("y")) {
      return true;
		} else {
			return false;
		}
	}

	public static void testPlayer() {
		Player abby = new Player();
		Deck d = new Deck();
		d.deckIndex = 0;
		abby.hit(d.dealACard());
		abby.hit(d.dealACard());
		abby.showHand();
	}

	public static void testLoop() {
		for (int x = 0; x<52; x++) {
			System.out.println("Index:" + x);
			System.out.println("Remainder:" + (x % 13));
			System.out.println("Quotient:" + x / 13);
		}
	}

	public static void testDeckDealing() {
		// creates a new test deck object
		Deck testDeck = new Deck();
		testDeck.deckIndex = 49;

		for (int x = 0; x<2; x++) {
			// this is confirming that the deckIndex reflects the right number
			System.out.println(testDeck.deckIndex);
			testDeck.dealACard().image.draw();

		}

		// deals the card --> gets the image --> draws the image
		for (int x = 0; x<10; x++) {
			// this is confirming that the deckIndex reflects the right number
			System.out.println(testDeck.deckIndex);
			testDeck.dealACard().image.draw();

		}
	}

}
