public class Deck {
  int deckIndex = 0; // that will keep track of the current position in the deck. The current
                     // position in the deck is the next card that should be dealt from the deck when
                     // we need to draw a card.

  Card[] decks;


  public Deck() {
    createDeck();
    shuffleDeck();
  }

  public Card dealACard() {

    if (deckIndex == 51) {
      deckIndex = 0;
    }
    Card tempCard = decks[deckIndex];
    // increment deckIndex by 1
    deckIndex++;
    return tempCard;
  }

  public Deck createDeck() {
        Card[] deck = new Card[52];
        for (int x = 0; x < 52; x++) {
            int rank = (x % 13) + 1;
            int iSuit = (x % 4);
            String suit = "";
            


            if (iSuit == 0) {
                suit = "H";
            }
            if (iSuit == 1) {
                suit = "C";
            }
            if (iSuit == 2) {
                suit = "D";
            }
            if (iSuit == 3) {
                suit = "S";
            }
           
            Card myCard = new Card(rank, suit);
          
            deck[x] = myCard;
        
        }
        decks = deck;
        shuffleDeck();
        return this;
  }

  Deck shuffleDeck(){
      
			for (int i = 51; i > 0; i--){
        int randomIndex = (int)(Math.random() * i);
        Card c = decks[i];
				decks[i] = decks[randomIndex];
        decks[randomIndex] = c;
			}
    return this;
  }
}